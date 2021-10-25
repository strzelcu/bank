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
        System.out.println("Imię: " + name + " Nazwisko: " + surname + " PESEL: " + pesel + " Adres: " + address);
    }
}
