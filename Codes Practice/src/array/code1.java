package array;

import java.util.Scanner;

public class code1 {
    public static void main(String[] args) {
        int b[]=new int[10];
        Scanner sc=new Scanner(System.in);
        for (int i = 0; i <b.length ; i++) {
         b[i]=sc.nextInt();
        }
        int temp=0;

        for (int i = 0; i < b.length-1 ; i++) {
            for (int j = 1; j<b.length-i ; j++) {
                if(b[j-1]<b[j]){
                  temp =b[j-1];
                  b[j-1]=b[j];
                  b[j]=temp;
                }
            }
        }
        for (int i = 0; i <b.length ; i++) {
            System.out.println(b[i]);
        }
    }
}

