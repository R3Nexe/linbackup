public class pattern {
    public static void main(String[] args) {
        int n=15;
        for (int i = 0; i <=5; i++) {
            for (int j = 0; j < i; j++,n--) {
                System.out.print(n+"    "); 
                
            }
            System.out.println();
        }
    }
}
