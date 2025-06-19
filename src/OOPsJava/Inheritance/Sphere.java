package OOPsJava.Inheritance;

public class Sphere extends Circle {
    @Override
    public double area ( int radius ) {
        double area;
        area = 4*3.14*Math.pow(radius,2);
        return area;
    }
}
