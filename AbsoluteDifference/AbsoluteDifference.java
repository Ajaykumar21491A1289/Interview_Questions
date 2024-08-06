package AbsoluteDifference;
import java.util.Scanner;

public class AbsoluteDifference {

    public static int countElementsWithDifference(int[] arr, int num, int diff) {
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (Math.abs(arr[i] - num) <= diff) {
                count++;
            }
        }

        return count > 0 ? count : -1;//if true return count if false return -1
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Size of Array");
        int n = sc.nextInt();

        System.out.println("Enter array elements in single line");
        sc.nextLine(); // Consume the newline
        String s = sc.nextLine();
        String[] arr = s.split(" ");

        int[] arr1 = new int[n];
        for (int i = 0; i < n; i++) {
            arr1[i] = Integer.parseInt(arr[i]);
        }
       

        System.out.println("Enter the number");
        int num = sc.nextInt();

        System.out.println("Enter the difference");
        int diff = sc.nextInt();

        int result = countElementsWithDifference(arr1, num, diff);
        System.out.println(result);

        sc.close(); // Close the scanner
    }
}
