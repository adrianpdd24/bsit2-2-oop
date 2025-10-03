import java.util.ArrayList;

class LibraryManager {
    private ArrayList<Borrowable> items;

    public LibraryManager() {
        items = new ArrayList<>();
    }

    public void addItem(Borrowable item) { items.add(item); }

    public void displayAllItems() {
        for (Borrowable b : items) {
            if (b instanceof LibraryItem) {
                LibraryItem li = (LibraryItem) b;
                String status;
                if (b instanceof DVD) status = ((DVD) b).getBorrowingStatus();
                else status = b.getBorrowingStatus();
                System.out.println(String.format("%s: %s (%s)", li.getItemType(), li.getTitle(), status));
            }
        }
    }

    public boolean borrowItem(String itemId, String borrowerName) {
        for (Borrowable b : items) {
            if (b instanceof LibraryItem) {
                LibraryItem li = (LibraryItem) b;
                if (li.getItemId().equals(itemId) && b.isAvailable()) {
                    b.borrowItem(borrowerName);
                    return true;
                }
            }
        }
        return false;
    }

    public boolean returnItem(String itemId) {
        for (Borrowable b : items) {
            if (b instanceof LibraryItem) {
                LibraryItem li = (LibraryItem) b;
                if (li.getItemId().equals(itemId) && !b.isAvailable()) {
                    b.returnItem();
                    return true;
                }
            }
        }
        return false;
    }

    public void displayAvailableItems() {
        for (Borrowable b : items) {
            if (b.isAvailable() && b instanceof LibraryItem) {
                LibraryItem li = (LibraryItem) b;
                System.out.println(String.format("%s: %s (%s)", li.getItemType(), li.getTitle(), b.getBorrowingStatus()));
            }
        }
    }

    public double calculateTotalLateFees(int daysLate) {
        double total = 0.0;
        for (Borrowable b : items) {
            if (b instanceof LibraryItem) {
                LibraryItem li = (LibraryItem) b;
                total += li.calculateLateFee(daysLate);
            }
        }
        return total;
    }

    public LibraryItem findByTitle(String title) {
        for (Borrowable b : items) {
            if (b instanceof LibraryItem) {
                LibraryItem li = (LibraryItem) b;
                if (li.getTitle().equalsIgnoreCase(title)) return li;
            }
        }
        return null;
    }
}