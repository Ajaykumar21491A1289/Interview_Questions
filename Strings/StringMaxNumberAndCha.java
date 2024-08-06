package Strings;
import java.util.*;
import java.util.regex.*;
public class StringMaxNumberAndCha {

	public static void main(String[] args) {
	String s = "12-28-2003";
	Pattern p = Pattern.compile("\\d+");
	//+ (Plus): Matches one or more of the preceding element.
	//\ (Backslash): Escapes special characters or denotes special sequences.

// \d matches any digit.
	/*Explanation of Example
Pattern: \\d+

\\d matches digits.
+ matches one or more digits.
Matcher:

Searches the input string for sequences of digits.
matcher.find() finds the next sequence that matches the pattern.
matcher.group() returns the matched sequence.
*/
	Matcher m = p.matcher(s);
	ArrayList<Integer> num = new ArrayList<>();
	while (m.find()) {
        num.add(Integer.parseInt(m.group()));
    }
	if (num.isEmpty()) {
        System.out.println("No numbers found in the string.");
    } else {
    	int max = num.get(0);
    	for(int n :num) {
    		if(n>max)
    			max =n;
    	}
    	System.out.println(max);
    	
    }
	
	}

}
