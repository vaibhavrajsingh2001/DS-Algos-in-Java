public class InsertionSort {
    public static void main(String[] args) {
        int arr[] = new int[] { 200, 35, -15, 7, -5, 0, 1 };

        for (int firstUnsortedIndex = 1; firstUnsortedIndex < arr.length; firstUnsortedIndex++) {

            int newElement = arr[firstUnsortedIndex];
            int i;

            for (i = firstUnsortedIndex; i > 0 && arr[i - 1] > newElement; i--) {
                // this loop will execute only if elemnts before the newElement are greater than
                // it so we will just shift those elements to their right
                arr[i] = arr[i - 1];
            }
            // now the loop wil break as soon as the correct position is found, so allot
            // newElement to it
            arr[i] = newElement;

        }

        for (int k = 0; k < arr.length; k++) {
            System.out.println(arr[k]);
        }
    }
}