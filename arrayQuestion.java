import java.util.Arrays;
public class arrayQuestion{
  public static void main(String[] args){
        // swap the value 
        // int[] arr = {1,3,23,9,18};
        // swap(arr, 1,3);
        // System.out.println(Arrays.toString(arr)

         // System.out.println(max(arr,0,4));  // to find max val

        //  rev(arr);
        // System.out.println(Arrays.toString(arr));
  }
   static void swap(int[] arr , int i , int j ){   // swap the value in array method 
        int t = arr[i];
        arr[i] = arr[j];
        arr[j] = t ;
    }
    static int max(int arr[] ,int start , int end ){   // fi nd the max value in tha array 
           int max = arr[start];
           for(int i = start ;i<end;i++){
            if(arr[i]>max){
                max = arr[i];
              }
           }
           return max ;
    }
       static void rev(int[] arr){    // to reverse an array 
         int start = 0 ;
         int end = arr.length-1; 
         while(start < end ){
            swap(arr,start,end);
            start++;
            end--;
         }
    }
}
