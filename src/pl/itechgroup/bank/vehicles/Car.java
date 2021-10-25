package pl.itechgroup.bank.vehicles;

public class Car {

    double enginePower;
    public String registrationNumber;
    String vinNumber;

    public Car() {

    }

    public Car(double enginePower, String registrationNumber, String vinNumber) {
        this.enginePower = enginePower;
        this.registrationNumber = registrationNumber;
        this.vinNumber = vinNumber;
    }

    public Car(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }



    public void drive() {
        long speed = 120L;
        System.out.println("Car with registration number "
                + registrationNumber + " is driving with speed " + speed);
    }

    public void park() {
        System.out.println("Car is parked");
    }

    public void showRegistrationNumber(Car car) {
        car.registrationNumber = "HJP 1234";
        System.out.println("Nr rejestracyjny = " + car.registrationNumber);
    }

}
