import java.util.Scanner;
public class transpose {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] a = new int[3][3];
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                a[i][j] = sc.nextInt();
            }
        }
        //  transpose matrix 
        int[][] b = new int[3][3];
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                b[i][j] = a[j][i];
            }
        }
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(b[i][j]);
            }
            System.out.println();
        }
    }
}
