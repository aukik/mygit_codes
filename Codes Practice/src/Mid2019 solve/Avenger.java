public class Avenger {
    private String name = "";
    private String power = "";
    public Avenger(){
        System.out.println("Superhero name and power need to be set");
    }
    public Avenger(String n){
        this.name=n;
        System.out.println("Power for "+this.name+" needs to be set");
    }
    public Avenger(String n,String p){
        this.name=n;
        this.power=p;
        System.out.println(this.name+ " is ready to attack");
    }
    public void setPower(String p){
        this.power=p;
    }
    public  void setName(String n){
        this.name=n;
    }
    public void attack(){
        System.out.println(this.name+"*is*"+this.power+"ing.");
    }
}
