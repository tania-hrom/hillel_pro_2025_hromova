package lesson_4.lesson_demo.composition;

public class Auto {
    private Doors doors;
    private Wheels wheels;
    private Breaks breaks;

    public Auto() {
        doors = new Doors();
        wheels = new Wheels();
        breaks = new Breaks();
    }
}
