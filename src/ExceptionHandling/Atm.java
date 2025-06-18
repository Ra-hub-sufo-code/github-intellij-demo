package ExceptionHandling;

public class Atm {
    public static void main(String[] args) {
        try {
            withdraw(10000,15000);
        } catch (InsufficientBalance e) {
            System.out.println("Balance ins");
            System.out.println(e);
        }
    }
    public static void withdraw ( double bal,double amt) throws InsufficientBalance {
        if (amt > bal) {
            throw new InsufficientBalance("insufficient Balance : Available bal "+
                                        bal+"Requested amt: "+amt);
        }
        else {
            System.out.println("Withdraw of amount "+amt+" successfully");
        }
    }
}
