package Assignment04;

public class Student {
    public String name;
    public static int id=0;

    University g=new University();
    public String typeOfStudent="Regular Student";
    public boolean a=false,b=false;
    public String course1;
    public String course2;
    public String course3;
    public String course4;
    public String uni;
    public boolean campus;
    public Student(String n,String t){
        this.name=n;
        this.typeOfStudent=t;
        this.id++;


    }
    public Student(String n){
        this.name=n;
       this.id++;

    }
    public int id_1=this.id;
    int x=0;
    public void addCourse(Course a,Course b,Course c,Course d){
        this.course1=a.course;
        this.course2=b.course;
        this.course3=c.course;
        this.course4=d.course;
        x=4;

    }
    public void addCourse(Course a,Course b,Course c){
        this.course1=a.course;
        this.course2=b.course;
        this.course3=c.course;
        x=3;
    }
    public String toString() {
        return "Name: "+this.name+"\nID: "+this.id_1+"\n"+this.typeOfStudent+"\nUniversity: "+this.uni+"\nList of Courses "+this.course1+" "+this.course2+" "+this.course3+" "+this.course4;
    }
    GG course=new GG();
    public class GG{
      public int size(){
          return x;
      }
    }
    public int getID(){
        return this.id_1;
    }
   public boolean b1=false ;
   public boolean isNSU(){

        if(this.campus=true){
            b1=true;
        }
        return b1;
   }

    public String getName(){
    return  this.name;
    }
    public boolean isPreUni(){
        if(typeOfStudent=="Pre-Uni"){
            b=true;
        }
        return b;
    }
   public void completePreUni(){
     typeOfStudent="Regular Student";
   }

}

