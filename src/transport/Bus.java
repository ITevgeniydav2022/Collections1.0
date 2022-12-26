package transport;

public class Bus extends Transport implements Competing{

    private Capacity capacity;

    public Bus(String brand, String model, double engineVolume, Capacity capacity) {
        super(brand, model, engineVolume);
        this.capacity = capacity;
    }

    public Capacity getCapacity() {
        return capacity;
    }

    public void setCapacity(Capacity capacity) {
        this.capacity = capacity;
    }

    @Override
    public void start() {
        System.out.println("Автобус \"" + getBrand() + "\" (\"" + getModel() + "\") начал движение");
    }

    @Override
    public void stop() {
        System.out.println("Автобус \"" + getBrand() + "\" (\"" + getModel() + "\") закончил движение");
    }

    @Override
    public void printType() {
        if (capacity == null) {
            System.out.println("Данных по транспортному средству недостаточно");
        } else {
            System.out.println("Вместимость транспортного средства: от " + capacity.getFrom() + " до "
                    + capacity.getTo() + " чел.");
        }
    }

    @Override
    public void repair() {
        System.out.println("Автобус " + getBrand() + " " + getModel() + " починен.");
    }

    @Override
    public boolean diagnostics() {
        System.out.println("Диагностика автобусу " + getBrand() + " " + getModel() + " не требуется");
        return true;
    }

    @Override
    public String toString() {
        return "Автобус " + super.toString();
    }

    @Override
    public void pitStop() {
        System.out.println("Автобус проехал на Пит-стоп.");
    }

    @Override
    public void bestLapTime() {
        Math.random();
    }

    @Override
    public void maxSpeed() {
        Math.random();
    }


}
