import java.util.Scanner;

public class testing {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("who are you");
        String name= sc.nextLine();
        System.out.printf("hello %s\n",name);
    }
}