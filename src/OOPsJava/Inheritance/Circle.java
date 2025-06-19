package OOPsJava.Inheritance;

public class Circle extends InheritanceShape {
    public double area (int radius ) {
        double area;
        area = 3.14*Math.pow(radius,2);
        return area;
    }
}
