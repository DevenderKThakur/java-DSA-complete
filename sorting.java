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
}
