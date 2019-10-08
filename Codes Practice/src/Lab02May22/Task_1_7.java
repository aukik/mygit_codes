package Lab02May22;
import java.util.Scanner;
public class Task_1_7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num[]=new int[11];

        for (int i = 0; i < num.length ; i++) {
            int c=0;
            num[i]=sc.nextInt();
            for (int j = i-1; j >=0; j--) {
                if(num[i]==num[j]){
                    c++;
                }
                if(c>=4){
                    System.out.println("Enter different number: ");
                    i--;
                    break;
                }
            }

        }
        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i]);
        }
    }
}
