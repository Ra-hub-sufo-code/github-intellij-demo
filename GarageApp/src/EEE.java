import java.util.ArrayList;
import java.util.List;

public class EEE {
    public static void main(String[] args) {
        List<Integer> hh=new ArrayList<>();
        hh.add(1);
        hh.add(2);
        hh.add(3);
        hh.add(4);

        String y="";
        for (int in:hh){
            y +=in;
        }

        System.out.println("\n"+y);
    }
}
