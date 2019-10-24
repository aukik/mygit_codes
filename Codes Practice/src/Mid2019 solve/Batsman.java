public class Batsman {
    public String name="New Batsman";
    public int runsScored;
    public int ballsFaced;
    public Batsman(int a,int b){
    this.runsScored=a;
    this.ballsFaced=b;
    }
    public Batsman(String n,int a,int b){
        this.name=n;
        this.runsScored=a;
        this.ballsFaced=b;
    }
    public void printCareerStatistics(){
        System.out.println("Name: "+this.name);
        System.out.println("Runs Scored: "+runsScored+", Balls Faced:" +this.ballsFaced);
    }
    public double battingStrikeRate(){
        double runs=this.runsScored;
        double b=this.ballsFaced;
        double rate=(runs/b)*100;
        return rate;
    }
    public void setName(String s){
        this.name=s;
    }
}
