public class Flower extends Plant {
    private String color;

    public Flower() {
        super();
        this.color = "Red";
    }

    public Flower(String name, double price, double heightInches, String color) {
        super(name, price, heightInches);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String toString() {
        return super.toString() + " | Color: " + color;
    }
}