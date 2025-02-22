
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class duplicate {

    public static void main(String[] args) {
        HashMap<Integer, Integer> map = new HashMap<>();
        HashSet<Integer> set = new HashSet<>();
        Scanner sc = new Scanner(System.in);
        int arr[] = {1, 2, 2, 3, 3, 4, 4};
        int count = 0;
        for (int num : arr) {
            if (!set.add(num)) {
                count++;
            }
        }
        if (count > 0) {
            System.out.println("the array has duplicates: " + count);
        }
        else System.out.println("the array has unique elements");
    }
}
