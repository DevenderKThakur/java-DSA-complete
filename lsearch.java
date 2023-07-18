public class lsearch {
    public static void main(String[] args) {
        // int[] arr = {18,12,9,14,77,50};
        // int target = 5;
        // System.out.println(linearSearch(arr, target));
        // String name = "Devender";
        // char target = 'D';
        // System.out.println(search(name, target));
        int[] nums = {18,12,9,14,77,50};
        System.out.println(min(nums));
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
    // search in a string 
    static boolean search(String name , char target){
        if(name.length() == 0){
            return false ;
        }
        for(int i=0;i<name.length();i++){
            if(target == name.charAt(i)){
                return true ;
            }
        }
        return false ;
    }
    static int min(int[] nums ){
        int min = nums[0];
        for(int i = 0;i<nums.length;i++){
            if(nums[i]<min){
                min = nums[i];
            }
        }
        return min;
    }
}
