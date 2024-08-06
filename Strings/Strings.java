package Strings;
import java.util.Scanner;
public class Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Scanner sc =new Scanner(System.in);
  System.out.println("Enter the email id ");
  String s =sc.nextLine();
  int i = s.indexOf('@');
  int i1 = s.indexOf('.');
  String s1 =s.substring(i+1,i1);
  System.out.println(s1);
	}

}
