public class Main {
    public static void main(String[] args) {
        System.out.println("═══ Food Ordering System ═══");
        System.out.println("\nCreating orders and adding items...");

        Order o1 = new Order("Alice Johnson");
        try {
            o1.addItem("Pizza", 12.99);
            System.out.println("Item 'Pizza' added successfully");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            o1.addMultipleItems(new String[]{"Burger", "Fries"}, 8.50, 3.25);
            System.out.println("Items added: Burger, Fries");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            o1.addItem("InvalidItem", -5.00);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            o1.addItem("", 4.00);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        Order o2 = new Order("Bob Smith");
        o2.addMultipleItems(new String[]{"Sandwich", "Salad", "Juice", "Soup", "Cake"},
                6.25, 5.50, 3.75, 7.00, 10.00);

        Order o3 = new Order("Charlie Brown");
        o3.addMultipleItems(new String[]{"Taco", "Soda"}, 10.00, 5.50);

        System.out.println("\nOrder Results:");
        System.out.println(o1.displayOrder());
        System.out.println(o2.displayOrder());
        System.out.println(o3.displayOrder());

        System.out.println("\nTotal orders created: " + Order.getTotalOrders());

        Order largest = o1;
        if (o2.getTotalAmount() > largest.getTotalAmount()) largest = o2;
        if (o3.getTotalAmount() > largest.getTotalAmount()) largest = o3;

        System.out.println("Largest order: " + largest.getCustomerName() + " ($" +
                String.format("%.2f", largest.getTotalAmount()) + ")");
    }
}
