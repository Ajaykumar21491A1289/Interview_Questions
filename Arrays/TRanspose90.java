package Arrays;
import java.util.*;
public class TRanspose90 {

	public static void main(String[] args) {

		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the no.of rows in array");
		int r =sc.nextInt();
		System.out.println("Enter the no.of columns in array");
		int c = sc.nextInt();
		int[][] arr = new int[r][c];
		int arr1[][]=new int[r][r];
		System.out.println("Enter array Elements");
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		System.out.println("Aray elements Before Transpose");
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		//logic for transpose
		/*for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				arr1[j][i]=arr[i][j];
			}
		}*/
		
		
		//LOGIC FOR TRANSPOSE AND ROTATING TO 90 DEGREES
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				arr1[j][r-1-i]=arr[i][j];
			}
		}
		
		System.out.println("Aray elements after Transpose");
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				System.out.print(arr1[i][j]+" ");
			}
			System.out.println();
		}

	}

}
