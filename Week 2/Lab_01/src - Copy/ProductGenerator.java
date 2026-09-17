import java.io.PrintWriter;
import java.util.ArrayList;

public class ProductGenerator {

    public static void main(String[] args) {

        ArrayList<Product> products = new ArrayList<>();

        products.add(new Product("Laptop", "Gaming laptop", "P001", 1299.99));
        products.add(new Product("Mouse", "Wireless mouse", "P002", 29.99));
        products.add(new Product("Keyboard", "Mechanical keyboard", "P003", 89.99));

        try (PrintWriter out = new PrintWriter("ProductData.csv")) {
            for (Product p : products) {
                out.println(p.toCSV());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("Saved " + products.size() + " product records.");
    }
}