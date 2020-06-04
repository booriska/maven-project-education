package task2;

import task1.BirthDate;
import task1.Person;

import java.util.HashSet;
import java.util.Set;


public class Director extends Person implements MailSender{
    BadBehavior badBehavior;
    GoodBehavior goodBehavior;
    private Office officeImIn;

    public Director(String name) {
        super(null, new BirthDate());
    }

    public Director(String name, Office office) {
        this(name);
        officeImIn = office;
    }

    // TODO: 5/22/20 не и спользуй статические методы


    // TODO: 5/24/20 точка запуска должна быть одна в задаче, если хочешь протестировать переноси в тесты
    public static void main(String[] args) {

    }


    @Override
    public void sendMail(Mail mail) {
        officeImIn.secretary.sendMail(mail);
    }

}
