
import java.util.Scanner;

public class power {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the first number");
        int n=sc.nextInt();
        System.out.println("enter the second number");
        int m=sc.nextInt();
        int power=1;
        for (int i = 1; i <= m; i++) {
            power*=n;
            
        }
        System.out.printf("%d raise to the power %d = %d", n,m,power);

    }
}
