
import java.util.Scanner;

public class GCD {

    public static int Gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return Gcd(b, a % b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("GCD = " + Gcd(a, b));
    }
}
