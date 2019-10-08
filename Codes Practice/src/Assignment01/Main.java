package Assignment01;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);

     System.out.println("Enter the size of matrix");
     int n=sc.nextInt();
        int[][] result=new int[n][n];
        System.out.println("Enter values for MatA:");
     int[][] matA=operation.input(n);
        System.out.println("Enter values for MatB:");
     int[][] matB=operation.input(n);
        System.out.println("Press a for addition,s for subtraction,m for multiplication");
        char c=sc.next().charAt(0);
     switch (c){
         case 'a':
             result=operation.add(matA,matB);
             break;
         case 's':
             result=operation.sub(matA,matB);
         case 'm':
             result=operation.mul(matA,matB);
             break;
     }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("["+result[i][j]+"]");
            }
            System.out.println();
        }
    }
}
