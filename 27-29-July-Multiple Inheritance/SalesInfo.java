import java.util.Scanner;
abstract class Order {
    protected int id;
    protected String description;

    public Order(int id, String description) {
        this.id = id;
        this.description = description;
    }

    public abstract void show();

    public void accept(Scanner scanner) {
        System.out.print("Enter description: ");
        description = scanner.nextLine();
    }

    public void display() {
        System.out.println("ID: " + id);
        System.out.println("Description: " + description);
    }
}

class PurchaseOrder extends Order {
    private String vendorName;

    public PurchaseOrder(int id) {
        super(id, "");
    }

    public void accept(Scanner scanner) {
        super.accept(scanner);
        System.out.print("Enter vendor name: ");
        vendorName = scanner.nextLine();
    }

    public void display() {
        super.display();
        System.out.println("Vendor Name: " + vendorName);
    }

    public void show() {
        System.out.println("Purchase Order Details:");
        display();
    }
}

// Subclass "SalesOrder"
class SalesOrder extends Order {
    private String customerName;

    public SalesOrder(int id) {
        super(id, "");
    }

    public void accept(Scanner scanner) {
        super.accept(scanner);
        System.out.print("Enter customer name: ");
        customerName = scanner.nextLine();
    }

    public void display() {
        super.display();
        System.out.println("Customer Name: " + customerName);
    }

    public void show() {
        System.out.println("Sales Order Details:");
        display();
    }
}

public class SalesInfo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        PurchaseOrder[] purchaseOrders = new PurchaseOrder[3];
        for (int i = 0; i < 3; i++) {
            purchaseOrders[i] = new PurchaseOrder(i + 1);
            System.out.println("Enter details for Purchase Order " + (i + 1) + ":");
            purchaseOrders[i].accept(scanner);
        }

        SalesOrder[] salesOrders = new SalesOrder[3];
        for (int i = 0; i < 3; i++) {
            salesOrders[i] = new SalesOrder(i + 1);
            System.out.println("Enter details for Sales Order " + (i + 1) + ":");
            salesOrders[i].accept(scanner);
        }

        // Display details
        System.out.println("Purchase Order Details:");
        for (PurchaseOrder po : purchaseOrders) {
            po.show();
            System.out.println();
        }

        System.out.println("Sales Order Details:");
        for (SalesOrder so : salesOrders) {
            so.show();
            System.out.println();
        }
    }
}