package lesson_1;

public class Main {

    private static final double CONV_K = 2.20462;

    public static void main(String[] args) {
        System.out.println("Converter Application");

        double kgs = 5;
        double pounds = convKgsToPounds(kgs);
        System.out.println("Result is " + pounds + " pounds.");
    }
    //test comment

    private static double convKgsToPounds(double kgs) {
        return kgs * CONV_K;
    }
}