package SI_Ques;
import java.util.Scanner;
public class Task4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int max=0;
        int num[]=new int[10];
        for (int i = 0; i < num.length; i++) {
            int a;
            a=sc.nextInt();
            a=a*-1;
            num[i]=a;
            if(a<0){
                num[i]=0;
            }
            else{
                for (int j = 0; j <i; j++) {
                    if(num[i]<num[j]){
                        max=num[i];
                        break;
                    }
                }

            }

        }
       if(max==0){
           System.out.println("missing data");
       }
       else{
           System.out.println(-max);
       }
    }
}
