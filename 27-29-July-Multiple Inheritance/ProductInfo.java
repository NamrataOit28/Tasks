import java.util.Scanner;
interface ProductMarker {
}
class Product implements ProductMarker {
    private int productId;
    private String productName;
    private double productCost;
    private int productQuantity;

    public Product() {
        this.productId = 0;
        this.productName = "";
        this.productCost = 0.0;
        this.productQuantity = 0;
    }

    public Product(int productId, String productName, double productCost, int productQuantity) {
        this.productId = productId;
        this.productName = productName;
        this.productCost = productCost;
        this.productQuantity = productQuantity;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getProductCost() {
        return productCost;
    }

    public void setProductCost(double productCost) {
        this.productCost = productCost;
    }

    public int getProductQuantity() {
        return productQuantity;
    }

    public void setProductQuantity(int productQuantity) {
        this.productQuantity = productQuantity;
    }

    public void displayProductDetails() {
        System.out.println("Product ID: " + productId);
        System.out.println("Product Name: " + productName);
        System.out.println("Product Cost: " + productCost);
        System.out.println("Product Quantity: " + productQuantity);
    }
}

public class ProductInfo{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of products: ");
        int numProducts = scanner.nextInt();

        Product[] products = new Product[numProducts];

        for (int i = 0; i < numProducts; i++) {
            System.out.println("Enter details for product " + (i + 1));

            System.out.print("Enter product ID: ");
            int productId = scanner.nextInt();

            System.out.print("Enter product name: ");
            String productName = scanner.next();

            System.out.print("Enter product cost: ");
            double productCost = scanner.nextDouble();

            System.out.print("Enter product quantity: ");
            int productQuantity = scanner.nextInt();

            Product product = new Product(productId, productName, productCost, productQuantity);

            products[i] = product;
        }

        for (Product product : products) {
            product.displayProductDetails();
            System.out.println();
        }
    }
}