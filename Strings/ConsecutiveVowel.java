package Strings;

public class ConsecutiveVowel {

	public static void main(String[] args) {
	   String s = "aeiou are vowels";
	   StringBuilder s1 = new StringBuilder();
	   int count =0;
	   for(char i : s.toCharArray()) {
		   if(i=='a' || i=='e' || i=='i' ||i=='o' || i=='u') {
			   
			   count++;
		   }   
		   else
	   			count =0;

		   if(count <=1) {
		   		s1.append(i);
		   }
		   		
	}
	   System.out.println(s1);
	}
}