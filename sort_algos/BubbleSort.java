public class BubbleSort {
    public static void main(String[] args) {
        // Descending order sorted
        int intArr[] = new int[] { 20, 35, -15, 7, 55, -22, 1 };
        int x;
        for (int firstUnsortedIndex = 0; firstUnsortedIndex < intArr.length; firstUnsortedIndex++) {
            for (int j = intArr.length - 1; j > firstUnsortedIndex; j--) {
                if (intArr[j] > intArr[j - 1]) {
                    x = intArr[j];
                    intArr[j] = intArr[j - 1];
                    intArr[j - 1] = x;
                }
            }
        }
        for (int k = 0; k < intArr.length; k++) {
            System.out.println(intArr[k]);
        }

    }
}