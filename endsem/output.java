public class output {

    public static void main(String[] args) {
        int i,s=0;
        for(int k=0;k<5;k++){
            i=0;
            do { 
                i++;
                s--;
                s=s+i;
            } while (i<k);
            System.out.println(s);
        }
    }
}

