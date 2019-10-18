package Lab05;

public class Cat{
    public String color = "White";
    public String action = "sitting";
    public Cat(){}

    public Cat(String c){
        this.color=c;
    }
    public Cat(String c,String a){
        this.color=c;
        this.action=a;
    }

    public void printCat() {
        if (action == "sitting") {
            System.out.println(color + " cat is " + action);
        }else if(color=="Purple"){
            System.out.println("Purple cat is Brown");
        }

        else{
            System.out.println(action+" cat is "+color);
        }

    }
    public void changeColor(String c){
        this.color=c;
    }
}

