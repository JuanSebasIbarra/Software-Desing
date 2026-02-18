import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Branch engineeringBranch = new Branch("Central Cafeteria - Engineering");
        Branch medicineBranch = new Branch("North Cafeteria - Medicine");

        Product coffee = new Product("Black Coffee", 2500.0);
        Product patty = new Product("Pipian Patty", 3000.0);
        Product juice = new Product("Natural Juice", 4000.0);

        List<Product> orderItems1 = new ArrayList<>();
        orderItems1.add(coffee);
        orderItems1.add(patty);

        Order order1 = new Order(101, orderItems1, engineeringBranch);

        // Usar medicineBranch y juice creando una segunda orden
        List<Product> orderItems2 = new ArrayList<>();
        orderItems2.add(juice);

        Order order2 = new Order(102, orderItems2, medicineBranch);

        System.out.println("--- ORDER MANAGEMENT ---");
        System.out.println("Branch: " + order1.getBranchLocation());
        System.out.println("Initial Status: " + order1.getStatus());

        double total = order1.calculateTotalPrice();
        System.out.println("Total to pay: $" + total);

        order1.updateStatus("IN PREPARATION");
        System.out.println("New Status: " + order1.getStatus());

        System.out.println("-------------------------");

        // Mostrar resumen de la segunda orden
        System.out.println("Order 2 Branch: " + order2.getBranchLocation());
        System.out.println("Order 2 Total: $" + order2.calculateTotalPrice());
        System.out.println("Order 2 Status: " + order2.getStatus());

    }
}