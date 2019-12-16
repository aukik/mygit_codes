package SI_Ques;

public class Test2{
    public static void printInfo(People p){
        p.printName();
        p.printDesignation();
        p.printResearch();
    }
    public static void main(String[] args){
        AssistantProfessor p1=new AssistantProfessor("John","Big Data");
        printInfo(p1);
        System.out.println("---------------------");
        AssociateProfessor p2=new AssociateProfessor("Bob","Networks");
        printInfo(p2);
    }
}