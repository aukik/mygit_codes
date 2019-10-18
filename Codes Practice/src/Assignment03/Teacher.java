package Assignment03;

public class Teacher {
    public String name;
    public String department;
    public Course course[]=new Course[3];
    int count=0;
    Teacher(String n,String d){
        this.name=n;
        this.department=d;

    }

   public void addCourse(Course a){
        course[count]=a;
       count++;
    }

    public void printDetail(){
        System.out.println("=================================================");
        System.out.println("Name: "+name);
        System.out.println("Department: "+department);
        System.out.println("List of courses");
        System.out.println("=================================================");
       if(count<=2){
           for (int i = 0; i <course.length-1 ; i++) {
               System.out.println(course[i]);
           }
       }else {
           for (int i = 0; i < course.length; i++) {
               System.out.println(course[i]);
           }
       }
    }

}
