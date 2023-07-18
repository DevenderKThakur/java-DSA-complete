public class lsearch {
    public static void main(String[] args) {
        int[] arr = {18,12,9,14,77,50};
        int target = 5;
        System.out.println(linearSearch(arr, target));
    }
    static int linearSearch(int[] arr, int target){
        if(arr.length == 0){
            return -1;
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                return i+1 ;
            }
        }
        return -1;
    }
}
