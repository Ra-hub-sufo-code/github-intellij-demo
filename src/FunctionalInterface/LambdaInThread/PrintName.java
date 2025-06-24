package FunctionalInterface.LambdaInThread;

public class PrintName {
    public static void main(String[] args)throws InterruptedException {
        //definition of run method is below
        Runnable pri = ()-> {
            for (int i=0; i<5; i++) {
                System.out.println("Your task is complete");
            }
        };
        Thread obj = new Thread(pri);
        obj.start();
        for (int i = 0; i < 5; i++) {
            System.out.println("Main thread....");
        }
    }
}
