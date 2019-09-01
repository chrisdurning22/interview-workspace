import java.util.regex.*;

public class RegexTesting {
	public static void main(String [] args) {

		// 1st way
		//Regex goes into pattern, the string goes into matcher

		Pattern p = Pattern.compile(".s");//. represents single character  
		Matcher m = p.matcher("as");  
		boolean b = m.matches();  

		// 2nd way
		// param 1 = regex, param 2 = string
		boolean b3 = Pattern.matches(".s", "as");  

	}	
}


// examples
// . means any character

Pattern.matches(".s", "as");//true (2nd char is s)  
Pattern.matches("..s", "mas");//true (3rd char is s) 

// [amn] means a or m or n 

Pattern.matches("[amn]", "abcd");//false (not a or m or n)

// quantifiers
Pattern.matches("[amn]?", "a");//true (a or m or n comes one time) 

// metacharacters
Pattern.matches("\\d", "abc");//false (non-digit)  

