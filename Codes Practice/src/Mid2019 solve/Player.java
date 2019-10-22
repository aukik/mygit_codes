public class Player{
    private String name = "Default";
    private int number = 0;
    private String team = "Default";

    public Player(){
    }
    public void setName(String a){
        this.name=a;
    }
    public void setNumber(int a){
        this.number=a;
    }
    public void setTeam(String a){
        this.team=a;
    }
    public Player(String a){
        this.name=a;
    }
    public Player(String a,int n){
this.name=a;
this.number=n;
    }
    public Player(String a,int n,String t){
        this.name=a;
        this.number=n;
        this.team=t;
    }
    public void detail(){
        System.out.println(this.name+"*is*no."+this.number+"*for*"+this.team);
    }
}
