package pl.itechgroup.bank;

import java.time.LocalDate;

public class Transfer {

    Long ammount;
    LocalDate date;

    public Transfer(Long ammount, LocalDate date) {
        this.ammount = ammount;
        this.date = date;
    }

    public void getInfo() {
        System.out.println(String.join(" ", "Transfer with ammount", String.valueOf(ammount), "on", date.toString()));
    }
}
