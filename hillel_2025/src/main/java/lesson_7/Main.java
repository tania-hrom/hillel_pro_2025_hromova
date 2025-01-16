package lesson_7;

public class Main {

    public static void main(String[] args) {
        Corrector corrector = new Corrector();

        DataProvider dataProvider = new DataProvider();
        String[] data = dataProvider.getData();

        getOutput(corrector.handleData(data));
    }

    private static void getOutput(String output) {
        System.out.println(output);
    }
}