package MultiThreading;

class YieldThread extends Thread {
    @Override
    public void run() {
        int sum = 0;
        for (int i=1; i <= 10; i++) {
            sum = sum+i;
            System.out.println("Addition: "+sum);
            Thread.yield();
        }
    }
}

public class YieldDemo {
    public static void main(String[] args) {
        YieldThread t = new YieldThread();
        t.start();
        int mul=1;
        for (int i=1; i <= 10; i++) {
            mul = mul*i;
            System.out.println("Multiplication is: "+mul);
        }
    }
}
