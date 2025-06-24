package MultiThreading.Sync;

class MyThreadTable1 extends Thread {
    PrintTable ta;
    MyThreadTable1(PrintTable tab) {
        // take object of Table
        this.ta = tab;
    }

    @Override
    public void run() {
        ta.table(5);
    }
}
