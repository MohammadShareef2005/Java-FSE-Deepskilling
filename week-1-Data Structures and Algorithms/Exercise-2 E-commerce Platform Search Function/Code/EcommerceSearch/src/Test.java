import java.util.Arrays;
import java.util.Comparator;

public class Test {
    public static void main(String[] args) {
        Product[] products = {
            new Product(101, "Laptop", "Electronics"),
            new Product(102, "Phone", "Electronics"),
            new Product(103, "Shoes", "Footwear"),
            new Product(104, "Watch", "Accessories")
        };

        // Linear Search
        Product result1 = SearchAlgorithms.linearSearch(products, "Shoes");
        System.out.println("Linear Search Result: " + result1);

        // Sort for Binary Search
        Arrays.sort(products, Comparator.comparing(p -> p.productName));

        // Binary Search
        Product result2 = SearchAlgorithms.binarySearch(products, "Shoes");
        System.out.println("Binary Search Result: " + result2);
    }
}
