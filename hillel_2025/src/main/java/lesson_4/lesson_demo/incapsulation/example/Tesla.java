package lesson_4.lesson_demo.incapsulation.example;

public class Tesla implements Auto {
    private int moveToCurrentSpeed;

    public Tesla() {
        this.moveToCurrentSpeed = 180;
    }

    @Override
    public int getSpeed() {
        return moveToCurrentSpeed;
    }

    @Override
    public String toString() {
        return "Tesla{" +
                "moveToCurrentSpeed=" + moveToCurrentSpeed +
                '}';
    }
}
