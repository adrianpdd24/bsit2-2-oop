class Magazine extends Media {
    private int issueNumber;

    public Magazine(String title, String itemId, int issueNumber) {
        super(title, itemId);
        this.issueNumber = issueNumber;
    }

    public String getMediaType() {
        return "Magazine";
    }

    public void displayInfo() {
        System.out.println("Magazine: \"" + title + "\" Issue #" + issueNumber + " (ID: " + itemId + ")");
    }
}
