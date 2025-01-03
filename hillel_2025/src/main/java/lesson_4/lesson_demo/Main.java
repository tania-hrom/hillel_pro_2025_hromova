package lesson_4.lesson_demo;

public class Main {
    public static void main(String[] args) {
        System.out.println(getAuto(new Tesla()));
        System.out.println(getAuto(new DeoMatiz()));
        System.out.println(getAuto(new Toyota()));
    }

    static public int getAuto(Auto auto){
        return auto.getSpeed();
    }
}
