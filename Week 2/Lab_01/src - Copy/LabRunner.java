public class LabRunner {

    public static void main(String[] args) {

        System.out.println("=== Generating Person Data ===");
        PersonGenerator.main(null);

        System.out.println("=== Reading Person Data ===");
        var people = PersonReader.readFile("PersonData.csv");
        for (Person p : people) {
            System.out.println(p);
        }

        System.out.println("\n=== Generating Product Data ===");
        ProductGenerator.main(null);

        System.out.println("=== Reading Product Data ===");
        var products = ProductReader.readFile("ProductData.csv");
        for (Product p : products) {
            System.out.println(p);
        }

        System.out.println("\n=== Lab Complete ===");
    }
}