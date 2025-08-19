public class Main {
    public static void main(String[] args) {
                System.out.println("Bank Name: " + BankAccount.bankName);
                System.out.println("Interest Rate: " + (BankAccount.interestRate * 100) + "%\n");

                BankAccount acc1 = new BankAccount("John Doe", 1000);
                BankAccount acc2 = new BankAccount("Jane Smith", 2500);
                BankAccount acc3 = new BankAccount("Bob Johnson", 500);

                System.out.println("\n═══ Account Operations ═══");
                acc1.deposit(500);
                acc2.withdraw(300);

                System.out.println("\n═══ Interest Calculation ═══");
                System.out.println("John Doe's interest: $" + acc1.calculateInterest());
                System.out.println("Jane Smith's interest: $" + acc2.calculateInterest());
                System.out.println("Bob Johnson's interest: $" + acc3.calculateInterest());

                System.out.println("\nTotal Accounts Created: " + BankAccount.totalAccounts);
            }
        }


