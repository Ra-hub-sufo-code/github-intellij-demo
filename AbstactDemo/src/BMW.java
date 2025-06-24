public class BMW extends Vehcal {

    @Override
    public void start() {
        System.out.println("My "+super.brand+" is starting ");
    }

    @Override
    public void stop() {
        System.out.println("My "+super.brand+" is stop ");
    }

    public static void main(String[] args) {
        BMW obj = new BMW();
        obj.setBrand("BMW");
        obj.start();
        obj.stop();
    }
}
