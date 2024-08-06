package Arrays;

import java.util.Scanner;

public class IsDiagonal {
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
		boolean flag = false;
		for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (i == j && arr[i][j] == 1) {
                    flag=true;
                }
                
            }
        }
		if(flag) {
			System.out.println("It is a Diagonal Matrix");
		}
		else
			System.out.println("It is not a diagnal matrix");

    }
    }