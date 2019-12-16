package SI_Ques;

public class Student1 extends Person {
    public String department;
    public long ID;
    public Student1(String department,long ID,String name){
     super(name);
     this.department=department;
     this.ID=ID;
    }
    public void setDepartment(String a){
        department=a;
    }
    public void printDetail(){
        System.out.println("Department: "+department+", ID: "+ID+", Name: "+getName());
    }
}
