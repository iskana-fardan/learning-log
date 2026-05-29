public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("John",1000, 123455);

        System.out.println("Balance: " + account.getBalance());

        account.withdraw(500);
        account.deposit(1000);

        account.displayInfo();
    }
}
