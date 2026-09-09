import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Scanner;

public class ProductWriter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<String> products = new ArrayList<>();

        boolean done = false;
        while (!done) {
            String id = SafeInput.getNonZeroLenString(in,"Enter ID");
            String name = SafeInput.getNonZeroLenString(in,"Enter Product Name");
            String desc = SafeInput.getNonZeroLenString(in,"Enter Description");
            double cost = SafeInput.getDouble(in,"Enter Cost");

            String record = String.format("%s, %s, %s, %.2f", id, name, desc, cost);
            products.add(record);

            done = !SafeInput.getYNConfirm(in,"Add another product?");
        }

        String fileName = SafeInput.getNonZeroLenString(in,"Enter file name to save (e.g., ProductTestData.txt)");

        try (BufferedWriter writer = Files.newBufferedWriter(Path.of(fileName))) {
            for (String p : products) {
                writer.write(p);
                writer.newLine();
            }
            System.out.println("File saved: " + fileName);
        } catch (IOException e) {
            System.out.println("Error writing file: " + e.getMessage());
        }
    }
}
