public class Book {
    String title;
    String author;
    int pages;
    Boolean isAvailable;

    public Book(String title, String author, int pages) {
        this.title = title;
        this.author = author;
        this.pages = pages;
        this.isAvailable = true;
        System.out.println("A new book '" + title + "' by " + author + " has been added to the library!");
    }

    public void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Pages: " + pages);
        System.out.println("Available: " + (isAvailable ? "Yes" : "No"));
        System.out.println();
    }

    public void borrowBook() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("'" + title + "' has been borrowed.");
        } else {
            System.out.println("'" + title + "' is currently not available.");
        }
    }

    public void returnBook() {
        if (isAvailable) {
            isAvailable = true;
            System.out.println("'" + title + "' has been returned.");
        } else {
            System.out.println("'" + title + "' was not borrowed.");
        }
    }
}


