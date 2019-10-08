package oop_practice;
import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Numbers: ");
        operation gg=new operation();
        gg.x=sc.nextInt();
        gg.y=sc.nextInt();
        gg.sum();


    }
}
