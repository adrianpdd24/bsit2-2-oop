public class Library {
    private Book[] books;
    private int bookCount;

    public Library() {
        books = new Book[10];  // max 10 books
        bookCount = 0;
    }

    public boolean addBook(Book book) {
        if (bookCount >= books.length) {
            System.out.println("Library is full. Cannot add more books.");
            return false;
        }
        books[bookCount++] = book;
        System.out.println("Book added: " + book.getTitle() + " by " + book.getAuthor());
        return true;
    }

    public boolean removeBook(String isbn) {
        for (int i = 0; i < bookCount; i++) {
            if (books[i].getIsbn().equals(isbn)) {
                // Shift all books after the removed one
                for (int j = i; j < bookCount - 1; j++) {
                    books[j] = books[j + 1];
                }
                books[bookCount - 1] = null;
                bookCount--;
                System.out.println("Book with ISBN " + isbn + " removed.");
                return true;
            }
        }
        System.out.println("Book with ISBN " + isbn + " not found.");
        return false;
    }

    public Book findBook(String isbn) {
        for (int i = 0; i < bookCount; i++) {
            if (books[i].getIsbn().equals(isbn)) {
                return books[i];
            }
        }
        return null;
    }

    public boolean borrowBook(String isbn) {
        Book book = findBook(isbn);
        if (book != null) {
            if (book.borrowBook()) {
                System.out.println("Book borrowed successfully!");
                return true;
            } else {
                System.out.println("Book is not available for borrowing.");
                return false;
            }
        }
        System.out.println("Book not found.");
        return false;
    }

    public boolean returnBook(String isbn) {
        Book book = findBook(isbn);
        if (book != null) {
            if (book.returnBook()) {
                System.out.println("Book returned successfully!");
                return true;
            } else {
                System.out.println("Book was not borrowed.");
                return false;
            }
        }
        System.out.println("Book not found.");
        return false;
    }

    public void displayAvailableBooks() {
        System.out.println("Available books:");
        for (int i = 0; i < bookCount; i++) {
            if (books[i].isAvailable()) {
                books[i].displayBookInfo();
            }
        }
    }

    public void displayAllBooks() {
        System.out.println("All books in library:");
        for (int i = 0; i < bookCount; i++) {
            books[i].displayBookInfo();
        }
    }

    public int getBookCount() {
        return bookCount;
    }
}