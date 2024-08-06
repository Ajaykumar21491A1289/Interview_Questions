package Rats;
import java.util.Scanner;

public class RatFamily {

    public static int checkFoodSufficiency(int r, int unit, int[] arr) {
        // Step 1: Check if the array is null
        if (arr == null) {
            return -1;
        }

        // Step 2: Calculate total amount of food required
        int totalFoodRequired = r * unit;

        // Step 3: Calculate the total amount of food from the minimum number of houses
        int totalFoodAvailable = 0;
        int houseCount = 0;
        
        for (int food : arr) {
            totalFoodAvailable += food;
            houseCount++;
            if (totalFoodAvailable >= totalFoodRequired) {
                return houseCount;
            }
        }

        // If not enough food is available even after considering all houses
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
     
        System.out.println("Enter the number of rats");
        int r = sc.nextInt();
      
        System.out.println("Enetr amount of food each rat consumes ");
        int unit = sc.nextInt();
     
        System.out.println("Enter the number of houses");
        int n = sc.nextInt();
        
        // Consume the leftover newline character after reading integers
        sc.nextLine();
        
     
        System.out.println("enter the food amounts as a single line");
       String s = sc.nextLine();
        String[] arr = s.split(" ");
      /* try { if(arr.length>n) 
        	throw new Arrayindexoutofbound(n);
       }catch(Arrayindexoutofbound e  ) {
    	   System.out.println(e);
       }*/
        // Convert the array of strings to an array of integers
       int[] rat = new int[n];
       try {
           for (int i = 0; i < n; i++) {
               rat[i] = Integer.parseInt(arr[i]);
           }
       } catch (NumberFormatException e) {
           System.out.println("Error: Invalid input format. Please enter valid integers.");
           sc.close();
           return;
       }
        // Check food sufficiency and print the result
        int result = checkFoodSufficiency(r, unit, 	rat);
        System.out.println(result);  // Output should be the count of houses or 0

        // Close the scanner
        sc.close();
    }
}
