package transport.driver;

import transport.Car;

public class DriverB extends Driver<Car> {


    public DriverB(String fullName, boolean hasDrivingLicense, int experience) {
        super(fullName, hasDrivingLicense, experience);
    }

    @Override
    public void startMove(Car transport) {
        transport.start();
    }

    @Override
    public void stopMove(Car transport) {
        transport.stop();
    }

    @Override
    public void refill(Car transport) {
        System.out.println("Водитель " + getFullName() + "запрявляет автомобиль " + transport.getBrand());
    }
}
