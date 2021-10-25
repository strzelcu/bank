package pl.itechgroup.bank;

public class Main {

    public static void main(String[] args) {
        //        showOddNumbersWhile();
        showOddNumbersFor();
    }

    static void showOddNumbersFor() {
        for (int i = 1; i < 1000; i += 2) {
            System.out.println(i);
        }
    }

    static void showOddNumbersWhile() {
        int i = 1;
        while (i < 1000) {
            System.out.println(i);
            i += 2;
        }
    }
}
