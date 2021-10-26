package pl.itechgroup.bank;

public class Main {

    public static void main(String[] args) {

        Object[][] table = new Object[][] { new Integer[] { 1, 2, 3, 4, 5 }, new Boolean[] { true, false, true, false }, new String[] { "Tak", "Nie", "Tak" } };

        for (Object[] objects : table) {
            for (Object object : objects) {
                System.out.println(object);
            }
        }

    }

}
