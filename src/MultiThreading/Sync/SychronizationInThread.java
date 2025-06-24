package MultiThreading.Sync;

class Addition {
    int sum = 0;

    public void add() {
        synchronized (this) {
            sum = sum + 1;
        }
    }
}

class MyThread1 extends Thread {
    Addition sum;

    MyThread1(Addition sum) {
        this.sum = sum;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 1000; i++) {
            sum.add();
        }
    }
}

class MyThread2 extends Thread {
    Addition sum;

    MyThread2(Addition sum) {
        this.sum = sum;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 1000; i++) {
            sum.add();
        }
    }
}

public class SychronizationInThread {
    public static void main(String[] args) throws InterruptedException {
        Addition sum1 = new Addition();
        MyThread1 t1 = new MyThread1(sum1);
        MyThread1 t2 = new MyThread1(sum1);
        t1.start();
        t2.start();

        t1.join();
        t2.join();
        System.out.println("My Addition is : " + sum1.sum);
    }
}
