package MultiThreading;

class JoinThread extends Thread {
    @Override
    public void run() {
        for (int i=1; i <= 5; i++) {
            System.out.println("Hello Raushan");
        }
    }
}

public class JoinDemo {
    public static void main(String[] args) throws InterruptedException {
        JoinThread t = new JoinThread();
        t.start();
        t.join(); //main - jo line execute krega wahi wait krega
        for (int i=0; i <= 5; i++) {
            System.out.println("How are you");
        }
    }
}
