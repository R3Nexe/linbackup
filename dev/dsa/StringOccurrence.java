import java.util.HashMap;
import java.util.Scanner;

public class StringOccurrence {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, Integer> map = new HashMap<>();

        System.out.print("Enter a sentence: ");
        String s = sc.nextLine();

        String res = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ') {
                res += s.charAt(i);
            } else if (!res.isEmpty()) {
                map.put(res, map.getOrDefault(res, 0) + 1);
                res = "";
            }
        }

        if (!res.isEmpty()) {
            map.put(res, map.getOrDefault(res, 0) + 1);
        }

        for (String key : map.keySet()) {
            System.out.println(key + " occurs " + map.get(key) + " times\n");

        }
    }
}
