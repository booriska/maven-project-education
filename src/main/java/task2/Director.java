package task2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Director {

    private final Office office;
    private Random random = new Random();

    private final int enoughCandidatesToDecide = 3; // теперь это не magic number, и не стоит выбирать из одного кандидата
    private final int accountantsOnStaff = 2;

    public Director(Office office) {
        this.office = office;
    }

    public void makeDecision() {
        Hr hr = office.getHr();

        Secretary secretary = choseCandidate(hr.getSecretaries());
        if (secretary != null) {
            secretary.setEmployed(true);
            office.setSecretary(secretary);
        }

        SecurityOfficer security = choseCandidate(hr.getSecurities());
        if (security != null) {
            security.setEmployed(true);
            office.setSecurity(security);
        }

        Lawyer lawyer = choseCandidate(hr.getLawyers());
        if (lawyer != null) {
            lawyer.setEmployed(true);
            office.setLawyer(lawyer);
        }

        List<Accountant> accountants = choseSomeCandidates(hr.getAccountants(), accountantsOnStaff);
        for (Accountant accountant : accountants) {
            accountant.setEmployed(true);
        }
        office.setAccountants(accountants);

    }

    private <T extends WantAJob> T choseCandidate(List<T> candidates) {
        if (candidates.size() >= enoughCandidatesToDecide) {
            int lastIndex = candidates.size() - 1;
            T candidate = candidates.get(random.nextInt(lastIndex));
            if (candidate.makeDecision())
                return candidate;
        }
        return null;
    }

    private <T extends WantAJob> List<T> choseSomeCandidates(List<T> candidates, int maxCount) {
        List<T> list = new ArrayList<>();
        if (candidates.size() >= enoughCandidatesToDecide) { // не уверен, что это нормальное решение, но без него я на 3-м офисе ловлю зацикливание
            for (int i = 0; i < maxCount; i++) {
                T candidate = choseCandidate(candidates);
                if (candidate != null) {
                    if (list.size() > 0) {
                        if (checkDuplicates(candidate, list)) {
                            i--;
                        } else {
                            list.add(candidate);
                        }
                    } else {
                        list.add(candidate);
                    }
                } else {
                    i--;
                }
            }
        }
        return list;
    }

    private Boolean checkDuplicates(WantAJob checking, List<? extends WantAJob> list) {
        for (WantAJob object : list) {
            if (checking.equals(object))
                return true;
        }
        return false;
    }

    private Coffee makeSomeCoffee(String sort) {
        Secretary secretary = office.getSecretary();
        if (secretary != null)
            return secretary.getCoffee(sort);
        return null;
    }
}
