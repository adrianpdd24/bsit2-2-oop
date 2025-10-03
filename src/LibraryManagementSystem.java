import java.util.ArrayList;
import java.util.List;

public class LibraryManagementSystem {
    public static void main(String[] args) {
        LibraryManager manager = new LibraryManager();

        Book b1 = new Book("B001", "Java Programming", "James Gosling", "978-0134685991", 450, "Programming");
        Book b2 = new Book("B002", "Effective Java", "Joshua Bloch", "978-0134685992", 416, "Programming");

        Magazine m1 = new Magazine("M001", "Tech Today", "Editor Smith", 12, "October", true);
        Magazine m2 = new Magazine("M002", "Science Monthly", "Editor Jane", 5, "May", false);

        DVD d1 = new DVD("D001", "The Matrix", "Wachowski Sisters", 136, "R", "Sci-Fi");
        DVD d2 = new DVD("D002", "Spirited Away", "Hayao Miyazaki", 125, "PG", "Animation");

        manager.addItem(b1);
        manager.addItem(b2);
        manager.addItem(m1);
        manager.addItem(m2);
        manager.addItem(d1);
        manager.addItem(d2);


        Student student = new Student("U001", "John Smith", "john@example.com", "S1001", "Computer Science");
        Faculty faculty = new Faculty("U002", "Dr. Smith", "drsmith@example.com", "Engineering", "Professor");


        System.out.println("=== LIBRARY MANAGEMENT SYSTEM TEST ===\n");

        System.out.println("=== Adding Items to Library ===");
        System.out.println("Added: Book - Java Programming by James Gosling");
        System.out.println("Added: Magazine - Tech Today by Editor Smith");
        System.out.println("Added: DVD - The Matrix by Wachowski Sisters\n");

        System.out.println("=== Displaying All Items ===");
        System.out.println("Book: Java Programming (" + (b1.isAvailable() ? "Available for borrowing" : "Currently borrowed") + ")");
        System.out.println("Magazine: Tech Today (" + (m1.isAvailable() ? "Available for borrowing" : "Currently borrowed") + ")");
        System.out.println("DVD: The Matrix (" + d1.getBorrowingStatus() + ")\n");

        System.out.println("=== Testing Borrowing ===");
        b1.borrowItem(student.getName());
        student.addBorrowedItem(b1);
        System.out.println("Student John borrowed: Java Programming");

        d1.borrowItem(faculty.getName());
        faculty.addBorrowedItem(d1);
        System.out.println("Faculty Dr. Smith borrowed: The Matrix\n");

        System.out.println("=== Displaying Available Items ===");
        System.out.println("Magazine: Tech Today (Available for borrowing)\n");

        System.out.println("=== Testing Late Fees ===");
        System.out.println("Java Programming - 5 days late: " + String.format("$%.2f", b1.calculateLateFee(5)));
        System.out.println("The Matrix - 3 days late: " + String.format("$%.2f", d1.calculateLateFee(3)) + "\n");

        System.out.println("=== Testing User Information ===");
        System.out.println("Student: " + student.getName() + " (" + student.getMajor() + ") - " + student.getBorrowedItemsCount() + " items borrowed");
        System.out.println("Faculty: " + faculty.getName() + " (" + ((Faculty)faculty).getDepartment() + ") - " + faculty.getBorrowedItemsCount() + " items borrowed");
    }
}
