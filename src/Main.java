import java.util.ArrayList;

public class Main {
    private static ArrayList<Order> allOrders = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println("=== Food Ordering System ===");
        System.out.println("\nCreating orders and adding items...");

        createSampleOrders();

        System.out.println("\nOrder Results:");
        for (Order order : allOrders) {
            order.displayOrder();
        }

        System.out.println("\nTotal orders created: " + allOrders.size());
        Order largest = getLargestOrder();
        if (largest != null) {
            System.out.printf("Largest order: %s ($%.2f)%n",
                    largest.getCustomerName(), largest.getTotal());
        }
    }


    private static void createSampleOrders() {
        Order o1 = new Order("Alice Johnson");
        try {
            o1.addItem("Pizza", 10.50);
            o1.addItem("Burger", 8.99);
            o1.addItem("Fries", 5.25);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        Order o2 = new Order("Bob Smith");
        try {
            o2.addItem("Burger", 7.75);
            o2.addItem("Fries", 4.25);
            o2.addItem("Pizza", 10.50);
            o2.addItem("Soda", 3.95);
            o2.addItem("Ice Cream", 6.00);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        Order o3 = new Order("Charlie Brown");
        try {
            o3.addItem("Nuggets", 8.50);
            o3.addItem("Fries", 7.00);
            // Simulate invalid input
            o3.addItem("", 5.00);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            o3.addItem("Soda", 0);  // Invalid price
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        allOrders.add(o1);
        allOrders.add(o2);
        allOrders.add(o3);
    }

    private static Order getLargestOrder() {
        if (allOrders.isEmpty()) return null;

        Order largest = allOrders.get(0);
        for (Order order : allOrders) {
            if (order.getTotal() > largest.getTotal()) {
                largest = order;
            }
        }
        return largest;
    }
}
