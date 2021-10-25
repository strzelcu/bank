package pl.itechgroup.bank;

import java.time.LocalDate;
import java.util.Date;

public class Transfer {

    Long ammount;
    LocalDate date;

    public Transfer(Long ammount, LocalDate date) {
        this.ammount = ammount;
        this.date = date;
    }

    public void getInfo() {
        System.out.println("Transfer with ammount " + ammount + " on " + date.toString());
    }
}
