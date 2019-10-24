public class Student1{
    private String name = "Default";
    public static int number=0;
    public Student1(){
    }
    public Student1(String n){
        this.name=n;
        number++;
    }
    public String getName(){
        return this.name;
    }
    public void setName(String n){
        this.name=n;
        number++;
    }


}

