package lesson_4.lesson_demo.incapsulation.example;

public class Toyota implements Auto {
    @Override
    public int getSpeed() {
        return 120;
    }

    @Override
    public String toString() {
        return "Toyota{}";
    }
}
