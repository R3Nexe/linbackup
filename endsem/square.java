public class square {

    public static void main(String[] args) {
        int sumsq=0;
        int sqsum=0;
        int sum=0;
        for (int i = 1; i < 11; i++) {
            sumsq+=(i*i);
            sum+=i;
        }
        sqsum=sum*sum;
        System.out.println("difference = "+(sumsq-sqsum));
    }
}