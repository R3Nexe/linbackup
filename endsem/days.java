import java.util.Scanner;

public class days {
    public static int daysInAYear(int year){
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            return 366;
    }
    else return 365;
}
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter year");
        int year=sc.nextInt();
        System.out.printf("number of days in %d are %d",year,daysInAYear(year));
    }
}
