package task2;

import java.util.List;
import java.util.Random;

public class Director {

    private Random randomChoose;

    public void chooseSecretary(List<Secretary> secretaries) {
        randomChoose = new Random();
        String string = "Director chose: ";
        System.out.println(string + secretaries.get(randomChoose.nextInt(secretaries.size() - 1)));
    }

}
