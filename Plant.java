public class Plant {
    private String name;
    private double price;
    private double heightInches;

    public Plant() {
        this.name = "Generic Plant";
        this.price = 0.0;
        this.heightInches = 0.0;
    }

    public Plant(String name, double price) {
        this.name = name;
        this.price = price;
        this.heightInches = 0.0;
    }

    public Plant(String name, double price, double heightInches) {
        this.name = name;
        this.price = price;
        this.heightInches = heightInches;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public double getHeightInches() {
        return heightInches;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setHeightInches(double heightInches) {
        this.heightInches = heightInches;
    }

    public String toString() {
        return "Plant: " + name + " | Price: $" + price + " | Height: " + heightInches + " in";
    }
}