public class PetClinic {
    public static void main(String[] args) {
        System.out.println("Welcome to the Pet Clinic!");
        System.out.println("==========================");

        Pet dog = new Dog("Buddy", 3);
        Pet cat = new Cat("Whiskers", 2);
        Pet bird = new Bird("Tweety", 1);

        dog.displayInfo();
        dog.makeSound();
        System.out.println();

        cat.displayInfo();
        cat.makeSound();
        System.out.println();

        bird.displayInfo();
        bird.makeSound();
        System.out.println();

        PetService service = new PetService();
        System.out.println("Basic checkup: $" + service.calculateFee());
        System.out.println("Checkup with vaccination: $" + service.calculateFee(true));
        System.out.println("Full service: $" + service.calculateFee(true, true));
        System.out.println("Emergency: $" + service.calculateFee("critical"));
        System.out.println();

        System.out.println("Training Session Started!");
        System.out.println("=========================");
        ((Trainable) dog).performTrick();
        ((Trainable) bird).performTrick();
    }
}
