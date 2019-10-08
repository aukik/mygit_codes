package Lab02May22;

import java.util.Scanner;
public class Task06 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int num[]=new int[15];
        for (int i = 0; i < num.length ; i++) {
            num[i]=sc.nextInt();
        }
        int check[]=new int[10];
        int e=0;
        for (int i = 0; i <check.length ; i++) {
            check[i]=e++;
        }
        for (int i = 0; i < check.length; i++) {
            int d=0;
            for (int j = 0; j < num.length; j++) {
                if(check[i]==num[j]){
                    d++;
                }
            }
            System.out.println("The number " + check[i]+" has been printed "+d+" times");
        }
    }

}
