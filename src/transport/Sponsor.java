package transport;

public class Sponsor {

    private final String name;
    private final int supportAmount;

    public Sponsor(String name, int supportAmount) {
        this.name = name;
        this.supportAmount = supportAmount;
    }

    public String getName() {
        return name;
    }

    public int getSupportAmount() {
        return supportAmount;
    }

    public void toSponsorRace() {
        System.out.printf("Спонсор \"%s\" проспонсировал заезд на %d%n", name, supportAmount);
    }

    @Override
    public String toString() {
        return name +
                ", сумма поддержки: " + supportAmount + " руб.";
    }
}
