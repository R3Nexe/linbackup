
import java.util.Scanner;

public class nozero {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int n = sc.nextInt();
        String rev = "";
        while (n > 0) {
            int dig = n % 10;
            if (dig != 0) {
                rev = dig + rev;
            }
            n /= 10;

        }
        System.out.println("the number without zero = "+rev);
    }
}
