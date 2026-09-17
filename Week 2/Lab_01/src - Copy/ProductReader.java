import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class ProductReader {

    public static ArrayList<Product> readFile(String filename) {
        ArrayList<Product> products = new ArrayList<>();

        try (Scanner in = new Scanner(new File(filename))) {
            while (in.hasNextLine()) {
                String line = in.nextLine();
                String[] fields = line.split(",");

                Product p = new Product(
                        fields[0],
                        fields[1],
                        fields[2],
                        Double.parseDouble(fields[3])
                );

                products.add(p);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return products;
    }
}
