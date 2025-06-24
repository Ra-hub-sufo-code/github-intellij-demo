public class TestBankAccount {
    public static void main(String[] args) {
        BankAccount accHolder = new BankAccount(5000);
        // definition of run() method of Thread
        Runnable tas1 = ()->accHolder.withdraw("My Mom",400);
        Runnable tas2 = ()->accHolder.withdraw("My Bro",40000);

        // Giving the job in Thread constructor
        new Thread(tas1).start();
        new Thread(tas2).start();
    }
}
