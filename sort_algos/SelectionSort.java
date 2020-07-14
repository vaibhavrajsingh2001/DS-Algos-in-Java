public class SelectionSort {
    public static void main(String[] args) {
        // Ascending order sorted
        int arr[] = new int[] { 20, 35, -15, 7, 55, -22, 1 };
        int largest, temp;

        for (int lastUnsortedIndex = arr.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
            largest = 0;
            for (int i = 0; i <= lastUnsortedIndex; i++) {
                if (arr[i] > arr[largest]) {
                    largest = i;
                }
            }
            temp = arr[largest];
            arr[largest] = arr[lastUnsortedIndex];
            arr[lastUnsortedIndex] = temp;
        }
        for (int k = 0; k < arr.length; k++) {
            System.out.println(arr[k]);
        }
    }
}