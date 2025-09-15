abstract class Pet {
    protected String name;
    protected int age;

    public Pet(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayInfo() {
        System.out.println("Pet Name: " + name + ", Age: " + age);
    }

    public abstract void makeSound();
}
