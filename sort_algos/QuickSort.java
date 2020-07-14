public class QuickSort {
    public static void main(String[] args) {
        int arr[] = { 20, 35, -15, 7, 55, -22, 1 };

        quickSort(arr, 0, arr.length);

        for (int k = 0; k < arr.length; k++) {
            System.out.println(arr[k]);
        }
    }

    public static void quickSort(int[] input, int first, int last) {
        if (last - first <= 1) {
            return;
            // end recursion if last becomes smaller than first i.e. they cross each other
        }

        int pivotIndex = partition(input, first, last);

        // quick sort the left sub-array
        quickSort(input, first, pivotIndex);
        // quick sort the right sub-array
        quickSort(input, pivotIndex + 1, last);
    }

    public static int partition(int[] input, int first, int last) {
        int pivot = input[first];
        int i = first;
        int j = last;

        while (i < j) {

            /* First we find value < pivot on it's RHS and move it to LHS */

            // keep decreasing j until value < pivot is found on it's LHS
            while (i < j && input[--j] >= pivot)
                ;

            // if loop breaks, it means we found a value < pivot
            if (i < j) {
                input[i] = input[j];
            }

            /* Now we find value > pivot on it's LHS and move it to RHS */

            // keep increasing i until value > pivot is found on it's RHS
            while (i < j && input[++i] <= pivot)
                ;

            // if loop breaks, it means we found a value > pivot
            if (i < j) {
                input[j] = input[i];
            }
        }

        // finally, j is the actual sorted position of pivot elem
        input[j] = pivot;
        return j;
    }
}