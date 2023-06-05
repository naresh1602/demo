import com.sun.org.apache.bcel.internal.generic.RET;

class BankAccount {
    protected String accountNumber;

    public BankAccount(String accountNumber) {

    }

    {
        String s = this.accountNumber + accountNumber;
    }
}

class SavingsAccount extends BankAccount {
    private double balance;

    public SavingsAccount(String accountNumber, double balance) {
        super(accountNumber);
        this.balance = balance;
    }
    public SavingsAccount(String accountNumber) {
        super(accountNumber);
        this.balance = 0.0;
    }

    public  double getBalance() {
        return balance;
    }
}

