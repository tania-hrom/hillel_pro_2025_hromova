package lesson_2;

public class Main {
    private static final double CONV_K = 1.60934;

    public static void main(String[] args) {
        System.out.println("New Converter Application");

        double mi = 5;
        double km = convMiToKm(mi);
        System.out.println("Result is " + km + " kms.");
    }

    private static double convMiToKm(double mi) {
        return mi * CONV_K;
    }
}
