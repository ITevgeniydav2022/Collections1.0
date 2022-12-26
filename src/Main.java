import transport.*;
import transport.driver.Driver;
import transport.driver.DriverB;
import transport.driver.DriverC;
import transport.driver.DriverD;

import java.util.*;

public class Main {

    private static final List<String> NAMES = List.of(
            "Брюс Уэйн",
            "Фрол Игнашевич",
            "Человек Паук",
            "Севостьян Смутьянович",
            "Железный челове",
            "Лариса Тамада",
            "Атон Патрон",
            "Сергей Эгегей",
            "Дмитрий Лисовский-Волосовский",
            "Крокадил Гена"
    );

    private static final Random RANDOM = new Random();
    private static final int MAX_SIZE = 4;

    public static void main(String[] args) {


        //boolean success = Data.validate("test", "test", "test");
        //if (success) {
        //    System.out.println("Данные валидны");
        //} else {
        //    System.out.println("Данные не валидны");
        //}


        // Задание 1,2
        System.out.println("Задание 1,2");

        Mechanic<Car> djuzeppe = new Mechanic<>("Джузеппе ", "Сильвестров", " ChupaCups");
        Sponsor cocaCola = new Sponsor("CocaCola", 200_000);
        Car lada = new Car("Lada", "Granta", 2.2, TypeBody.SEDAN);
        lada.addDriver(new DriverB("Евгений ", true, 10));
        lada.addMechanic(djuzeppe);
        lada.addSponsor(cocaCola);

        Mechanic<Car> antonio = new Mechanic<>("Антонио ", "Пупков", " KFC");
        Sponsor tamaguchi = new Sponsor("Тамагочи", 300_000);
        Sponsor dolchi = new Sponsor("Дольчи Габана", 300_000);
        Car audi = new Car("Audi", "A8 50 L TDI quattro", 3.0, TypeBody.SEDAN);
        audi.addDriver(new DriverB("Дмитрий ", true, 12));
        audi.addMechanic(antonio);
        audi.addSponsor(tamaguchi, dolchi);

        Car bmw = new Car("BMW", "Z8", 3.0, TypeBody.CROSSOVER);
        Car kia = new Car("KIA", "Sportage", 2.4, TypeBody.HATCHBACK);

        //diagnostics(lada, audi, bmw, kia);

        ///System.out.println(lada);
        ///System.out.println(audi);
        ///System.out.println(bmw);
        ///System.out.println(kia);

        System.out.println(" ");
        Mechanic<Bus> sergio = new Mechanic<Bus>("Серджио ", "Островский", " Intel");
        Sponsor lego = new Sponsor("LEGO", 500_000);
        Bus liaz = new Bus("ЛиАЗ", "677", 190, Capacity.MEDIUM);
        liaz.addDriver(new DriverD("Евпатий ", true, 5));
        liaz.addMechanic(sergio);
        liaz.addSponsor(lego);
        Bus uaz = new Bus("УАЗ", "452Д", 180, Capacity.SMALL);
        Bus laz = new Bus("ЛАЗ", "695М", 160, Capacity.EXTRA_LARGE);
        Bus ikarus = new Bus("Икарус", "280", 190, Capacity.MEDIUM);

        //diagnostics(liaz, uaz, laz, ikarus);

        ///System.out.println(liaz);
        ///System.out.println(uaz);
        ///System.out.println(laz);
        ///System.out.println(ikarus);

        System.out.println(" ");
        Mechanic<Truck> pedro = new Mechanic<Truck>("Педро ", "Гонзалес", " IBM");
        Sponsor sever = new Sponsor("Север", 500_000);
        Truck kamaz = new Truck("КАМАЗ", "Мастер", 980, BodyWeight.N1);
        kamaz.addDriver(new DriverC("Акакий ", true, 8));
        kamaz.addMechanic(pedro);
        kamaz.addSponsor(sever);
        Truck maz = new Truck("МАЗ", "6440 RR", 1000, BodyWeight.N3);
        Truck iveco = new Truck("IVECO", "695М", 980, BodyWeight.N2);
        Truck tatra = new Truck("Tatra", "280", 1000, BodyWeight.N3);

        //diagnostics(kamaz, maz, iveco, tatra);

        ///System.out.println(kamaz);
        ///System.out.println(maz);
        ///System.out.println(iveco);
        ///System.out.println(tatra);
        ///kamaz.start();
        ///kamaz.stop();
        ///kamaz.pitStop();
        ///kamaz.bestLapTime();
        ///kamaz.maxSpeed();

        System.out.println(" ");

        ///DriverB evgeniy = new DriverB("Евгений ", true, 10);
        ///DriverC akakiy = new DriverC("Акакий ", true, 8);
        //DriverD evpatiy = new DriverD("Евпатий ", true, 3);

        List<Transport> transports = List.of(lada, audi, liaz, kamaz);

        ServiceStation serviceStation = new ServiceStation();
        serviceStation.addCar(lada);
        serviceStation.addCar(audi);
        serviceStation.addTruck(kamaz);
        serviceStation.service();
        serviceStation.service();

        System.out.println(" ");

        for (Transport transport : transports) {
            printInfo(transport);
        }

        ///evgeniy.startMove(audi);
        ///evgeniy.stopMove(audi);
        ///evgeniy.refill(audi);
        ///evgeniy.printInfo(audi);
///
        ///akakiy.startMove(maz);
        ///akakiy.stopMove(maz);
        ///akakiy.refill(maz);
        ///akakiy.printInfo(maz);
///
        ///evpatiy.startMove(ikarus);
        ///evpatiy.stopMove(ikarus);
        ///evpatiy.refill(ikarus);
        ///evpatiy.printInfo(ikarus);
        //Задание 3
        System.out.println("Задание 3");

        Queue<String> queue1 = new ArrayDeque<>();
        Queue<String> queue2 = new ArrayDeque<>();
        randomFilling(queue1);
        randomFilling(queue2);
        System.out.println("Первая очередь: " + queue1);
        System.out.println("Вторая очередь: " + queue2);
        System.out.println();

        add("Педро Паскулле", queue1, queue2);
        System.out.println("Первая очередь: " + queue1);
        System.out.println("Вторая очередь: " + queue2);
        System.out.println();

        remove(queue1, queue2);
        System.out.println("Первая очередь: " + queue1);
        System.out.println("Вторая очередь: " + queue2);
        System.out.println();

        // Задание 4
        System.out.println("Задание 4");
        example();
        example1();
    }

    private static void printInfo(Transport transport) {
        System.out.println("Информация по автомобилю: " + transport.getBrand() + " " + transport.getModel());
        System.out.println("Водители: " + transport.getDrivers());
        System.out.println("Механики: " + transport.getMechanics());
        System.out.println("Спонсоры: " + transport.getSponsors());
        System.out.println();
    }

    private static void diagnostics(Transport... transports) {
        for (Transport transport : transports) {
            diagnosticsTransport(transport);
        }
    }

    private static void diagnosticsTransport(Transport transport) {
        try {
            if (!transport.diagnostics()) {
                throw new RuntimeException("Автомобиль " + transport.getBrand()
                        + " " + transport.getModel() + " не прошел диагностику!");
            }
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void example() {
        List<List<String>> biDemArrList = new ArrayList<>();
        for (int i = 0; i < 8; i++) {
            biDemArrList.add(i, new ArrayList<>());
            for (int j = 0; j < 8; j++) {
                biDemArrList.get(i).add(j, ((i+j) % 2 == 1 ? "●" : "◯"));
            }
        }
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(biDemArrList.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }

    private static void example1() {
        List<List<Integer>> biDemArrList = new ArrayList<>();

        for (int i = 0; i < 8; i++) {
            biDemArrList.add(i, new ArrayList<>());
            for (int j = 0; j < 8; j++) {
                if (i % 2 == 0 && j % 2 == 0) {
                    biDemArrList.get(i).add(j, 1);
                } else if (i % 2 != 0 && j % 2 != 0) {
                    biDemArrList.get(i).add(j, 1);
                } else {
                    biDemArrList.get(i).add(j, 0);
                }
            }
        }
        for (int i = 0; i < 8; i++) {
            System.out.print("\n");
            for (int j = 0; j < 8; j++) {
                System.out.print(biDemArrList.get(i).get(j) + " ");
            }
        }
    }

    private static void add(String name,
                            Queue<String> queue1,
                            Queue<String> queue2) {

        if (queue1.size() == MAX_SIZE && queue2.size() == MAX_SIZE) {
            System.out.println("Нужно крикнуть Галю! ");
            return;
        }

        if (queue1.size() < queue2.size()) {
            queue1.offer(name);
        } else {
            queue2.offer(name);
        }
    }

    private static void remove(Queue<String> queue1,
                               Queue<String> queue2) {
        if (RANDOM.nextBoolean()) {
            queue1.poll();
        } else {
            queue2.poll();
        }
    }

    private static void randomFilling(Queue<String> queue) {
        int size = RANDOM.nextInt(MAX_SIZE + 1);
        for (int i = 0; i < size; i++) {
            queue.offer(NAMES.get(RANDOM.nextInt(NAMES.size())));
        }
    }


}