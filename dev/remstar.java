
import java.util.Scanner;

public class remstar {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter string ");
        String s= sc.nextLine();
        String rev="";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i)!='*') {
                rev+=s.charAt(i);
            }
        }
        System.out.println(rev);
        
    }
}

