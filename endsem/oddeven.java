import java.util.Scanner;

public class oddeven {
    public static void print(int n){
        int prod=1;
        int sum=0;
        for (int i = 1; i<=n; i++) {
            if(i%2==0){
                prod*=i;
            }
            else{
                sum=sum+i;
            }
        }
        System.out.printf("product= %d\n", prod);
        System.out.printf("sum= %d", sum);
    }
    public static void main(String[] args) {
      Scanner sc= new Scanner(System.in);
      System.out.println("enter a number");
      int n= sc.nextInt();
      print(n);
    }
}