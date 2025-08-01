import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter number 1: ");
        int num1 = input.nextInt();

        System.out.println("Enter number 2: ");
        int num2 = input.nextInt();

        System.out.println("Enter number 3: ");
        int num3 = input.nextInt();

        System.out.println("Enter number 4: ");
        int num4 = input.nextInt();

        System.out.println("Enter number 5: ");
        int num5 = input.nextInt();

        int totalNum = num1 + num2 + num3 +num4 + num5;

        System.out.println(" ");
        System.out.println("Total Number: " + totalNum);

    }
}
