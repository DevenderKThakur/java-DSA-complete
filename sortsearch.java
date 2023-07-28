import java.util.Arrays;

public class sortsearch {
    public static void main(String[] args) {
        int[] arr = {12,34,2,5,6,7};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
        int target = 2 ;
        int index = binarySearch(arr, target);
        System.out.println(index);
    }
    static void selectionSort(int [] arr ){
        for(int i=0;i<arr.length;i++){
            int low = i ;
            for(int j=i+1;j<arr.length;j++){
                if(arr[low]>arr[j]){
                    low = j;
                }
            }
            int t = arr[low];
            arr[low] = arr[i];
            arr[i] = t ;
        }
    }
    static int binarySearch(int[] arr, int target){
          int start = 0;
          int end = arr.length;
          while(start <= end ){
             int mid = start + (end - start )/2;
             if(target > arr[mid]){
                start = mid + 1 ;
             }
             else if (target < arr[mid]){
                end = mid-1;
             }
             else{
                return mid ;
             }
          }
          return - 1 ;
    }
}
