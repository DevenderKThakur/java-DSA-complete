import java.util.Scanner;

public class index1 {
  public static void main(String[] args) {    
    Scanner sc = new Scanner (System.in);
    // primitive data type are which cannot be broken to more simple data 
    // e.g :-
    // int a = 4 ;
    // char name = 'b';
    // float marks = 123.7f;
    // double largeDecimalNumber = 1234.456;
    // long largeIntValue = 123445L;
    // bool yet = true;
    
// Question to solve

//  Write a program to print whether a number is even or odd, also take input from the user.
    int check = sc.nextInt();
    if(check%2==0){
      System.out.println("Even"); 
    }else{
      System.out.println("Odd"); 
    }
    
// Take name as input and print a greeting message for that particular name.
    String name = sc.next();
    System.out.println("Good Morning"+name); 
    
// Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.
    float pr = nextFloat();
    float rate = nextFloat();
    float time = nextFloat();
    System.out.println((pr*rate*time)/100); 

    
// Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)
      int n1 = sc.nextInt();
      int n2 = sc.nextInt();
      char opt = sc.next();
    
// Take 2 numbers as input and print the largest number.
    int a = sc.nextInt();
    int b = sc.nextInt();
    if(a>b){
      System.out.println(a); 
    }else{
       System.out.println(b); 
    }

// To reverse a string 
    String input = sc.next();
    String rev = "";
    for(int i = input.length()-1;i>=0;i--){
      rev = rev+input.charAt(i);
    }
    System.out.println(rev); 
    
// To calculate Fibonacci Series up to n numbers.
    
// To find out whether the given String is Palindrome or not.
    String input2 = sc.next();
    String rev2 = "";
    for(int i = input2.length()-1 ;i>=0;i--){
      rev2 = rev2+input2.charAt(i);
    }
    if(input2.equals(rev2)){
      System.out.println("palindrome");
    }else{
      System.out.println("not a palindrome ");
    }
    
// To find Armstrong Number between two given number.
  }
}
