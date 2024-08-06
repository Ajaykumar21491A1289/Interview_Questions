package LeastSumPair;
import java.util.*;
public class LeastSumPair {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the Sum value");
		
		int sum=sc.nextInt();
		System.out.println("Enter the size of an array");
		int n = sc.nextInt();
		System.out.println("Enter the elements with space");
		sc.nextLine();
		String s = sc.nextLine();
		String[] s1 = s.split(" ");
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=Integer.parseInt(s1[i]);
		}
		
        System.out.println(LeastSumPair(n,arr,sum));
	}

	private static int LeastSumPair(int size, int[] arr, int sum) {
		if(size<2 || size == 0)
			return -1;
		Arrays.sort(arr);
		int min = arr[0];
		int min2 = arr[1];
		if(min+min2 < sum)
			return min*min2;
		else
			return 0;
	}

}
