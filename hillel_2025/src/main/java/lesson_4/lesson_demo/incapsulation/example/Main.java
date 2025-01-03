package lesson_4.lesson_demo.incapsulation.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println(getAuto(new Tesla()));
        System.out.println(getAuto(new DeoMatiz()));
        System.out.println(getAuto(new Toyota()));

        Policeman policeman = new Policeman();
        List<Auto> autos = new ArrayList<>();
        autos.add(new Tesla());
        autos.add(new DeoMatiz());
        autos.add(new Toyota());
        policeman.checkSpeed(autos);
    }

    static public int getAuto(Auto auto) {
        return auto.getSpeed();
    }
}
