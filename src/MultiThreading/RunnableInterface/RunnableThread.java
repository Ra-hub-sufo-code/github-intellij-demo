package MultiThreading.RunnableInterface;

class RunnableInter implements Runnable {
    @Override
    public void run() {
        for (int i=0; i<5; i++) {
            System.out.println("Child Thread");
        }
    }
}

public class RunnableThread {
    public static void main(String[] args) {
        RunnableInter r = new RunnableInter();
        Thread t = new Thread(r);
        t.start();
        for (int i=0; i<5; i++) {
            System.out.println("Main Thread");
        }
    }
}
