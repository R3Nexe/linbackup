public class output2 {

    public static void main(String[] args) {
        int a[]=new int[5];
        int b[]=new int[a.length];
        for (int i = 0; i < a.length-1; i++) {
            a[i]=b[i]+i*2;
            b[i+1]=a[i];
            System.out.println(a[i]+ " "+b[i]);            
        }
    }
}