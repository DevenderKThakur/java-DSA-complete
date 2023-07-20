import java.util.Scanner;

public class newFile{
    public static void main(String[] args) {
    //   Scanner sc = new Scanner(System.in);
    //   int [] nums = new int[5];
    //   for(int i =0;i<5;i++){
    //     nums[i] = sc.nextInt();
    //   }
    // //   System.out.println(maxVal(nums));
    // //   System.out.println(minVal(nums));
    //     System.out.println(check(nums));
       Scanner sc = new Scanner(System.in);
      int[][] arr = new int[2][2];
      int x = sc.nextInt();
      for(int i=0;i<2;i++){
        for(int j=0;j<2;j++){
            arr[i][j] = sc.nextInt();
        }
      }
    //   transpose of a matrix 
      for(int j =0;j<2;j++){
        for(int i=0;i<2;i++){
            System.out.println(arr[i][j]);   
        }
      }
    //   search element in the array 
      for(int i=0;i<2;i++){
        for(int j=0;j<2;j++){
            if(arr[i][j] == x){
                System.out.println(i+""+j);  //return new int[]{i,j}
            }
        }
      }
    }
    static int maxVal(int[] nums){
        int max = nums[0];
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max){
                max = nums[i];
            }
        }
        return max ;
    }
      static int minVal(int[] nums){
        int min = nums[0];
        for(int i=0;i<nums.length;i++){
            if(nums[i]<min){
                min = nums[i];
            }
        }
        return min ;
    }
    static boolean check(int[] nums){
        for(int i=0;i<5-1;i++){
            if(nums[i]>nums[i+1]){
               return false;
            }
        }
        return true ;
    }
}
