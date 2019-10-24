
package Assignment03;

public class Account {
    public static double interestRate=5.0;
    public  String name="default name";
    public double balance=0.0;
    public Account(){
    }
   public Account(String n,double b){
    name=n;
    balance=b;
   }

    public void nameBoshao(String n){
        name=n;
    }
    public void balanceBoshao(double b){
        balance=b;
    }

    public  String nameKi(){
        return name;
    }
    public double balanceKi(){
        return balance;
    }
    public void withdraw(double x){
        balance=balance-x;
        if(balance<=0){
            System.out.println("Cannot withdraw");
            balance=balance+x;
        }
        else{
            System.out.println("Withdraw successful! New balance is: "+balance);
        }

    }


}
