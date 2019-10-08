package Lab02May22;
import java.util.Scanner;
public class Task_1_1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num[]=new int[10];
        for (int i = 0; i < num.length ; i++) {
         num[i]=sc.nextInt();
        }
        for (int i = num.length-1; i >=0 ; i--) {
            System.out.println(num[i]);
        }
    }
}
