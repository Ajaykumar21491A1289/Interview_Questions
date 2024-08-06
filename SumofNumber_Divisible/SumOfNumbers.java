package SumofNumber_Divisible;

public class SumOfNumbers {

    public static int calculateDifference(int n, int m) {
        int sumDivisible = 0;
        int sumNotDivisible = 0;

        for (int i = 1; i <= m; i++) {
            if (i % n == 0) {
                // If the number is divisible by n
                sumDivisible += i;
            } else {
                // If the number is not divisible by n
                sumNotDivisible += i;
            }
        }

        // Difference between the sum of numbers not divisible by n and the sum of numbers divisible by n
        return sumNotDivisible - sumDivisible;
    }

    public static void main(String[] args) {
        int n = 4;
        int m = 20;
        
        int result = calculateDifference(n, m);
        System.out.println(result); // Output: 90
    }
}
