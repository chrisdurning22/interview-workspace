public class FrogRiverOne {
	public int solution(int X, int[] A) {
        // write your code in Java SE 8
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i = 0; i < A.length; i++) {
            map.put(A[i], i);
            if(map.size() == X) {
                return i;
            }
        }
        return -1;
    }
}