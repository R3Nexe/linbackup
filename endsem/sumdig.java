public class sumdig {
    public static int sumdigit(int n){
        int sum=0;
        while (n>0) {
            int dig=n%10;
            sum=sum+dig;
            n=n/10;
        }
        return sum;
    }
    public static void main(String[] args) {
        int n=3245;
        while (n>10) {
            n=sumdigit(n);
            System.out.println(n);
        }
        
    }
}
