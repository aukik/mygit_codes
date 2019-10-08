package Lab02May22;

import java.util.Scanner;
public class Task_1_3 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num[]=new int[10];
        for (int i = 0; i < num.length; i++) {
             num[i]=sc.nextInt();
        }
        int temp;
        for (int i = 0; i <num.length-1; i++) {
            for (int j = 1; j <num.length-i ; j++) {
                if (num[j - 1] < num[j]) {
                    temp = num[j - 1];
                    num[j - 1] = num[j];
                    num[j]=temp;
                }

            }
            }
        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i]);
        }
    }
    }

