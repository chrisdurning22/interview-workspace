public class MissingInteger {
	public int solution(int[] A) {
        // write your code in Java SE 8
        int smallest = 0;
        int highest = 0;
        boolean[] list = new boolean[1000001];
        
        for(int i = 0; i < A.length; i++) {
            //removes negatives and sets true values
            if(A[i] > 0) {
                list[A[i]] = true;
            }
            //finds highest value
            if(A[i] > highest) {
                highest = A[i];
            }
        }
        
        for(int i = 1; i <= highest; i++) {
            if(list[i] != true){
                smallest = i;
                break;
            }
        }
        
        if(smallest == 0) {
            smallest = highest + 1;
        }
        
        return smallest;
    }
}