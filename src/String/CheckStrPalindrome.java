package String;
import java.util.Scanner;

public class CheckStrPalindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the your name: ");
        String name = input.nextLine();
        boolean res = strIsPalindrome(name);
        if ( res ) {
            System.out.print("Given string is palindrome");
        }
        else {
            System.out.print("Given string is not palindrome");
        }
    }
    public static boolean strIsPalindrome(String cha) {
        int i,j=(cha.length())-1;
        for (i=0; i < cha.length(); i++) {
            if ( i == j) {
                break;
            }
            else if (cha.charAt(i) != cha.charAt(j)) {
                return false;
            }
            j--;
        }
        return true;
    }
}
