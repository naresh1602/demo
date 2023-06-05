public class Account {
    public static void main(String[] args) {
        SavingsAccount account1 = new SavingsAccount("12345", 1000.0);
        System.out.println("Account Number: " + account1.accountNumber);
        System.out.println("Balance: " + account1.getBalance());
        SavingsAccount account2 = new SavingsAccount("67890");
        System.out.println("Account Number: " + account2.accountNumber);
        System.out.println("Balance: " + account2.getBalance());

    }
}
