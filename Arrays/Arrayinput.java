package Arrays;
import java.util.Scanner;
public class Arrayinput {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array elements with space");
		String s = sc.nextLine();
		String s1 = new String(" ");
		String[] arr =s.split(s1);
		int[] num = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
            num[i] = Integer.parseInt(arr[i]); // Parse each string to integer
        }
        for(int i : num)
        	System.out.println(i);
        System.out.println(num[0]+num[1]);
	}

}

