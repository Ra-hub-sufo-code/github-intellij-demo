package MultiThreading;

class SleepThread extends Thread {
    @Override
    public void run()   {
        for (int j=1; j <= 5; j++) {
            System.out.println(getName()+"....."+j);
            try {
                Thread.sleep(1000); //1 sec
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted");
                Thread.yield();
            }
        }
    }
}
public class SleepDemo {
    public static void main(String[] args) {
        SleepThread t = new SleepThread();
        t.start();
        for (int i=1; i <=5; i++) {
            System.out.println("Hello Aditya");
        }
    }
}
