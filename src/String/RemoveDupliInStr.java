package String;
import java.util.Scanner;

public class RemoveDupliInStr {
    public static void main(String[] args) {
        System.out.println("Welcome to Remove duplicate character in String");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the name:");
        String str = input.nextLine();
        StringBuilder name = new StringBuilder(str);
        StringBuilder res = new StringBuilder(str);
        res=remoDupChar(name);
        System.out.println("Removed duplicate character in string is: "+
                            res);
    }
    public static StringBuilder remoDupChar(StringBuilder chara) {
        int i,j;
        for (i=0; i < chara.length(); i++) {
            for ( j=(chara.length()-1); j > i; j--) {
                if ( chara.charAt(i) == chara.charAt(j)) {
                    chara.deleteCharAt(i);
                }
            }
        }
        return chara;
    }
}
