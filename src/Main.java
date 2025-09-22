public class Main {
    public static void main(String[] args) {
        System.out.println("=== Library Management System ===\n");

        // Create books (some valid, one with invalid data for testing)
        try {
            Book b1 = new Book("Java Programming", "John Smith", "1234567890", 2020);
            Book b2 = new Book("Data Structures", "Jane Doe", "9876543210", 2019);
            Book b3 = new Book("Web Development", "Mike Johnson", "5555666677", 2021);

            Library library = new Library();

            // Add books
            library.addBook(b1);
            library.addBook(b2);
            library.addBook(b3);

            System.out.println();
            library.displayAllBooks();

            System.out.println("\nBorrowing Java Programming...");
            library.borrowBook("1234567890");

            System.out.println("\nTrying to borrow Java Programming again...");
            library.borrowBook("1234567890");

            System.out.println("\nAvailable books:");
            library.displayAvailableBooks();

            System.out.println("\nReturning Java Programming...");
            library.returnBook("1234567890");

            System.out.println("\nAvailable books after return:");
            library.displayAvailableBooks();


            System.out.println("\nTesting validation...");
            Book invalidBook = new Book("Invalid Book", "No Author", "12345", 3000);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}