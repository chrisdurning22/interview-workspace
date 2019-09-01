import java.util.*;
import java.lang.*;

public class StringManipulation {

	static int makeAnagram(String a, String b) {
		int [] forA = new int[26];
		int [] forB = new int[26];
		int delections = 0;

		for(int i = 0; i < a.length(); i++) {
			forA[a.charAt(i) - 'a']++;
		}

		for(int i = 0; i < b.length(); i++) {
			forB[b.charAt(i) - 'a']++;
		}

		for(int i = 0; i < 26; i++) {
			delections += Math.abs(forA[i] - forB[i]);
		}

		return delections;
    }

    static int alternatingCharacters(String s) {
    	ArrayList<Character> list = new ArrayList<>();
    	int prev = 0;
    	int next = 1;

    	list.add(s.charAt(0));

    	while(next < s.length()) {
    		if(s.charAt(prev) != s.charAt(next)) {
    			list.add(s.charAt(next));
    			prev = next;
    		}
    		next++;
    	}
    	return s.length() - list.size();
    }

    static long substrCount(int n, String s) {
  		long count = 0;
  		for(int i = 0; i < n; i++) {
  			for(int j = 0; i - j >= 0 && i + j < n; j++) {
  				if(s.charAt(i - j) != s.charAt(i + j)) {
  					break;
  				} else {
  					count++;
  				}
  			}
  		}
  		return count;
    }

	public static void main(String [] args) {
		System.out.println(substrCount(7, "abcbaba"));
	}
}