package Task08;

public class CheckingAccount extends Account {
    public static int numberOfAccount=0;
    public CheckingAccount(){
        super(0);
        numberOfAccount++;
    }
    public CheckingAccount(double a){
        super(a);
        numberOfAccount++;
    }

}
