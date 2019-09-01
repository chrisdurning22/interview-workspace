import java.util.*;

public class ArraysAndStrings {

	// Question 1

	public static boolean isUnique(String word) {
		if(word.length() > 128) {
			return false;
		} 

		boolean [] characters = new boolean[128];
		for(int i = 0; i < word.length(); i++) {
			int value = word.charAt(i);
			if(characters[value]) {
				return false;
			}
			characters[value] = true;
		}
		return true;

	}

	/* 	isUniqueChars() using bitmap: 
		
		this works on the lower case alphabet only, 
		(as a 32-bit integer will have 26 of its bits used up 
		corresponding to each of the lowercase letters)

		"zyxwvutsrqponmlkjihgfedcba" = 11111111111111111111111111

		in the 32 bit integer a 1 corresponds to true and on 0 corresponds to false, relating to whether or 
		not a letter existing in the input string.

		example:

		input string 	      = "abc"
		32 bit representation = 00000000000000000000000111

		what is happening:
		
		the 'checker' 32 bit integer is used to represent the characters found.

		val = the index where the current character should be placed in the 'checker' int, (the zero index starting at the right).

		checker |= (1 << val) :

		this will set the index for the current character to true, for example:
		if checker = 00000000000000000000000000 and 'a' is the current character then checker will be set to
		checker = 00000000000000000000000001

		checker & (1 << val) :

		if checker and (1 << val) have corresponding 1 values in the same index this means there is a duplicate 
		and based on the & operator a 1 will be produced in the calculation leading to false being return.

		for example
		string = "aa"
		last iteration of for loop:
		(checker) 00000000000000000000000001 & (1 << val) 00000000000000000000000001 = 1 


	*/

	public static boolean isUniqueChars(String word) {
		int checker = 0;
		for(int i = 0; i < word.length(); i++) {
			int val = word.charAt(i) - 'a';

			System.out.println("val " + val);
			int x = checker & (1 << val);
			System.out.println("& " + x);

			if((checker & (1 << val)) > 0) {
				return false;
			}
			checker |= (1 << val);
			System.out.println("checker " + checker + "\n");
		}
		return true;
	}

	// Question 2

	// my_answer
	public static boolean checkPermutation(String one, String two) {
		if(one.length() != two.length()) return false;

		boolean [] characters = new boolean[128];

		for(int i = 0; i < one.length(); i++) {
			int val1 = one.charAt(i);
			characters[val1] = true;
		}

		for(int i = 0; i < two.length(); i++) {
			int val2 = two.charAt(i);
			if(!characters[val2]) {
				return false;
			}
		}
		return true;
	}

	// the books answers
	public static String sort(String s) {
		char [] c = s.toCharArray();
		Arrays.sort(c);
		return new String (c);
	}


	public static boolean permutation1(String one, String two) {
		if(one.length() != two.length()) {
			return false;
		}

		return sort(one).equals(sort(two));
	}

	public static boolean permutation2(String one, String two) {
		if(one.length() != two.length()) {
			return false;
		}

		int [] letters = new int[128];
		for(int i = 0; i < one.length(); i++) {
			letters[one.charAt(i)]++;
		}

		for(int i = 0; i < two.length(); i++) {
			letters[two.charAt(i)]--;
			if(letters[two.charAt(i)] < 0) {
				return false;
			}
		} 
		return true;
	
	}

	// Question 3

	// my answer
	public static String Urlify(String input, int trueLength) {
		String [] words = input.split(" ");
		String output = "";

		for(int i = 0; i < words.length; i++) {
			output += words[i];
			if(i != words.length - 1) {
				output += "%20";
			}
		}
		return output;
	}

	public static void main(String [] args) {
		System.out.println(Urlify("Mr John Smith    ", 13));

		ArrayList<Boolean> arr = new ArrayList<Boolean>();
		arr.add(0, true);
	}
}