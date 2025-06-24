public class SentLetter implements Runnable {
    private final String resName;
    public SentLetter(String resName) {
        this.resName = resName;
    }

    @Override
    public void run() {
        System.out.println("Sending message to : "+resName+
                            " By Thread "+Thread.currentThread().getName());
         try {
             Thread.sleep(1000);
             System.out.println();
         }
         catch (InterruptedException e) {
             throw new RuntimeException();
         }
        System.out.println("Send your message to : "+resName+
                 "By Thread "+Thread.currentThread().getName());
    }
}
