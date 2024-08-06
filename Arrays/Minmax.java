package Arrays;
import java.util.Scanner;
import java.util.Arrays;
public class Minmax {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array size");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter the values in to the array");
		for(int i=0 ; i<n;i++) {
			arr[i]=sc.nextInt();
}
Arrays.sort(arr);
System.out.println("the min value is"+arr[0]);
System.out.println("the Second min value is"+arr[1]);
System.out.println("the max value is"+arr[n-1]);
System.out.println("the Second max value is"+arr[n-2]);



	}

}
