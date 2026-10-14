public class Succulent extends Plant {
    private int waterIntervalDays;

    public Succulent() {
        super();
        this.waterIntervalDays = 14;
    }

    public Succulent(String name, double price, double heightInches, int waterIntervalDays) {
        super(name, price, heightInches);
        this.waterIntervalDays = waterIntervalDays;
    }

    public int getWaterIntervalDays() {
        return waterIntervalDays;
    }

    public void setWaterIntervalDays(int waterIntervalDays) {
        this.waterIntervalDays = waterIntervalDays;
    }

    public String toString() {
        return super.toString() + " | Water Every: " + waterIntervalDays + " days";
    }
}