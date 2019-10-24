package Assignment04;
import java.util.ArrayList;
public class University {
    public String name;
    public boolean hasCampus;

    public University(){}


    public Student students[]=new Student[200];
//    public ArrayList<Student> students = new ArrayList<Student>();

    public int count=0;
    public University(String n){
        this.name=n;

    }
    public University(String n,boolean c){
        this.name=n;
        this.hasCampus=c;

    }

    public void add(Student s){
        students[count]=s;
        count++;
        s.uni=this.name;
        s.campus=this.hasCampus;
    }


   public String toString(){
        return "University{name='"+this.name+"', hasCampus="+this.hasCampus+"}";
   }
   public int totalStudents(){
        return count;
   }
   public boolean needCampus(){
        boolean temp=true;
        if(hasCampus==true){temp=false;}
        return temp;
   }

}
