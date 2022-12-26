package transport.driver;

import transport.Transport;

public abstract class Driver<T extends Transport> {

    private final String fullName;
    private boolean hasDrivingLicense;
    private int experience;

    public Driver(String fullName, boolean hasDrivingLicense, int experience) {
        this.fullName = fullName;
        this.hasDrivingLicense = hasDrivingLicense;
        this.experience = experience;
    }

    public String getFullName() {
        return fullName;
    }

    public boolean isHasDrivingLicense() {
        return hasDrivingLicense;
    }

    public void setHasDrivingLicense(boolean hasDrivingLicense) {
        this.hasDrivingLicense = hasDrivingLicense;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public abstract void startMove(T transport);

    public abstract void stopMove(T transport);

    public abstract void refill(T transport);

    public void printInfo(T transport) {
        System.out.println("Водитель " + fullName + "управляет автомобилем "
                + transport.getBrand() + " и будет учавствовать в заезде.");
        transport.printType();
    }

    @Override
    public String toString() {
        return fullName +
                ", стаж вождения: " + experience + " лет.";
    }
}
