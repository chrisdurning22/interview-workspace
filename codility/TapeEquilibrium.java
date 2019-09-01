public class TapeEquilibrium {
	public int solution(int[] A) {
        // write your code in Java SE 8
        int sumToRight = 0;
        int sumToLeft = A[0];
        int smallest = 2147483647;
        
        for(int i = 1; i < A.length; i++ ) {
            sumToRight += A[i];
        }
        
        for(int i = 1; i < A.length; i++) {
            if(Math.abs(sumToLeft - sumToRight) < smallest) {
                smallest = Math.abs(sumToLeft - sumToRight);
            }
            sumToLeft += A[i];
            sumToRight += (A[i] * -1);
        }
        return smallest;
    }
}