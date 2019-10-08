package Assignment01;
import java.util.Scanner;
public class operation {

    public static int[][] input(int n){
     int[][] mat=new int[n][n];
        Scanner sc=new Scanner(System.in);
        for (int i = 0; i <mat.length ; i++) {
            for (int j = 0; j <mat[0].length ; j++) {
                mat[i][j]=sc.nextInt();
            }
        }
        return mat;
    }

    public static int[][] add(int[][] a,int[][] b){
        int[][] mat=new int[a.length][a.length];
        for (int i = 0; i <a.length ; i++) {
            for (int j = 0; j <a[0].length ; j++) {
                mat[i][j]=a[i][j]+b[i][j];
            }
        }
        return mat;
    }
    public static int[][] sub(int[][] a,int[][] b){
        int[][] mat=new int[a.length][a.length];
        for (int i = 0; i <a.length ; i++) {
            for (int j = 0; j <a[0].length ; j++) {
                mat[i][j]=a[i][j]-b[i][j];
            }
        }
        return mat;
    }
    public static int[][] mul(int[][] a,int[][] b){
        int sum=0;
        int[][] mat=new int[a.length][a.length];
        for (int i = 0; i <a.length ; i++) {
            for (int j = 0; j <a[0].length ; j++) {
                for (int k = 0; k < a.length; k++) {
                    sum=sum+(a[i][k]*b[k][j]);
                }
                mat[i][j]=sum;
                sum=0;
            }
        }
        return mat;
    }
}
