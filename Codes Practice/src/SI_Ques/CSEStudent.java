package SI_Ques;

public class CSEStudent extends Student{
    public String course;
    public String competition;
    public CSEStudent(String name,String course,String competition){
        super(name);
        this.course=course;
        this.competition=competition;
    }

    @Override
    public void printActivity() {
        System.out.println("Preparing for the competition:"+competition);
    }

    @Override
    public void printCourse() {
        System.out.println("My course is: "+course);
    }
}
