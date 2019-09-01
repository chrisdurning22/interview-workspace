public class Arrays {
	static int hourglassSum(int[][] arr) {

		int maxValue = -100;
		int i = 0;
		int j = 0;

		// based on the example array below, i at max value will be 3, therefore i+2 = 5 whihc is the max index (and
		// same for j)
		while(i < arr.length - 2 && j < arr[0].length - 2) {
			int topLeft = arr[i][j];
			int topMid = arr[i][j+1];
			int topRight = arr[i][j+2];
			int centre = arr[i+1][j+1];
			int bottomLeft = arr[i+2][j];
			int bottomMid = arr[i+2][j+1];
			int bottomRight = arr[i+2][j+2];
			int sum = topLeft + topMid + topRight + 
					centre + bottomLeft + bottomMid + bottomRight;


			System.out.println("[" + topLeft + "]" + " [" + topMid + "] " + "[" + topRight + "]" );
			System.out.println("   [" + centre + "]");
			System.out.println("[" + bottomLeft + "]" + " [" + bottomMid + "] " + "[" + bottomRight + "]" );
			System.out.println(" ");
			
			if(sum > maxValue) {
				maxValue = sum;
			}

			// j will be 3 before it's set back to zero
			// when j = 0, j is set to 1, when j = 1, j is set to 2
			if(j <  arr[0].length - 3) {
				j++;
			} else {
				j = 0;
				i++;
			}

		}
		System.out.println("i: " + i + " " + "j: " + j);
		return maxValue;
    }

    static int[] rotLeft(int[] a, int d) {
        int [] completeArray = new int[a.length];
        int index = d % a.length;

        for(int i = 0; i < a.length; i++ ){

        	if(index < a.length) {
        		completeArray[i] = a[index];
        	} else {
        		index = 0;
        		completeArray[i] = a[index];
        	}
        	index++;
        }
        return completeArray;
    }

    static void minimumBribes(int[] q) {
    
    }

    // [7 1 3 2 4 5 6] return min amount of swaps it takes to sort the array
    static int minimumSwaps(int [] arr) {
        int swaps = 0;
        for(int i = 0;i < arr.length;i++){
            if(arr[i] != i+1){
                int j = i;
                while(arr[j] != i+1){
                    j++;  
                }
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
                swaps++;
            }
        }
        return swaps;

    }

    public static void main(String [] args) {
    	//Q1
    	// int[][] twoDimenArray = { {3, 7, -3, 0, 1, 8},
    	// 						{1, -4, -7, -8, -6, 5}, 								
    	// 						{-8, 1, 3, 3, 5, 7}, 								
    	// 						{-2, 4, 3, 1, 2, 7}, 
    	// 						{2, 4, -5, 1, 8, 4}, 
    	// 						{5, -7, 6, 5, 2, 8} };
    	// hourglassSum(twoDimenArray);

    	//Q2
    	// int [] arr = {1,2,3,4,5};
    	// int [] a = rotLeft(arr, 10);

    	// for(int i = 0; i < arr.length; i++) {
    	// 	System.out.println(a[i]);
    	// }

    	//Q3
    	

    }
}