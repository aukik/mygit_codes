package SI_Ques;



public class AssistantProfessor extends People {
    public String Data;
    public String Designation="Assistant Professor";
    public AssistantProfessor(String name,String Data){
        super(name);
        this.Data=Data;
    }

    @Override
    public void printDesignation() {
        System.out.println("My designation is "+this.Designation);
    }

    @Override
    public void printResearch() {
        System.out.println("My research area is "+Data);
    }
}
