package MultiThreading.Sync;

class PrintTable {
    public void table(int n) {
        synchronized (this) {
            for (int i=1; i<=5; i++) {
                System.out.println(Thread.currentThread().getName() +
                        " : " + (n * i));
            }
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
