package Assignment02;

import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[][] x = {{1,1,1},{2,2,2},{3,3,3}};
        int[][] y = {{1,2,3},{4,5,6},{7,8,9}};

        print(x); //{{1,1,1},{2,2,2},{3,3,3}}
        print(y); //{{1,2,3},{4,5,6},{7,8,9}}

        swap(x,y);

        print(x); //{{1,2,3},{4,5,6},{7,8,9}}
        print(y); //{{1,1,1},{2,2,2},{3,3,3}}

        int[][] z = {{1,1,1},{2,2,2},{3,3,3},{4,4,4},{5,5,5},{6,6,6},{7,7,7}};

        int a[][] = reverseRow(z);

        print(z); //{{1,1,1},{2,2,2},{3,3,3},{4,4,4},{5,5,5},{6,6,6},{7,7,7}}
        print(a); //{{7,7,7},{6,6,6},{5,5,5},{4,4,4},{3,3,3},{2,2,2},{1,1,1}};

        int b[][] = join(x,y);

        print(b); //{{1,2,3},{4,5,6},{7,8,9},{1,1,1},{2,2,2},{3,3,3}}
    }

    public static void print(int x[][] ){
        for (int i = 0; i <x.length ; i++) {
            for (int j = 0; j <x[0].length ; j++) {
                System.out.print(x[i][j]);
            }
            System.out.println();
        }
    }
    public static int [][] swap(int x[][],int y[][]){
        int temp[][]=new int[x.length][x[0].length];
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[0].length; j++) {
                temp[i][j]=x[i][j];
                x[i][j]=y[i][j];
                y[i][j]=temp[i][j];
            }
        }
        return temp;

    }

    public static int[][] reverseRow(int x[][]){
        int temp[][]=new int[x.length][x[0].length];
        int l=0,m=0;
        for (int i = x.length-1; i >= 0 ; i--) {
            m=0;
            for (int j = x[0].length-1; j >= 0 ; j--) {
               temp[l][m]= x[i][j];
               m++;
            }
            l++;
        }
        return temp;
    }

    public static int[][] join (int x[][],int y[][] ){
        int sum[][]=new int[x.length+y.length][x[0].length];
        for (int i = 0; i <x.length ; i++) {
            for (int j = 0; j <x[0].length ; j++) {
                sum[i][j]=x[i][j];
            }
        }int c=0;
        for (int i = x.length; i <x.length + y.length ; i++) {

            for (int j = 0; j < x[0].length; j++) {
                sum[i][j]=y[c][j];

            }
            c++;
        }
        return sum;
    }

}
