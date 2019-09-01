public static Brackets {
	public int solution(String S) {
        // write your code in Java SE 8
        Stack leftBrackets = new Stack();
       for(int i = 0; i < S.length(); i++) {
           if(S.charAt(i) == '(') {
               leftBrackets.push('(');
           }
           else if(S.charAt(i) == '{') {
               leftBrackets.push('{');
           }
           else if(S.charAt(i) == '[') {
               leftBrackets.push('[');
           } 
           else {
                if(leftBrackets.empty()) {
                   return 0;
                }
                
                char opposite = ' ';
                if(leftBrackets.peek() == Character.valueOf('(')) {
                    opposite = ')';
                } 
                else if(leftBrackets.peek() == Character.valueOf('{')) {
                    opposite = '}';
                } 
                else if(leftBrackets.peek() == Character.valueOf('[')) {
                    opposite = ']';
                }
                if(opposite == S.charAt(i)) {
                    leftBrackets.pop();
                }
           }
       }
       
       return (leftBrackets.empty()) ? 1 : 0;
    }
}