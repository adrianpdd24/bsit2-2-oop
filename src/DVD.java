class DVD extends LibraryItem implements Borrowable {
    private int duration; // minutes
    private String rating;
    private String genre;

    public DVD(String itemId, String title, String author, int duration, String rating, String genre) {
        super(itemId, title, author);
        setDuration(duration);
        setRating(rating);
        this.genre = genre;
    }

    public int getDuration() { return duration; }
    public String getRating() { return rating; }
    public String getGenre() { return genre; }

    public void setRating(String rating) {
        if (rating == null) throw new IllegalArgumentException("Rating cannot be null");
        switch (rating) {
            case "G": case "PG": case "PG-13": case "R": case "NC-17":
                this.rating = rating; break;
            default:
                throw new IllegalArgumentException("Invalid rating: must be one of G, PG, PG-13, R, NC-17");
        }
    }

    public void setDuration(int duration) {
        if (duration <= 0) throw new IllegalArgumentException("Duration must be positive");
        this.duration = duration;
    }

    @Override
    public String getItemType() { return "DVD"; }

    @Override
    public double calculateLateFee(int daysLate) { return daysLate * 1.00; }

    @Override
    public void borrowItem(String borrowerName) { checkOut(borrowerName); }

    @Override
    public void returnItem() { checkIn(); }

    @Override
    public boolean isAvailable() { return !isCheckedOut; }

    @Override
    public int getBorrowingPeriod() { return 5; }

    @Override
    public String getBorrowingStatus() {
        return "DVD: " + Borrowable.super.getBorrowingStatus();
    }
}