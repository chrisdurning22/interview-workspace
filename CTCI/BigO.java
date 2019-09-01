public class BigO {
	
	public static void permutation(String str) {
		permutation(str, "");
	}

	public static void permutation(String str, String prefix) {
		if(str.length() == 0) {
			//System.out.println(prefix);
		} else {
			for(int i = 0; i < str.length(); i++) {
				String rem = str.substring(0, i) + str.substring(i + 1);
				permutation(rem, prefix + str.charAt(i));
			}
		}
	}

	public static int fib(int n) {
		if(n <= 0) return 0;
		else if(n == 1) return 1;
		return fib(n - 1) + fib(n - 2);
	}

	public static void main(String [] args) {
		permutation("abc");
		for(int i = 0; i < 10; i++) {
			System.out.println(fib(i));
		}
	}
}