package Programs;
import java.util.Scanner;
import java.util.Arrays;

public class PlayList {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Get the length of the array
        System.out.println("Enter the length of the array");
        int n = sc.nextInt();
        
        
        
        // Get the elements of the array
        System.out.println("Enter the elements into the array ");
        String k = sc.nextLine();
        sc.nextLine();
        String[] strArray = k.split(" ");
        
        int[] arr = new int[strArray.length];      
        // Get the favorite song position (1-based index)
        System.out.println("Enter the favorite song position");
        int pos = sc.nextInt();
        
        // Get the value of the favorite song before sorting
        int favoriteSong = arr[pos - 1]; // converting 1-based index to 0-based
        
        // Sort the array
        Arrays.sort(arr);
        System.out.println("elements after sorting");
        for(int i : arr) {
        	System.out.println(i);
        }
        // Find the new position of the favorite song after sorting
        for(int i = 0; i < n; i++) {
            if(favoriteSong == arr[i]) {
                System.out.println("The element position after sorting is " + (i + 1));
                break;
            }
        }
    }
}
