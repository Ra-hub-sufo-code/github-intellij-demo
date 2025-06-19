package OOPsJava;

public class TestBank {
    public static void main(String[] args) {
        BankAccount custumer = new BankAccount(3000.0,
                "Raushan",000215655,"Bihar");
        custumer.withdraw(4000);
        custumer.deposit(-2000);
        custumer.getBalance();
        custumer.withdraw(5000);
        custumer.getBalance();

    }
}
