
import java.util.Scanner;

public class palindromestring {
    public static String reverse(String s){
        String rev="";
        for (int i =s.length()-1; i >=0 ; i--) {
            rev+=s.charAt(i);
        }
        return rev;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter string ");
        String s= sc.nextLine();
        String rev= reverse(s);
        if (rev.equalsIgnoreCase(s)) {
            System.out.println("palindrome");
            
        }else System.out.println("not palindrome");
    }
}
