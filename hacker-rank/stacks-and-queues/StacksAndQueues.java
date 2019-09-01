import java.util.*;
import java.lang.*;

public class StacksAndQueues {

	static String isBalanced(String s) {
		Stack<Character> stack = new Stack<Character>();
        for(int i = 0; i < s.length(); i++) {
        	if(s.charAt(i) == '(') {
        		stack.push('(');
        	}
        	if(s.charAt(i) == '{') {
        		stack.push('{');
        	}
        	if(s.charAt(i) == '[') {
        		stack.push('[');
        	}
        	if(s.charAt(i) == ')') {
        		if(stack.isEmpty()) {
        			return "NO";
        		}
        		if(stack.pop() != '(') {
        			return "NO";
        		}
        	}
        	if(s.charAt(i) == '}') {
        		if(stack.isEmpty()) {
        			return "NO";
        		}
        		if(stack.pop() != '{') {
        			return "NO";
        		}
        	}
        	if(s.charAt(i) == ']') {
        		if(stack.isEmpty()) {
        			return "NO";
        		}
        		if(stack.pop() != '[') {
        			return "NO";
        		}
        	}	

        }

    	if(stack.isEmpty()) {
    		return "YES";
    	} else {
    		return "NO";
    	}
	}

	static Stack headOnTop = new Stack();
    static Stack headOnBottom = new Stack();


    public static void enqueue(int x) {
    	headOnBottom.push(x);
    }

    public static int dequeue() {
        prepHeadOnTop();
        return (int)headOnTop.pop();
    }

    public static int peek() {
    	prepHeadOnTop();
        return (int)headOnTop.peek();
    }

    public static void prepHeadOnTop() {
    	if(headOnTop.empty()) {
    		while(!headOnBottom.empty()) {
    			headOnTop.push(headOnBottom.pop());
    		}
    	}
    }

	public static void main(String [] args) {
		enqueue(1);
		dequeue();
		enqueue(2);
		enqueue(3);
		enqueue(4);
		dequeue();
		enqueue(5);

		Stack stack = new Stack();

		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);

		System.out.println(stack.pop());
		System.out.println(stack.peek());
	}
}
