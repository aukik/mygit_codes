package Lab02May22;

import java.util.Scanner;

public class Task_1_8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int num[]=new int[10];
        char gg='a';
        int c1=0;
        for (int i = 0; i < num.length ; i++) {

            num[i]=sc.nextInt();
            if(num[i]==0){
                gg='b';
                c1++;
            }
            if(num[i]>9 || num[i]<0 ) {
                System.out.println("enter another number: ");
                i--;
            }


        }
        if(gg=='b' && (c1>=2 && c1<5) ){
            System.out.println("0");

        }

        for (int i = 0; i < num.length-1; i++) {
            int c=1;

            for (int j = num.length-1; j >i ; j--) {
                if(num[i]==0){
                    break;
                }
                if(num[i]==num[j]){
                    c++;
                num[j]=0;
                }
            }
        if(c>=2 && c<5){
            System.out.println(num[i]);

        }

        }
    }
}
