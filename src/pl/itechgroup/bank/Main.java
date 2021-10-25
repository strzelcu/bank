package pl.itechgroup.bank;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Account account = new Account("46105000026844962054474685", "PL46105000026844962054474685", 1000L);
        account.getInfo();

        Person person = new Person("Tomasz", "Strzelecki", 89040312312L, "Oleska 121, Opole");
        person.getInfo();

        Transfer transfer = new Transfer(200L, LocalDate.of(2021, 10, 25));
        transfer.getInfo();
    }
}
