import java.util.Arrays;

public class sorting {
    public static void main(String[] args) {
        int[] arr = {7,8,3,1,2};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    // time complexity 0(n^2)  worst case 
    static void  bubbleSort(int [] arr){
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int t = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = t ;
                }
            }
        }
    }
    // time complexity o(n^2)  it is when the array is  1 to N 
        static void selectionSort(int [] arr){
        for(int i=0;i<arr.length;i++){
            int low = i ;
            for(int j =i+1;j<arr.length;j++){
                if(arr[low]>arr[j]){
                    low = j ;
                }
            }
            int t = arr[low];
            arr[low] = arr[i];
            arr[i] = t;
        }
    }
    static void insertionSort(int [] arr ){
        for(int i=0;i<arr.length;i++){
            int current = arr[i];
            int j = i-1;
            while(j>=0 && current < arr[j]){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = current;
        }
    }
    //  cycle sort O(n)
    static void cyclesort(int [] arr ){
        for(int i=0;i<arr.length;i++){
            int correct = arr[i] - 1;
            if(arr[i] != arr[correct]){
                int t = arr[i];
                arr[i] = arr[correct];
                arr[correct] = t ;
            }
        }
    }
}
