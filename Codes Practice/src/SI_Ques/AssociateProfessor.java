package SI_Ques;

public class AssociateProfessor extends People{
    public String Data;
    public String Designation="Associate Professor";

    public AssociateProfessor(String name,String Data){
       super(name);
        this.Data=Data;
    }

    @Override
    public void printDesignation() {
        System.out.println("My designation is "+Designation);
    }

    @Override
    public void printResearch() {
        System.out.println("My research area is "+Data);
    }
}
