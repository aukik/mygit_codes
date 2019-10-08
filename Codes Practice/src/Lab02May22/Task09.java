package Lab02May22;
import java.util.Scanner;
public class Task09 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num[]=new int[10];
        for (int i = 0; i < num.length; i++) {
          num[i]=sc.nextInt();
        }
        for (int i = 0; i <num.length ; i+=2) {
         System.out.println(num[i]);
        }
        for (int i = 1; i <num.length ; i+=2) {
            System.out.println(num[i]);
        }
    }
}
