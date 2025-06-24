package MultiThreading.Sync;

public class SyncTablePrint {
    public static void main(String[] args)throws InterruptedException {
        System.out.println(".....Syn Method.....");
        PrintTable table = new PrintTable();
        MyThreadTable t = new MyThreadTable(table);
        MyThreadTable1 t1 = new MyThreadTable1(table);
        //set name of child Thread
        t.setName("My thread");
        t1.setName("Your thread");
        //can thread
        t.start();
        t1.start();
        //stop the execution of main thread until the complete the task of child thread
        try {
            System.out.println("....Main thread waiting.....");
            t.join();
            t1.join();
            System.out.println("....Complete main thread.....");
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
