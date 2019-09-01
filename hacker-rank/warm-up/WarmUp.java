import java.util.HashMap;

public class WarmUp {
	static int sockMerchant(int n, int[] ar) {
        int pairs = 0;
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        // filling hashmap
        for(int i = 0; i < n; i++) {
            if(map.get(ar[i]) == null) {
                map.put(ar[i], 1);
            } else {
                int count = map.get(ar[i]);
                count++;
                map.put(ar[i], count);
            }
        }

        for (int i : map.keySet()) {
            pairs = pairs + (map.get(i) / 2);
        }

        return pairs;
    }

    public static void main(String [] args) {
    	int [] arr = {1, 2, 1, 2, 1, 2, 3};
    	
        //should be 4
    	System.out.println(sockMerchant(arr.length, arr));

    }
}



/*  
    1 -> 4
    3 -> 5 
    2 -> 1

    
*/