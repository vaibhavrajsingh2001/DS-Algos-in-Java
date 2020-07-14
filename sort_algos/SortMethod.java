import java.util.Arrays;

public class SortMethod {
    public static void main(String[] args) {
        // sort using JDK inbuilt library
        int arr[] = new int[] { 200, 35, -15, 7, -5, 0, 1 };

        Arrays.parallelSort(arr);

        for (int k = 0; k < arr.length; k++) {
            System.out.println(arr[k]);
        }
    }
}