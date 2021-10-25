package pl.itechgroup.bank;

import static pl.itechgroup.bank.vehicles.Truck.WHEEL_COUNT;
import static pl.itechgroup.bank.vehicles.Truck.honk;

import pl.itechgroup.bank.vehicles.Car;

public class Main {

    private enum DniTygodnia {
        PON,
        WT,
        SR,
        CZW,
        PT,
        SB,
        ND
    }

    private static class Data {
        int dzien, miesiac, rok;
    }

    public static void main(String[] args) {
        // primitive types
        boolean isNiceWeatherOutside = true;
        Integer zmienna = new Integer(10);
        String strinowanie = new String("Ciąg tekstowy");
        String ciekawostka = 1+2+"3"+4+5;
        System.out.println(ciekawostka);
        System.out.println(DniTygodnia.PON);
        Data data = new Data();
        data.dzien = 25;
        data.miesiac = 10;
        data.rok = 2021;
        Car samochod = new Car("OST68SL");
        samochod.drive();
        samochod.park();
        int lol = WHEEL_COUNT;
        honk();
        pl.itechgroup.bank.gps.Car carGps =
                new pl.itechgroup.bank.gps.Car();

        samochod.showRegistrationNumber(samochod);
        System.out.println(samochod.registrationNumber);
    }
}
