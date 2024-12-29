package lesson_3;

public class Main {
    private static final double CONV_K = 1.8;

    public static void main(String[] args) {
        System.out.println("F into C Converter Application");
        double f = 5;
        double c = convFToC(f);
        System.out.println("Result is " + c + " C.");

        System.out.println("C into F Converter Application");
        c = 5;
        f = convCToF(c);
        System.out.println("Result is " + f + " F.");
    }

    private static double convFToC(double f) {
        return (f - 32) / CONV_K;
    }

    private static double convCToF(double c) {
        return (c * CONV_K) + 32;
    }
}
