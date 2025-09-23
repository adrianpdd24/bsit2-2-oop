class Student implements LibraryUser {
    private String name;
    private String studentId;

    public Student(String name, String studentId) {
        this.name = name;
        this.studentId = studentId;
    }

    public String getUserType() {
        return "Student";
    }

    public int getMaxBorrowLimit() {
        return 3;
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
