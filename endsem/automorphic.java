
import java.util.Scanner;

public class automorphic {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int n = sc.nextInt();
        int len = String.valueOf(n).length();
        int sq = n * n;
        if (sq % (Math.pow(10,len)) == n) {
            System.out.println("Automorphic number");
        } else {
            System.out.println("not Automorphic number");
        }
    }
}
