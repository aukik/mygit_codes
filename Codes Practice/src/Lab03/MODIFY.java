package sep2;


import java.util.Scanner;
public class MODIFY {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        char num;

        for (int i = 65; i <91 ; i++) {
            int c=0;
            num=(char)i;

            for (int j = 0; j <str.length() ; j++) {
                if(num==str.charAt(j)){
                    c++;
                }

            }
        if(c>0){
            System.out.println(num+" which is "+i+" was found "+c +" times");
        }
        }
    }
}
