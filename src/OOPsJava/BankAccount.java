package OOPsJava;

public class BankAccount {
    private double balance;
    final private String accountHolderName;
    final private double accountNumber;
    final private String address;

    BankAccount ( Double balance,String accountHolderName,
                    double accountNumber,String address ) {
        this.balance = balance;
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.address = address;
    }
    public void getBalance ( ) {
        System.out.println("Available balance is: "+this.balance);
    }
    public void withdraw ( double amt) {
        try {
            if ( this.balance < amt ) {
                throw new Exception("Insufficient balance");
            }
        }
        catch (Exception e) {
            System.out.println(e.getMessage()+", Available balance is: "+this.balance);
        }
        if ( this.balance >= amt) {
            this.balance -= amt;
            System.out.println("Withdraw successfully,Available balance is: "+this.balance);
        }
    }
    public void deposit ( double amt) {
        if (amt < 0 ) {
            System.out.println("Your amount cannot deposit");
        }
        else {
            this.balance += amt;
            System.out.println("Your amount is credited successfully");
        }
    }
}
