import java.util.Scanner ;
class conditionloop {
  public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    
   // calculate factorial of a number 
    int num1 = sc.nextInt();
    int f = 1;
    for(int i = 1;i<=num1;i++){
      f=f*i;
    }
    System.out.println(f);

    // reverse a number 
    int rem , rev =0;
    int num2 = sc.nextInt();
    while(num2!=0){
      rem = num2%10;
      rev = rev*10+rem;
      num2= num2/10;
    }
    System.out.println(rev);
    
    // fibonacci series 
    int a = 0 , int b = 1;
    for(int i = 1;i<=10;i++){
      c = a + b;
      System.out.println(c);
      a = b;
      b = c ;
    }
    // to check weather the number is palindrome or not 
    int rem2 , rev2 =0;
    int num3 = sc.nextInt();
    int temp = num2 ;
    while(temp!=0){
      rem = temp%10;
      rev = rev*10+rem;
      temp= temp/10;
    }
    if(num3 == rev2){
      System.out.println("palindrome");
    }else{
        System.out.println("not a palindrome");
    }
  }
}
