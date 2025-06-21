public class Test {
    public static void main(String[] args) {
        Book[] books = {
                new Book(101, "The Alchemist", "Paulo Coelho"),
                new Book(102, "1984", "George Orwell"),
                new Book(103, "Brave New World", "Aldous Huxley"),
                new Book(104, "Sapiens", "Yuval Noah Harari")
        };

        // Linear Search Test
        Book result1 = LibrarySearch.linearSearch(books, "1984");
        System.out.println("Linear Search Result: " + result1);

        // Binary Search Test (sort first)
        LibrarySearch.sortBooksByTitle(books);
        Book result2 = LibrarySearch.binarySearch(books, "1984");
        System.out.println("Binary Search Result: " + result2);
    }
}
