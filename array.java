import java.util.Scanner;
public class array {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        // declaration of an array 
        int[] arr = new int[5];

        // take input and store the value in array 
        for(int i = 0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        // print the array 
        for (int i = 0;i<arr.length ;i++){
            System.out.println(arr[i]);
        }
    }
}
