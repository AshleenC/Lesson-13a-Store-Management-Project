import java.util.Scanner;

public class StoreRunner {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        Flower rose = new Flower("Red Rose", 12.50, 10.0, "Red");
        Succulent aloe = new Succulent("Aloe Vera", 8.99, 6.5, 14);
        Tree oak = new Tree("Baby Oak", 45.00, 36.0, "Outdoor");

        System.out.println("\n -- PLANT MENU -- ");
        System.out.println(rose.toString());
        System.out.println(aloe.toString());
        System.out.println(oak.toString());

        aloe.setWaterIntervalDays(21);
        System.out.println("\nUpdated Aloe Water Interval: " + aloe.getWaterIntervalDays() + " days");
        System.out.println(aloe.toString());

        input.close();
    }
}