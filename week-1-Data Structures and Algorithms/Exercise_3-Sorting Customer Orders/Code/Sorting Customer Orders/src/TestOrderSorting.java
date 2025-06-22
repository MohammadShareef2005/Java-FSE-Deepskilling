import java.util.Arrays;

public class TestOrderSorting {
    public static void main(String[] args) {
        Order[] orders = {
            new Order(101, "Aarav", 2999.99),
            new Order(102, "Meena", 1200.50),
            new Order(103, "Raj", 950.00),
            new Order(104, "Sara", 4599.00)
        };

        System.out.println("Original Orders:");
        printOrders(orders);

        // Bubble Sort
        Order[] bubbleSorted = Arrays.copyOf(orders, orders.length);
        OrderSorter.bubbleSort(bubbleSorted);
        System.out.println("\nOrders after Bubble Sort:");
        printOrders(bubbleSorted);

        // Quick Sort
        Order[] quickSorted = Arrays.copyOf(orders, orders.length);
        OrderSorter.quickSort(quickSorted, 0, quickSorted.length - 1);
        System.out.println("\nOrders after Quick Sort:");
        printOrders(quickSorted);
    }

    public static void printOrders(Order[] orders) {
        for (Order order : orders) {
            System.out.println(order);
        }
    }
}
