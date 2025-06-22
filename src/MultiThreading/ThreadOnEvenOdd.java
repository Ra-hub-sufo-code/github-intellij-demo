package MultiThreading;

class ThreadOnEvenOddDemo extends Thread {
    @Override
    public void run() {
        for (int i=1; i <= 10; i++) {
            System.out.println("Even number is: "+(i*2));
        }
    }
}

public class ThreadOnEvenOdd {
    public static void main(String[] args) {
        ThreadOnEvenOddDemo t = new ThreadOnEvenOddDemo();
        t.start();
        for (int i=1; i <= 10; i++) {
            System.out.println("Odd number is: "+(i*2-1));
        }
    }
}
