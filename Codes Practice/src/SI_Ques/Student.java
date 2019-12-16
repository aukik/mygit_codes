package SI_Ques;

public abstract class Student implements Study, CompetitiveProgramming {
    private String name = "";
    public Student(String name){
        this.name = name;
    }
    public final void printName(){
        System.out.println("My name is "+name);
    }
    public abstract void printCourse();
}