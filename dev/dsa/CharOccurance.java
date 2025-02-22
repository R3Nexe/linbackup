
import java.util.HashMap;
import java.util.Scanner;

public class CharOccurance {

    public static void main(String[] args) {
        HashMap<Character, Integer> map = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a string");
        String s = sc.next();
        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }
        for (char key : map.keySet()) {
            System.out.println("the character " + key + " appears " + map.get(key) + " times");
        }
    }
}
