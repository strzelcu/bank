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
        StringBuilder sb = new StringBuilder();
        sb.append("Numer konta: ");
        sb.append(number);
        sb.append(" Iban: ");
        sb.append(iban);
        sb.append(" Saldo: ");
        sb.append(balance);
        System.out.println(sb);
    }

}
