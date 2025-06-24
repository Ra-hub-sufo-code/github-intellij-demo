public interface InterfaceAfterJava8 {
    /* How can we run the Interface without child class :-
       after java1.8 we can create concreate method in Interface
       with static scope,call by Interface name */

    // concreate method -> method with body shown below

    public static void printTable ( int n) {
        for (int i=1; i<=10; i++) {
            System.out.println("Table of "+n+" is : "+(n*i));
        }
    }
}
