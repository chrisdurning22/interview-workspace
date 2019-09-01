public class BubbleSortExample {

	// the first loop makes sure the small numbers 
	// at the back make it all the way to the front.

	static void bubbleSort(int[] arr) {  
        int n = arr.length;  
        int temp = 0;  
         for(int i = 0; i < n; i++){  
             for(int j = 1; j < (n-i); j++){  
                  if(arr[j-1] > arr[j]){  
                     //swap elements  
                     temp = arr[j-1];  
                     arr[j-1] = arr[j];  
                     arr[j] = temp;  
                 }  
                      
             }  
         }  

	public static void main(String [] args){


	}
}