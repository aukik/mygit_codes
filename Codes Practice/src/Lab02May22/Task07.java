package Lab02May22;

import java.util.Scanner;

public class Task07 {
    public static void main(String[] args) {
        char test='a';
        Scanner sc=new Scanner(System.in);
        int num[]=new int[10];
        for (int i = 0; i < num.length ; i++) {
         num[i]=sc.nextInt();
         if(num[i]==0){
             test='b';
         }
        }
        if(test=='b'){
            System.out.println("0");
        }
        for (int i = 0; i < num.length-1; i++) {
            for (int j = i+1; j < num.length-i; j++) {
                if(num[i]==num[j]){
                    num[j]=0;
                }
            }
            if(num[i]!=0){
                System.out.println(num[i]);
            }
        }
    }
}
