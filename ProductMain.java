import java.util.Comparator;
import java.util.TreeSet;

public class ProductMain {

    public static void main(String[] args) {

        TreeSet<Product> products =
                new TreeSet<>(Comparator.comparingInt(Product::getProID));

        products.add(new Product(105, "Laptop", 55000, 5));
        products.add(new Product(102, "Mobile", 25000, 10));
        products.add(new Product(110, "Keyboard", 1200, 20));
        products.add(new Product(101, "Mouse", 800, 15));
        products.add(new Product(108, "Monitor", 15000, 8));
        products.add(new Product(106, "Printer", 12000, 4));
        products.add(new Product(109, "Speaker", 2500, 12));
        products.add(new Product(104, "Headphone", 1800, 18));
        products.add(new Product(103, "Webcam", 2200, 7));
        products.add(new Product(107, "Pendrive", 500, 25));

        for (Product product : products) {
            System.out.println(product);
        }
    }
}