abstract class Media {
    protected String title;
    protected String itemId;
    protected boolean isAvailable;

    public Media(String title, String itemId) {
        this.title = title;
        this.itemId = itemId;
        this.isAvailable = true;
    }

    public String getTitle() {
        return title;
    }

    public String getItemId() {
        return itemId;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void borrowItem() {
        isAvailable = false;
        System.out.println(title + " has been borrowed");
    }

    public void returnItem() {
        isAvailable = true;
        System.out.println(title + " has been returned");
    }

    public abstract String getMediaType();
    public abstract void displayInfo();
}

