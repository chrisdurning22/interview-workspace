public class MergeSortExample {

   //
    public static void mergeSort(int arr[], int left, int right) 
    { 
        if(left < right) {

            // Same as (l+r)/2, but avoids overflow for 
            // large l and h 
            int mid = left + (right - left) / 2;
            mergeSort(arr, left, mid);
            mergeSort(arr, mid+1, right);
            merge(arr, left, mid, right);

        
        }

        System.out.println(" ");
        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }

    public static void merge(int arr[], int left, int mid, int right) {

        int m1 = mid - left + 1; // l.length
        int m2 = right - mid; // r.length

        int [] l = new int [m1];
        int [] r = new int [m2];


        // populate arrays 
        for(int i = 0; i < m1; i++) {
            l[i] = arr[left + i];
        }

        for(int i = 0; i < m2; i++) {
            r[i] = arr[mid + 1 + i];
        }

        int i = 0;
        int j = 0;
        int k = 0;

        while(i < m1 && j < m2) {

            if( l[i] < r[j] ) {
                arr[k] = l[i];
                k++;
                i++;
            } 
            else {
                arr[k] = r[j];
                k++;
                j++;
            }
        }

        while(i < m1) {
            arr[k] = l[i];
            i++;
            k++;
        }

        while(j < m2) {
            arr[k] = r[j];
            j++;
            k++;
        }
    }

    public static void main(String [] args){
        int [] arr = {2, 1, 5, 4, 3};
        mergeSort(arr, 0, arr.length - 1);
    }
}