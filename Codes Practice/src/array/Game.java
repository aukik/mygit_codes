package array;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char moves;

       String ar[][]=new String[4][4];
       String b="[", c="]",spc=" ",str="*";
        for (int i = 0; i < ar.length ; i++) {
            for (int j = 0; j <ar.length ; j++) {
                ar[i][j]=spc;
            }
        }int m=2,n=3;
       for(int k=0;k<100;k++){

        ar[m][n]=str;

        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < ar.length; j++) {
                System.out.print(b+ar[i][j]+c);
            }
        System.out.println();
        }

            moves = sc.next().charAt(0);
            if (moves == 'w') {
                ar[m - 1][n] = str;
                ar[m][n] = spc;
                m = m - 1;
            } else if (moves == 'd') {
                ar[m][n + 1] = str;
                ar[m][n] = spc;
                n = n + 1;
            } else if (moves == 's') {
                ar[m + 1][n] = str;
                ar[m][n] = spc;
                m = m + 1;
            } else if (moves == 'a') {
                ar[m][n-1] = str;
                ar[m][n] = spc;
                n = n - 1;
            }
        }
       //ggwp


    }
}
