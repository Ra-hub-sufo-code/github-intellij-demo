package OOPsJava.Inheritance;

public class Rectangle extends InheritanceShape {
    //Static variable use any subClass or class because only one copy of static variables,stored in static memory
    // but instance variables use only created object same class because every object own copy of instance variables
    public int area ( ) {
        int area;
        area = InheritanceShape.length*InheritanceShape.wirth;
        return area;
    }
}
