package task2.Animals;

import java.util.ArrayList;
import java.util.List;

public class Hospital {

    public PlayGrownd playGrownd;

    public Hospital(PlayGrownd playGrownd) {
        this.playGrownd = playGrownd;
    }

    // TODO: 6/8/20 я могу себе представить Госпиталь с игровой плащадкой, но что она заежает в него одновременно с животными с трудом
    public void invite(List <Animals> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println("Vaccinated " + list.get(i));
            playGrownd.invite(list.get(i));
        }
        }
}
