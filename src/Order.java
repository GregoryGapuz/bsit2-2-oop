import java.util.ArrayList;

public class Order {
    private String customerName;
    private ArrayList<String> items;
    private ArrayList<Double> prices;

    public Order(String customerName) {
        this.customerName = customerName;
        this.items = new ArrayList<>();
        this.prices = new ArrayList<>();
    }

    public void addItem(String itemName, double price) throws IllegalArgumentException {
        if (itemName == null || itemName.trim().isEmpty()) {
            throw new IllegalArgumentException("Invalid item: cannot be empty");
        }
        if (price <= 0) {
            throw new IllegalArgumentException("Invalid price: must be greater than 0");
        }

        items.add(itemName);
        prices.add(price);
        System.out.println("Item '" + itemName + "' added successfully");
    }

    public int getItemCount() {
        return items.size();
    }

    public double getTotal() {
        double total = 0;
        for (double price : prices) {
            total += price;
        }
        return total;
    }

    public String getOrderSize() {
        int count = getItemCount();
        if (count <= 2) return "Small";
        else if (count <= 4) return "Medium";
        else return "Large";
    }

    public String getCustomerName() {
        return customerName;
    }

    public void displayOrder() {
        System.out.printf("Order for %s: %d items, Total: $%.2f, Size: %s%n",
                customerName, getItemCount(), getTotal(), getOrderSize());
    }
}
