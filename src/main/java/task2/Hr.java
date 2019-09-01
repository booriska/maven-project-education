package task2;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Hr {

	private List<WantAJob> candidates = new ArrayList<>();
	private List<Secretary> secretaries = new ArrayList<>();
	private List<SecurityOfficer> securities = new ArrayList<>();
	private List<Lawyer> lawyers = new ArrayList<>();
	private List<Accountant> accountants = new ArrayList<>();

	public void interview(WantAJob candidate) {
		if (candidate.passInterview()) {
			candidates.add(candidate);
		}
	}

	public void selectCandidates() {
		secretaries = offerRequestedCandidates(Secretary.class);
		securities = offerRequestedCandidates(SecurityOfficer.class);
		lawyers = offerRequestedCandidates(Lawyer.class);
		accountants = offerRequestedCandidates(Accountant.class);
    }

	private <T extends WantAJob> List<T> offerRequestedCandidates(Class<T> clazz) {
        Map<Class<?>, List<WantAJob>> candidatesByClass = candidates.stream().collect(Collectors.groupingBy(Object::getClass));
        return (List<T>) candidatesByClass.get(clazz);
    }

	public List<WantAJob> getCandidates() {
		return candidates;
	}

    public List<Secretary> getSecretaries() {
        return secretaries;
    }

    public List<SecurityOfficer> getSecurities() {
        return securities;
    }

    public List<Lawyer> getLawyers() {
        return lawyers;
    }

    public List<Accountant> getAccountants() {
        return accountants;
    }
}