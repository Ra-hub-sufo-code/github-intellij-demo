package MultiThreading.InterComm;

public class Comm {
    public static void main(String[] args)throws InterruptedException{
        ThreadComm t1 = new ThreadComm();
        t1.start();
        synchronized (t1) {
            System.out.println("main thread calling waiting...");
            t1.wait();
            System.out.println("main thread get notify...");
            System.out.println("total: "+t1.sum);
        }
    }
}
