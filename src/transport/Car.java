package transport;

public class Car extends Transport implements Competing{

    private TypeBody typeBody;

    public Car(String brand, String model, double engineVolume, TypeBody typeBody) {
        super(brand, model, engineVolume);
        this.typeBody = typeBody;
    }

    public TypeBody getTypeBody() {
        return typeBody;
    }

    public void setTypeBody(TypeBody typeBody) {
        this.typeBody = typeBody;
    }

    @Override
    public void start() {
        System.out.println("Автомобиль \"" + getBrand() + "\" (\"" + getModel() + "\") начал движение");
    }

    @Override
    public void stop() {
        System.out.println("Автомобиль \"" + getBrand() + "\" (\"" + getModel() + "\") закончил движение");
    }

    @Override
    public void printType() {
        if (typeBody == null) {
            System.out.println("Данных по транспортному средству недостаточно");
        } else {
            System.out.println("Тип кузова транспортного средства: " + typeBody);
        }
    }

    @Override
    public boolean diagnostics() {
        return Math.random() > 0.8;
    }

    @Override
    public void repair() {
        System.out.println("Автомобиль " + getBrand() + " " + getModel() + " починен!");
    }

    @Override
    public String toString() {
        return "Легковой автомобиль " + super.toString();
    }

    @Override
    public void pitStop() {
        System.out.println("Автомобиль проехал на Пит-стоп.");
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
