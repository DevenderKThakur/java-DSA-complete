import java.util.Scanner;
public class matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        // array m1 
        int[][] m1 = new int[3][3];
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                m1[i][j] = sc.nextInt();
            }
        }
        // array m2 
        int [][] m2 = new int[3][3];
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                m2[i][j] = sc.nextInt();
            }
        }
        int[][] m3 = new int[3][3];
          for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                m3[i][j] = m1[i][j] + m2[i][j];
            }
        }

        // print the result matrix 
          for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
               System.out.print(m3[i][j]);
            }
            System.out.println();
        }
    }
}
