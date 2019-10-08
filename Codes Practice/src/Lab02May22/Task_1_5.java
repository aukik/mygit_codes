package Lab02May22;
import java.util.Scanner;
public class Task_1_5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double I,E,R,L,C,f;
        System.out.println("Enter Voltage");
        E=sc.nextInt();
        System.out.println("Enter Resistance");
        R=sc.nextInt();
        System.out.println("Enter Inductance");
        L=sc.nextInt();
        System.out.println("Enter Capacitance");
        C=sc.nextInt();
        System.out.println("Enter frequency");
        f=sc.nextInt();

        I=E/Math.sqrt(R*R+(2*3.1416*f*L-(1/(2*3.1416*f*C)))*(2*3.1416*f*L-(1/(2*3.1416*f*C))));
        System.out.println(E);
    }
}
