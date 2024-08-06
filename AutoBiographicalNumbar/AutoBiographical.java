package AutoBiographicalNumbar;
import java.util.HashSet;
import java.util.Set;
import java.util.Scanner;
public class AutoBiographical {

    public static int FindAutoCount(String n) {
        if (n == null || n.length() == 0) {
            return 0;
        }
        
        int length = n.length();
        int[] digitCount = new int[length];
        
        // Count occurrences of each digit
        for (char c : n.toCharArray()) {
            if (c < '0' || c > '9') {
                return 0; // Invalid character
            }
            int digit = c - '0';//asci value of c - asci value of 0 will return the integer value 
            if (digit >= length) {
                return 0; // Digit out of range
            }
            digitCount[digit]++;
        }
        
        // Check if the number is autobiographical
        for (int i = 0; i < length; i++) {
            if (digitCount[i] != n.charAt(i) - '0') {
                return 0; // Not autobiographical
            }
        }
        
        // Count distinct digits
        Set<Character> distinctDigits = new HashSet<>();
        for (char c : n.toCharArray()) {
            distinctDigits.add(c);
        }
        
        return distinctDigits.size();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        String num = sc.next();
        System.out.println(FindAutoCount(num));
        
    }
}


















/*
 
Let’s walk through the `FindAutoCount` method with the input `"1210"` to see how it processes this example.

### Example: Input `"1210"`

1. **Initial Checks**
   ```java
   if (n == null || n.length() == 0) {
       return 0;
   }
   ```
   The input `"1210"` is neither null nor empty, so we proceed to the next step.

2. **Setup for Digit Counting**
   ```java
   int length = n.length(); // length = 4
   int[] digitCount = new int[length]; // digitCount = [0, 0, 0, 0]
   ```
   The length of the string is 4, so `digitCount` is initialized to an array of size 4 with all values set to 0.

3. **Counting Occurrences of Each Digit**
   ```java
   for (char c : n.toCharArray()) {
       if (c < '0' || c > '9') {
           return 0; // Invalid character
       }
       int digit = c - '0';
       if (digit >= length) {
           return 0; // Digit out of range
       }
       digitCount[digit]++;
   }
   ```
   - For `c = '1'`: 
     - `digit = 1 - '0' = 1`
     - `digitCount[1]` is incremented: `digitCount = [0, 1, 0, 0]`
   - For `c = '2'`:
     - `digit = 2 - '0' = 2`
     - `digitCount[2]` is incremented: `digitCount = [0, 1, 1, 0]`
   - For `c = '1'` again:
     - `digit = 1 - '0' = 1`
     - `digitCount[1]` is incremented again: `digitCount = [0, 2, 1, 0]`
   - For `c = '0'`:
     - `digit = 0 - '0' = 0`
     - `digitCount[0]` is incremented: `digitCount = [1, 2, 1, 0]`

4. **Checking if the Number is Autobiographical**
   ```java
   for (int i = 0; i < length; i++) {
       if (digitCount[i] != n.charAt(i) - '0') {
           return 0; // Not autobiographical
       }
   }
   ```
   - For `i = 0`:
     - `digitCount[0] = 1`, `n.charAt(0) - '0' = 1`
     - They match, so proceed.
   - For `i = 1`:
     - `digitCount[1] = 2`, `n.charAt(1) - '0' = 2`
     - They match, so proceed.
   - For `i = 2`:
     - `digitCount[2] = 1`, `n.charAt(2) - '0' = 1`
     - They match, so proceed.
   - For `i = 3`:
     - `digitCount[3] = 0`, `n.charAt(3) - '0' = 0`
     - They match.

   Since all conditions are met, the number `"1210"` is autobiographical.

5. **Counting Distinct Digits**
   ```java
   Set<Character> distinctDigits = new HashSet<>();
   for (char c : n.toCharArray()) {
       distinctDigits.add(c);
   }
   ```
   - For `c = '1'`: `distinctDigits = {'1'}`
   - For `c = '2'`: `distinctDigits = {'1', '2'}`
   - For `c = '1'`: No change (already in the set)
   - For `c = '0'`: `distinctDigits = {'0', '1', '2'}`

   The distinct digits are `'0'`, `'1'`, and `'2'`.

6. **Returning the Count of Distinct Digits**
   ```java
   return distinctDigits.size(); // Returns 3
   ```

### Summary

For the input `"1210"`:
- The method confirms that `"1210"` is an autobiographical number.
- It counts the distinct digits: `'0'`, `'1'`, and `'2'`.

Therefore, the output is `3`.


*/
