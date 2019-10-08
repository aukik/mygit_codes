package Lab02May22;
import java.util.Scanner;
public class Task_1_2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int num;
        int x=2;
        String a="You have printed ";

        for (int i = 0; i <10; i++) {
            num=sc.nextInt();
            a=a+num;
            System.out.println(a);
           a=a+",";
        }
    }
}
