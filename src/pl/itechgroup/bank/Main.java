package pl.itechgroup.bank;

public class Main {

    public enum DniTygodnia {
        PN("PN", "Poniedziałek", 1),
        WT("WT", "Wtorek", 2),
        SR("SR", "Środa", 3),
        CZ("CZ", "Czwartek", 4),
        PT("PT", "Piątek", 5),
        SB("SB", "Sobota", 6),
        ND("ND", "Niedziela", 7);

        String code;
        String name;
        int number;

        DniTygodnia(String code, String name, int number) {
            this.code = code;
            this.name = name;
            this.number = number;
        }

    }

    public static void main(String[] args) {

        for (DniTygodnia dzien:
             DniTygodnia.values()) {
            System.out.println(dzien.name);
            switch (dzien.number) {
                case 6:
                case 7:
                    System.out.println("Weekend!");
                    break;
                default:
                    System.out.println("Niestety musisz jeszcze popracować");
            }
        }

    }
}
