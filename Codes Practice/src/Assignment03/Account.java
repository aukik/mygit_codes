<<<<<<< HEAD
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
=======
package Lab05;

public class Account {
    public Account(String n,double b){
        this.name=n;
        this.balance=b;
    }
    public Account(){}
public static double interestRate=5.0;
public String name="Default Account";
public double balance=0.0;
 public void nameBoshao(String n){
     this.name=n;
 }
 public void balanceBoshao(double b){
     this.balance=b;
 }
public String nameKi(){
     return name;
}
public double balanceKi(){
     return balance;
}
public void withdraw(double w){

   double b=this.balance-w;
   if(b<=0){
       System.out.println("The account balance after deducting withdraw amount is equal to or less than minimum. Cannot withdraw");
   }
   else{
       System.out.println("Withdraw successful! New balance is: "+b);
   }
}
}
>>>>>>> 4cc45273a9fa08ef998ee68df5880d34a68caa4c
