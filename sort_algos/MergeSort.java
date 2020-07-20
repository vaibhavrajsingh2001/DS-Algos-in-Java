public class MergeSort {
    public static void main(String[] args) {
        int arr[] = { 20, 35, -15, 7, 55, -22, 1 };

        mergeSort(arr, 0, arr.length);

        for (int k = 0; k < arr.length; k++) {
            System.out.println(arr[k]);
        }
    }

    // method for merge sort. Partitions are created here. It's recursive.
    public static void mergeSort(int[] input, int first, int last) {

        // end recursion if array length is 1
        if (last - first <= 1) {
            return;
        }

        int middle = (first + last) / 2;

        // break the left partitions
        mergeSort(input, first, middle);
        // brak the right partitions
        mergeSort(input, middle, last);
        // sort and merge the partitions
        merge(input, first, middle, last);
    }

    // partions are sorted and merged here
    public static void merge(int[] input, int first, int middle, int last) {
        // input[middle] -> first element of right partition
        // input[middle -1] -> last element of left partition
        // if input[middle - 1] <= input[middle] then the array is essentially sorted.
        // So ->
        if (input[middle - 1] <= input[middle]) {
            return;
        }

        int i = first;
        int j = middle;
        int tempIndex = 0;

        int temp[] = new int[last - first];

        // middle -> end of left partition, so stop if reached
        // last -> end of right partition, so also stop if reached
        while (i < middle && j < last) {
            /*
             * if elem of left partition is smaller, then allot that and then move to next
             * elem of left partition to check (hence i++). Vice versa if elem of right
             * partition is smaller.
             */
            temp[tempIndex++] = input[i] <= input[j] ? input[i++] : input[j++];
        }

        /*
         * here we copy leftover elems in left partition to input array, since we missed
         * to copy them to temp inside the while loop above and since their position has
         * essentially been changed, we need to explicitly add them. Take the leftover
         * elems and copy them to input arr right after leaving enough space for temp
         * array to be added i.e. tempIndex spaces
         */
        System.arraycopy(input, i, input, first + tempIndex, middle - i);

        // now we copy temp to input array.
        System.arraycopy(temp, 0, input, first, tempIndex);

        /*
         * Why we only copied elems from left partition? Because if the elms in right
         * partition are left uncopied to temp, that means their position won't be
         * changed, since they are already on the right side. So we leave them as it is.
         */
    }
}