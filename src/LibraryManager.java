import java.util.ArrayList;
import java.util.Scanner;

public class LibraryManager {
    ArrayList<String> books = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public LibraryManager() {
        books.add("Java Programming");
        books.add("Web Development");
        books.add("Database Design");
    }

    public void showBooks() {
        try {
            if (books == null) {
                throw new IllegalStateException("Book list is not initialized!");
            }
            if (books.isEmpty()) {
                System.out.println("No books available in the library.");
            } else {
                System.out.println("\n--- Current Books ---");
                for (int i = 0; i < books.size(); i++) {
                    System.out.println((i + 1) + ". " + books.get(i));
                }
            }
        } catch (IllegalStateException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Display operation completed.\n");
        }
    }

    public void addBook() {
        try {
            System.out.print("Enter book title to add: ");
            String title = scanner.nextLine().trim();
            if (title == null || title.isEmpty()) {
                throw new IllegalArgumentException("Book title cannot be empty!");
            }
            if (title.length() < 3) {
                throw new IllegalArgumentException("Book title must be at least 3 characters long!");
            }
            books.add(title);
            System.out.println("Book '" + title + "' added successfully!");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Add book operation completed.\n");
            showBooks();
        }
    }

    public void removeBook() {
        try {
            if (books.isEmpty()) {
                System.out.println("No books available to remove.");
                return;
            }
            System.out.print("Enter book number to remove (1-" + books.size() + "): ");
            String input = scanner.nextLine().trim();
            int index = Integer.parseInt(input) - 1;
            if (index < 0) {
                throw new IllegalArgumentException("Negative index not allowed!");
            }
            String removedBook = books.remove(index);
            System.out.println("Book '" + removedBook + "' removed successfully!");
        } catch (NumberFormatException e) {
            System.out.println("Error: Please enter a valid number!");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Invalid book number! Please enter between 1 and " + books.size() + ".");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Remove book operation completed.\n");
            showBooks();
        }
    }

}
