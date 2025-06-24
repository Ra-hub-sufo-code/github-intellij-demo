package MultiThreading.Sync;

class MyThreadTable extends Thread {
    PrintTable ta;
    MyThreadTable(PrintTable tab) {
        // take object of Table
        this.ta = tab;
    }

    @Override
    public void run() {
        ta.table(5);
    }
}
