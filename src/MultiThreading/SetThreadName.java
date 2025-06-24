package MultiThreading;

class ThreadName extends Thread {
    @Override
    public void run() {
        System.out.println("Thread Name : "+Thread.currentThread().getName());
    }
}
public class SetThreadName {
    public static void main(String[] args) {
        // start()
        // run()
        // getName()
        // setName()
        // setPriority()
        ThreadName t = new ThreadName();
        ThreadName t2 = new ThreadName();
        t2.start();
        t.setName("My Thread");
        t.start();
    }
}
