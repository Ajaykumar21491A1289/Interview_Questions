package EvenOddPositionSum;
import java.util.*;

public class EvenOddPosition {

    public static int calculateSum(int[] arr) {
        if (arr.length == 0 || arr.length <= 3) {
            return 0;
        }
        
        List<Integer> evenPositions = new ArrayList<>();
        List<Integer> oddPositions = new ArrayList<>();
        
        // Separate elements into even and odd position lists
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                evenPositions.add(arr[i]);
            } else {
                oddPositions.add(arr[i]);
            }
        }
        
        // Sort the lists to find the required elements
        Collections.sort(evenPositions);
        Collections.sort(oddPositions);
        
        // Check if we have enough elements to find second largest and second smallest
        if (evenPositions.size() < 2 || oddPositions.size() < 2) {
            return 0;
        }
        
        // Find the second largest from even positions
        int secondLargestEven = evenPositions.get(evenPositions.size() - 2);
        
        // Find the second smallest from odd positions
        int secondSmallestOdd = oddPositions.get(1);
        
        // Return the sum
        return secondLargestEven + secondSmallestOdd;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array elements in single line:");
        String s = sc.nextLine();
        String[] arrStr = s.split(" ");
        int[] arr = new int[arrStr.length];
        
        for (int i = 0; i < arrStr.length; i++) {
            arr[i] = Integer.parseInt(arrStr[i]);
        }
        
        int result = calculateSum(arr);
        System.out.println(result);
        sc.close(); // Close the scanner
    }
}
