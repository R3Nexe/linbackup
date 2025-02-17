public class greatestinarry {
    public static int greatestInArray(int[]arr){
        int high=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>high) {
                high=arr[i];
            
            }
        }
        return high;
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
        System.out.println("highest= "+greatestInArray(arr));
    }
}
