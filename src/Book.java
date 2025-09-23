class Book extends Media {
    private String author;

    public Book(String title, String itemId, String author) {
        super(title, itemId);
        this.author = author;
    }

    public String getMediaType() {
        return "Book";
    }

    public void displayInfo() {
        System.out.println("Book: \"" + title + "\" by " + author + " (ID: " + itemId + ")");
    }
}
