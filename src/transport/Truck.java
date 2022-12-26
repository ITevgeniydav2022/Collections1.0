package transport;

public class Truck extends Transport implements Competing{

    private BodyWeight bodyWeight;

    public Truck(String brand, String model, double engineVolume, BodyWeight bodyWeight) {
        super(brand, model, engineVolume);
        this.bodyWeight = bodyWeight;
    }

    public BodyWeight getBodyWeight() {
        return bodyWeight;
    }

    public void setBodyWeight(BodyWeight bodyWeight) {
        this.bodyWeight = bodyWeight;
    }

    @Override
    public void start() {
        System.out.println("Грузовик \"" + getBrand() + "\" (\"" + getModel() + "\") начал движение");
    }

    @Override
    public void stop() {
        System.out.println("Грузовик \"" + getBrand() + "\" (\"" + getModel() + "\") закончил движение");
    }

    @Override
    public void printType() {
        if (bodyWeight == null) {
            System.out.println("Данных по транспортному средству недостаточно");
        } else {
            String from = bodyWeight.getFrom() == null ? "" : "от " + bodyWeight.getFrom() + " ";
            String to = bodyWeight.getTo() == null ? "" : "до " + bodyWeight.getTo();
            System.out.println("Грузоподъемность транспортного средства: " + from + to + "тонн.");
        }
    }

    @Override
    public void repair() {
        System.out.println("Грузовик" + getBrand() + " " + getModel() + " починен!");
    }

    @Override
    public boolean diagnostics() {
        return Math.random() > 0.75;
    }

    @Override
    public String toString() {
        return "Грузовик " + super.toString();
    }

    @Override
    public void pitStop() {
        System.out.println("Автобус проехал на Пит-стоп.");
    }

    @Override
    public void bestLapTime() {
        System.out.println("Лучшее время круга " + (Math.random() * 7) + " мин.");
    }

    @Override
    public void maxSpeed() {
        System.out.println("Максимальная скорость " + (Math.random() * 120) + " км/ч.");
    }
}
