class Librarian implements LibraryUser {
    private String name;
    private String employeeId;

    public Librarian(String name, String employeeId) {
        this.name = name;
        this.employeeId = employeeId;
    }

    public String getUserType() {
        return "Librarian";
    }

    public int getMaxBorrowLimit() {
        return 10;
    }

    public void borrowMedia(Media media) {
        if (media.isAvailable()) {
            media.borrowItem();
            System.out.println(name + " (" + getUserType() + ") borrowed: " + media.getTitle());
        } else {
            System.out.println("Sorry, " + media.getTitle() + " is not available");
        }
    }

    public void returnMedia(Media media) {
        media.returnItem();
    }
}
