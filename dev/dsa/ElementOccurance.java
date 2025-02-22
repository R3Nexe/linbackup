import java.util.HashMap;
import java.util.Map;

public class ElementOccurance {
    public static void main(String[] args) {
        Map<Integer, Integer> map = new HashMap<>();
        int arr[] = {1, 1, 2, 3, 4, 4, 5, 5, 5, 6, 2, 3};

        // Count occurrences correctly
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Display occurrences
        System.out.println("Number occurrences:");
        for (int key : map.keySet()) {
            System.out.println("Key: " + key + ", Value: " + map.get(key));
        }
    }
}
