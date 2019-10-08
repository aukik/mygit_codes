package Lab02May22;
import java.util.Scanner;
public class Task_1_10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int c=0;
        int num;
        int arr[]=new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=0;
        }
        for (int i = 0;i<1 ; i--) {
           {
            num = sc.nextInt();
            if (num > 9) {
                System.out.println("Enter another number:");
                num = sc.nextInt();
            }
        }
         arr[num]++;
         if(arr[num]==2){
             c++;
         }
         if(arr[num]==5){
             System.out.println("give another number");
             c--;
         }
         if(arr[num]>5){
             System.out.println("give another number");
         }

         if(c==2){
             break;
         }

        }
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]>=2 && arr[i]<5){
                System.out.println(i);
            }
        }
    }
}
