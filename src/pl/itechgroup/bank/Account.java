package pl.itechgroup.bank;

public class Account {

    String number;
    String iban;
    Long balance;

    public Account(String number, String iban, Long balance) {
        this.number = number;
        this.iban = iban;
        this.balance = balance;
    }

    public void getInfo() {
        System.out.println("Numer konta: " + number + " Iban: " + iban + " Saldo: " + balance);
    }

}
