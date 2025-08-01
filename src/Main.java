import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int totalNum = 0;
        int number;

        for (int i = 1; i <= 5; i++) {
            System.out.println("Enter number " + i + ": ");
            number = input.nextInt();
            totalNum += number;
        }

        System.out.println(" ");
        System.out.println("Total Number: " + totalNum);
    }
}
