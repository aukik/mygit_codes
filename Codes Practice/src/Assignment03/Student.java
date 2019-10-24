package Assignment03;

public class Student {
    public String name;
    public int id;
public String s;
public static int numberOfStudents=3;
  public Student(String a,int i){
      this.name=a;
      this.id=i;
  }
public  Student(){
         s="default name";
    }

    Student(String a){
         s=a;
    }
    public String getName(){
        return s;
    }

    }

