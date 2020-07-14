public class RadixSort {
    public static void main(String[] args) {
        int arr[] = { 4725, 4586, 1330, 8792, 1594, 5729 };

        radixSort(arr, 10, 4);

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
            ;
        }
    }

    public static void radixSort(int[] input, int radix, int width) {
        for (int i = 0; i < width; i++) {
            radixSingleSort(input, i, radix);
        }

    }

    // perform stable count sort for one particular digit position e.g. tens
    // position
    public static void radixSingleSort(int[] input, int position, int radix) {
        int length = input.length;
        // we are using counting sort
        int countArray[] = new int[radix];

        // put frequency of each digit in countArray
        for (int value : input) {
            countArray[getDigit(position, value, radix)]++;
        }

        // enforce stable sort
        for (int j = 1; j < radix; j++) {
            countArray[j] += countArray[j - 1];
        }

        // do stable count sort
        int temp[] = new int[length];
        for (int tempIndex = length - 1; tempIndex >= 0; tempIndex--) {
            temp[--countArray[getDigit(position, input[tempIndex], radix)]] = input[tempIndex];
        }

        // copy temp back to input
        for (int tempIndex = 0; tempIndex < length; tempIndex++) {
            input[tempIndex] = temp[tempIndex];
        }
    }

    public static int getDigit(int position, int value, int radix) {
        return value / (int) Math.pow(radix, position) % radix;
    }
}