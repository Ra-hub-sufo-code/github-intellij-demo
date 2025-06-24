package MultiThreading;

class MyThread1 implements Runnable {
    @Override
    public void run() {
        System.out.println("Thread Name : "+
                            Thread.currentThread().getPriority());
        System.out.println("Thread Name : "+
                Thread.currentThread().getName());
    }
}

public class ThreadWithInterface {
    public static void main(String[] args) {
        Thread t1 = new Thread(new MyThread1());
        Thread t2 = new Thread(new MyThread1());
        t1.setName("My thread");
        t1.setPriority(Thread.MIN_PRIORITY);
        t1.start();
        t2.setPriority(Thread.MAX_PRIORITY);
        t2.start();
    }
}
