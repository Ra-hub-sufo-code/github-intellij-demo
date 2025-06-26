package ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ClearList {
    public static void main(String[] args) {
        List<String> str = new ArrayList<>();
        str.add("Raushan");
        str.add("Rahul");
        str.add("Sonu");
        str.add("Bipin");
        System.out.println(str);
        if (str.isEmpty()) {
            System.out.println("List is empty");
        }
        else {
            System.out.println("List is not empty");
        }
        str.clear(); //this method to clear all element from list
        if (str.isEmpty()) {
            System.out.println("List is empty");
        }
        else {
            System.out.println("List is not empty");
        }
        System.out.println("List"+str);
    }
}
