public class binarySearch {
    public static void main(String[] args) {
        int[] arr = {2,4,6,9,11,12,14,20,36,48};
        int target = 14;
        int ans = search(arr, target);
        System.out.println(ans);
    }
    static int search(int[] arr , int target ){
        int start = 0;
        int end = arr.length-1;
        while(start <= end){
            int mid  = start + (end - start )/2;
            if(target > arr[mid]){
               start = mid + 1;
            }
            else if(target < arr[mid] ){
                end = mid -1 ;
            }
            else {
                return mid ;
            }       
        } 
        return -1;
    }
    static int orderAgnostic(int[] arr, int target ){
        int start = 0;
        int end = arr.length-1;
        boolean isAsc = arr[start] < arr[end];
        while(start<=end){
            int mid = start + (end - start )/2;
            if(arr[mid] == target){
               return mid;
            }

            if(isAsc){
               if(target > arr[mid]){
               start = mid + 1;
            }
            else{
                end = mid -1 ;
            }
            }
            else{
            if(target < arr[mid]){
               start = mid + 1;
            }
            else{
                end = mid -1 ;
            }
          }
        }
        return - 1;
    }
     // c = smallest element in array >= target
    static int ceiling(int [] arr , int target ){
        if(target > arr[arr.length -1 ]){
            return - 1;
        }
        int start = 0;
        int end = arr.length - 1 ;
        while (start <= end ){
            int mid = start + (end - start)/2;
            if(target < arr[mid]){
               end = mid - 1 ;
            }
            else if(target > arr[mid]){
                start = mid + 1;
            }
            else{
                return mid ;
            }
        }
        return start ;
    }
    //  c = greatest element in array <= target 
    static int floorSearch(int [] arr , int target ){
        int start = 0;
        int end = arr.length - 1 ;
        while (start <= end ){
            int mid = start + (end - start)/2;
            if(target < arr[mid]){
               end = mid - 1 ;
            }
            else if(target > arr[mid]){
                start = mid + 1;
            }
            else{
                return mid ;
            }
        }
        return end  ; 
    }
     //  char question 
    static char nextLetters(char [] letters , char target ){
        int start = 0;
        int end = letters.length-1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(target < letters[mid]){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return letters[start%letters.length];
    }
    // leet code 852
        int start = 0;
        int end = nums.length-1;
        while(start<end){
            int mid = start + (end -start)/2;
            if(nums[mid]>nums[mid+1]){
                end = mid ;
            }
            else{
                start = mid + 1;
            }
        }
        return start ;
}
