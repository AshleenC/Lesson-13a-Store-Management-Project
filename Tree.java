public class Tree extends Plant {
    private String type;

    public Tree() {
        super();
        this.type = "Outdoor";
    }

    public Tree(String name, double price, double heightInches, String type) {
        super(name, price, heightInches);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String toString() {
        return super.toString() + " | Type: " + type;
    }
}