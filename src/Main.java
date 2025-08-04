
public class Main {

    public static void main(String[] args) {
        Book book1 = new Book("A Clash of Kings", "George R. R. Martin", 761);
        Book book2 = new Book("A Game of Thrones", "George R. R. Martin", 694);
        Book book3 = new Book("A Storm of Swords", "George R. R. Martin", 1070);

        book1.displayInfo();
        book2.displayInfo();
        book3.displayInfo();

        book1.borrowBook();
        book1.borrowBook();
        book2.returnBook();
        book3.returnBook();
    }
}
