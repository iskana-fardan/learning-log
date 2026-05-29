public class BankAccount {
    private String owner;
    private int balance;
    private int accountNumber;


    public BankAccount(String owner, int initialBalance, int accountNumber) {
        this.owner = owner;
        this.accountNumber = accountNumber;

        if(initialBalance < 0){
            throw new IllegalArgumentException("Initial balance cannot be negative");
        }

        this.balance = initialBalance;
    }

    public int getBalance() {
        return balance;
    }

    public void deposit(int amount) {
        if (amount <= 0) {
            System.out.println("Invalid deposit amount");
            return;

        }
        balance += amount;
        System.out.println("Deposited: " + amount);
        System.out.println("New balance: " + balance);
    }



    public void withdraw(int amount) {
        if (balance <= amount) {
            System.out.println("Invalid withdrawal amount");
            return;
        }

        if(amount < 0) {
            System.out.println("Insufficient funds");
            return;
        }

        balance -= amount;
        System.out.println("Withdrawn: " + amount);
        System.out.println("New balance: " + balance);
    }


    public void displayInfo() {
        System.out.println("Owner: " + owner);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }

}
