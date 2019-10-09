package sep2;
import java.util.Scanner;
public class Task3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();

        for (int i = 0; i <str.length() ; i++) {
        char ch=str.charAt(i);
        int g=(int)ch;
        System.out.println(ch+":"+g);
        }
    }
}
