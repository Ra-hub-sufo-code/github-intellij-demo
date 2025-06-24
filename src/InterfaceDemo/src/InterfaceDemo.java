public interface InterfaceDemo {
    public void even();
    public void odd();

}
class InterfaceChild implements InterfaceDemo{
    @Override
    public void even () {
        for (int i=1; i<=5; i++) {
            System.out.println("Even number: "+(i*2));
        }
    }
    @Override
    public void odd () {
        for (int i=1; i<=5; i++) {
            System.out.println("Odd number: "+(i*2-1));
        }
    }
}
