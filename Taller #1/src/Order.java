import java.util.List;

public class Order {
    // Private attributes for encapsulation
    private final int orderID;
    private final List<Product> items;
    private final Branch branch;
    private String status;

    // Constructor
    public Order(int orderID, List<Product> items, Branch branch, String status) {
        this.orderID = orderID;
        this.items = items;
        this.branch = branch;
        this.status = status;
    }

    // Overloaded constructor: uses a default status
    public Order(int orderID, List<Product> items, Branch branch) {
        this(orderID, items, branch, "PENDING");
    }

    // Methods
    public double calculateTotalPrice() {
        double total = 0.0;
        for (Product item : items) {
            total += item.getPrice();
        }
        return total;
    }

    public void addItem(Product item) {
        this.items.add(item);
    }

    public void removeItem(Product item) {
        this.items.remove(item);
    }

    public void updateStatus(String newStatus) {
        this.status = newStatus;
    }

    public String getBranchLocation() {
        return branch.getName();
    }

    public String getStatus() {
        return this.status;
    }
}