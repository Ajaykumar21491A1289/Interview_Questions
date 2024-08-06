package StringHifentofirst;
import java.util.*;
public  class Sample {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the String");
		String s =sc.nextLine();
        String[] s1 =s.split("-");
        int len = s1.length;
        int j=0;
        for(int i=0;i<len-1;i++) {
        	System.out.print("-");
        }
        for(String sr:s1)
        	System.out.print(sr);
	}

}
