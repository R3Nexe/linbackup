
import java.util.HashMap;
import java.util.Scanner;

public class nonrepeat {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<Character, Integer> map = new HashMap<>();
        System.out.println("enter string");
        String s = sc.next();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        for (int i = 0; i < s.charAt(i); i++) {
            if (map.get(s.charAt(i)) == 1) {
                System.out.printf("first non repeating character is %c", s.charAt(i));
                break;
            }

        }

    }
}
