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
}
