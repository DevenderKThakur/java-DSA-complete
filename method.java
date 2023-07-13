import java.util.Scanner;
public class method{
    public static void main(String[] args) {
       Scanner sc = new Scanner (System.in);
       // System.out.println("enter the first ");
       // int a = sc.nextInt();
       // System.out.println("enter the second ");
       // int b = sc.nextInt();
       // System.out.println("enter the third  ");
       // int c = sc.nextInt();
       // int largest = largest(a, b, c);
       // System.out.println("largest number  "+largest);
       // int low  = smallest(a, b, c);
       // System.out.println("smallest number "+low);

        // int n = sc.nextInt();
        // oddEven(n);
    }
    public static int largest (int a , int b , int c ){
        int max = a;
        if(b>max){
            max = b ;
        }
         if (c > max){
            max = c;
        }
        return max;  
    }
        public static int smallest  (int a , int b , int c ){
        int small = a;
        if(b<small){
            small = b ;
        }
         if (c < small){
            small = c;
        }
        return small;  
    }
    // to find the number is even or odd
       static void oddEven(int n ){
        if(n%2==0){
            System.out.println("Even");
        }else{
            System.out.println("odd");
        }
    }
   
}
