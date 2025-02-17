
public class sortchar {

    public static void main(String[] args) {
        String str = "movie";
        int length = str.length();
        char[] charArray = new char[length];

        for (int i = 0; i < length; i++) {
            charArray[i] = str.charAt(i);
        }
        for (int i = 0; i < length - 1; i++) {
            for (int j = 0; j < length - 1 - i; j++) {
                if (charArray[j] > charArray[j + 1]) {
                    char temp = charArray[j];
                    charArray[j] = charArray[j + 1];
                    charArray[j + 1] = temp;

                }
            }
        }

        String sortedStr = "";
        for (int i = 0; i < length; i++) {
            sortedStr += charArray[i];
        }

        System.out.println("Sorted characters: " + sortedStr);
    }
}
