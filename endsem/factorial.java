
import java.util.Scanner;

public class factorial {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first number");
        int m = sc.nextInt();
        System.out.println("enter the second number");
        int n = sc.nextInt();
        int fact = 1;
        for (int i = m; i <= n; i++) {
            for (int j = 2; j <= i; j++) {
                fact *= j;

            }
            System.out.printf("factorial of %d = %d\n", i, fact);
            fact = 1;

        }
    }
}
