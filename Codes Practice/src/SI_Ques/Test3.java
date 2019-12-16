package SI_Ques;

public class Test3 {
    public static void printInfo(Student s){
        s.printName();
        s.printCourse();
        s.printActivity();
    }
    public static void main(String[] args){
        CSEStudent s1=new CSEStudent("Jacob","CSE220","NCPC");
        printInfo(s1);
        System.out.println("---------------------");
        CSEStudent s2=new CSEStudent("Maryam","CSE221","ICPC");
        printInfo(s2);
    }
}
