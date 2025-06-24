import java.util.concurrent.locks.ReentrantLock;

public class BankAccount {
    private double bal;

    public BankAccount(double bal) {
        this.bal = bal;
    }

    private final ReentrantLock rl = new ReentrantLock();

    public void withdraw (String threadName,double amount ) {
        System.out.println(threadName+" is trying to withdraw "+amount);
        System.out.println(threadName+" acquired lock");
        //tryLock() :-> ye method batata hai ki lock free hai ki nhi
        if (rl.tryLock()) {
            rl.lock();
            try {
                if (bal >= amount ) {
                    Thread.sleep(2000);
                    bal -= amount;
                    System.out.println("Withdraw successfully,Available balance is :"+
                            bal);
                }
                else {
                    System.out.println("Insufficient balance");
                }
            }
            catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            finally {
                rl.unlock();
            }
        }
        else {
            System.out.println(threadName+" Let do some other task");
        }
    }
}
