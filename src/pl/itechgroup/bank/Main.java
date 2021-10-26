package pl.itechgroup.bank;

public class Main {

    public static void main(String[] args) {

        //countWithWhileWithoutContinueAndBreak(1000, 10);
        countWithContinueAndBreak(1000, 10);
    }

    public static void countWithContinueAndBreak(int quantity, int divider) {

        int i = 1, j = 1;
        while (true) {
            if (i % divider == 0) {
                System.out.printf("Liczba nr %s: %s%n", j, i);
                j++;
            }
            i++;
            if (j <= quantity) {
                continue;
            } else {
                break;
            }
        }

    }

    public static void countWithWhileWithoutContinueAndBreak(int quantity, int divider) {
        int i = 1;
        int j = 1;
        while (j <= quantity) {
            if (i % divider == 0) {
                System.out.printf("Liczba nr %s: %s%n", j, i);
                j++;
            }
            i++;
        }
    }

}
