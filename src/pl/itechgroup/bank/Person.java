package pl.itechgroup.bank;

public class Person {

    String name;
    String surname;
    Long pesel;
    String address;

    public Person(String name, String surname, Long pesel, String address) {
        this.name = name;
        this.surname = surname;
        this.pesel = pesel;
        this.address = address;
    }

    public void getInfo() {
        System.out.println(String.format("Imię: %s Nazwisko: %s PESEL: %s Adres %s", name, surname, pesel, address));
    }
}
