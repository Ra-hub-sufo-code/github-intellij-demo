package MultiThreading.InterComm;

public class ThreadComm extends Thread{
    int sum;
    @Override
    public void run() {
        synchronized (this) {
            System.out.println("Child thread start cal..");
            for (int i=1; i <=100; i++) {
                sum = sum+1;
            }
            this.notify();
            System.out.println("Child thread giving notification");
        }
    }
}
