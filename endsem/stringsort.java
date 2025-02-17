public class stringsort {
    public static void main(String[] args) {
        String[] words = {"apple", "zebra", "mountain", "ocean", "guitar", 
                  "banana", "keyboard", "tiger", "volcano", "sunset"};
                  for (int i = 0; i < words.length-1; i++) {
                    for (int j = 0; j < words.length-1-i; j++) {
                        if (words[j].compareTo(words[j+1])>0) {
                            String temp=words[j+1];
                            words[j+1]=words[j];
                            words[j]=temp;
                            
                        }
                    }
                  }
                        for (int i = 0; i < words.length; i++) {
                            System.out.print(words[i]+" ");
                        }

    }
}
 