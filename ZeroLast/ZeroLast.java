package ZeroLast;

public class ZeroLast {

    public static void moveZerosToEnd(int[] arr) {
        if (arr == null || arr.length == 0) {
            return;
        }

        int nonZeroIndex = 0;
        // Index to place the next non-zero element
        // Traverse the array
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                // Place the current non-zero element at nonZeroIndex
                arr[nonZeroIndex] = arr[i];
                
                // Move the non-zero index to the right
                nonZeroIndex++;
            }
        }

        // Fill the remaining positions with zeros
        for (int i = nonZeroIndex; i < arr.length; i++) {
            arr[i] = 0;
        }
    }

    public static void printArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] array = {10, 0, 20, 30, 0, 30, 4};

        System.out.println("Original Array:");
        printArray(array);

        moveZerosToEnd(array);

        System.out.println("Array After Moving Zeros to End:");
        printArray(array);
    }
}
