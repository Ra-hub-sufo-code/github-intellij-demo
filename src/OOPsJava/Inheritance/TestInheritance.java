package OOPsJava.Inheritance;

public class TestInheritance {
    public static void main(String[] args) {
        InheritanceShape obj = new InheritanceShape(5,7);
        Rectangle obj1 = new Rectangle();
        Circle obj2 = new Circle();
        System.out.println("Rectangle of area is: "+obj1.area());
        System.out.println("Circle of area is: "+obj2.area(5));
        Sphere obj3 = new Sphere();
        System.out.println("Sphere of area is: "+obj3.area(5));
        int res = 6+7;
        System.out.println(res);
    }
}
