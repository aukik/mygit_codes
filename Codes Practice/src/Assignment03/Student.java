package Assignment03;

public class Student {
public String s;
public static int numberOfStudents=3;
    Student(){
         s="default name";
    }

    Student(String a){
         s=a;
    }
    public String getName(){
        return s;
    }

    }

