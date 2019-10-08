package Lab02May22;
import java.util.Scanner;
public class Task08 {
    public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    int num[]=new int[10];
    for (int i = 0; i <num.length; i++) {
            num[i]=sc.nextInt();
        for (int j = i-1; j >=0 ; j--) {
            if(num[i]==num[j]){
                System.out.println("Enter a different number: ");
                i--;
            }
        }
        }
    }
}
