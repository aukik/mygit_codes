package Lab02May22;
import java.util.Scanner;
public class Task_1_9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("For sorting numbers only in \n odd position press a \n even position press b \n all position press c");
       char input=sc.next().charAt(0);
        int num[]=new int[10];
        System.out.println("Enter 10 numbers:");
        for (int i = 0; i < num.length; i++) {
            num[i]=sc.nextInt();
        }

        int num1[]=new int[5];
      int c=0;
    if(input=='a'){
        for (int i = 1; i <num.length ; i+=2) {
            num1[c]=num[i];
            c++;

        }
        int temp;
        for (int i = 0; i <num1.length-1; i++) {
            for (int j = 1; j <num1.length-i ; j++) {
                if (num1[j - 1] < num1[j]) {
                    temp = num1[j - 1];
                    num1[j - 1] = num1[j];
                    num1[j]=temp;
                }

            }
        }
        for (int i = 0; i < num1.length; i++) {
            System.out.println(num1[i]);
        }
    }
    else  if(input=='b'){
            for (int i = 0; i <num.length ; i+=2) {
                num1[c]=num[i];
            c++;
            }
            int temp;
            for (int i = 0; i <num1.length-1; i++) {
                for (int j = 1; j <num1.length-i ; j++) {
                    if (num1[j - 1] < num1[j]) {
                        temp = num1[j - 1];
                        num1[j - 1] = num1[j];
                        num1[j]=temp;
                    }

                }
            }
            for (int i = 0; i < num1.length; i++) {
                System.out.println(num1[i]);
            }
        }
     else if(input=='c'){
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

}
