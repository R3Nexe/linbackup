
import java.util.HashMap;

public class mostfreqele {

    public static void main(String[] args) {
        HashMap<Integer, Integer> freq = new HashMap<>();
        int nums[]= {1,1,1,2,3,3,3,3,3,3,4,4,5,6};
        for(int num:nums){
            freq.put(num, freq.getOrDefault(num, 0)+1);
        }
        int max=0;
        int highest=0;
        for (int key :freq.keySet()) {
            if(freq.get(key)>max){
                max=freq.get(key);
                highest=key;
            }
    }
    System.out.printf("the number with highest occurances is %d", highest);

}
}