package transport.driver;

import transport.Car;
import transport.Truck;

public class DriverC extends Driver<Truck> {

    public DriverC(String fullName, boolean hasDrivingLicense, int experience) {
        super(fullName, hasDrivingLicense, experience);
    }

    @Override
    public void startMove(Truck transport) {
        transport.start();
    }

    @Override
    public void stopMove(Truck transport) {
        transport.stop();
    }

    @Override
    public void refill(Truck transport) {
        System.out.println("Водитель " + getFullName() + "запрявляет грузовик " + transport.getBrand());
    }
}
