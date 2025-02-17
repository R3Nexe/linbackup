
public class arrfunc {

    public static int[] insert(int arr[], int element, int index) {
        int newarr[] = new int[arr.length + 1];

        for (int i = 0; i < index; i++) {
            newarr[i] = arr[i];
        }
        newarr[index] = element;
        for (int i = index; i < arr.length; i++) {
            newarr[i + 1] = arr[i];
        }

        return newarr;
    }

    public static int[] deletearr(int arr[], int index) {
        if (index < 0 || index > arr.length) {
            System.out.println("invalid index");
            return arr;

        }
        int newarr[] = new int[arr.length - 1];
        for (int i = 0; i < index; i++) {
            newarr[i] = arr[i];
        }
        for (int i = index; i < newarr.length; i++) {
            newarr[i - 1] = arr[i];
        }
        return newarr;
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 4, 5, 6, 7};
        int ele = 2;
        int index = 2;
        int newarr[] = insert(arr, ele, index);
        for (int i = 0; i < newarr.length; i++) {
            System.out.print(newarr[i] + " ");
        }
    }
}
