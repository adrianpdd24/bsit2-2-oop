class DVD extends Media {
    private String director;

    public DVD(String title, String itemId, String director) {
        super(title, itemId);
        this.director = director;
    }

    public String getMediaType() {
        return "DVD";
    }

    public void displayInfo() {
        System.out.println("DVD: \"" + title + "\" directed by " + director + " (ID: " + itemId + ")");
    }
}
