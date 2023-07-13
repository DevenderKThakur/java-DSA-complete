import java.util.Scanner;
public class array {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        // declaration of an array 
        // int[] arr = new int[5];

        // take input and store the value in array 
        // for(int i = 0;i<arr.length;i++){
        //     arr[i] = sc.nextInt();
        // }
        // print the array 
        // for (int i = 0;i<arr.length ;i++){
        //     System.out.println(arr[i]);
        // }
        
        // change the value of the first index of the array 
        // int[] num = {3,4,5,6,7};
        // System.out.println(num[0]);
        // change(num);
        // System.out.println(num[0]);

        //  2d array 
        int[][] arr = new int[3][3];

        // take input in the array 
        for (int i =0;i<3;i++){
            for(int j = 0;j<3;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        // print the array 
         for (int i =0;i<3;i++){
            for(int j = 0;j<3;j++){
              System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
     public static void change(int[] arr1){
        arr1[0] = 99; 
    }
}
