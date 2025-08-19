    public class BankAccount {
        static String bankName = "Liceo Bank";
        static int totalAccounts = 0;
        static double interestRate = 0.03;
        private static int accountCounter = 1;


        String accountNumber;
        String accountHolderName;
        double balance;


        BankAccount(String accountHolderName, double initialBalance) {
            this.accountNumber = generateAccountNumber();
            this.accountHolderName = accountHolderName;
            this.balance = initialBalance;
            totalAccounts++;
            System.out.println("Account Created: " + accountNumber + " for " + accountHolderName +
                    " with initial balance: $" + initialBalance);
        }


        private static String generateAccountNumber() {
            return String.format("ACC%03d", accountCounter++);
        }


        void deposit(double amount) {
            balance += amount;
            System.out.println(accountHolderName + " deposited $" + amount +
                    ". New balance: $" + balance);
        }


        void withdraw(double amount) {
            if (balance >= amount) {
                balance -= amount;
                System.out.println(accountHolderName + " withdrew $" + amount +
                        ". New balance: $" + balance);
            } else {
                System.out.println(accountHolderName + " has insufficient balance to withdraw $" + amount);
            }
        }


        double calculateInterest() {
            return balance * interestRate;
        }
    }




