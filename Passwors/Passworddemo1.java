package Passwors;
import java.util.Scanner;
public class Passworddemo1 {
public static int isValidPassword(String str) {
	if(str.length()<4)
		return 0;
	if(Character.isDigit(str.charAt(0)))
		return 0;
	boolean hasdigit = false;
	boolean hasuppercase = false;
	for(char ch:str.toCharArray()) {
		if(ch == ' ' || ch == '/')
			return 0;
		if(Character.isDigit(ch)) 
			hasdigit = true;
		
		if(Character.isUpperCase(ch)) 
			hasuppercase = true;
				
	}
	if(hasdigit && hasuppercase)
		return 1;
    return 0;
    
}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Eneter the Password");
		String s = sc.nextLine();
		System.out.println(isValidPassword(s));

	}

}
