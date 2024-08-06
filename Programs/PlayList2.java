package Programs;
import java.util.Scanner;
import java.util.Arrays;

public class PlayList2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Get the elements of the array in a single line
        System.out.println("Enter the elements of the array separated by spaces:");
        String inputLine = sc.nextLine();
        
        // Split the input line into an array of strings
        String[] stringArr = inputLine.split(" ");
        
        // Convert the string array to an integer array
        int n = stringArr.length;
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(stringArr[i]);
        }

        // Get the favorite song position (1-based index)
        System.out.println("Enter the favorite song position");
        int pos = sc.nextInt();
        
        // Get the value of the favorite song before sorting
        int favoriteSong = arr[pos - 1]; // converting 1-based index to 0-based
        
        // Sort the array
        Arrays.sort(arr);
        
        // Find the new position of the favorite song after sorting
        for(int i = 0; i < n; i++) {
            if(favoriteSong == arr[i]) {
                System.out.println("The element position after sorting is " + (i + 1));
                break;
            }
        }
        
        sc.close();
    }
}
