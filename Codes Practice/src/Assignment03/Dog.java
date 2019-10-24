package Assignment03;

public class Dog {
    private String color = "Black";
    public Dog(String s){
        this.color=s;
    }
    public void bark(){
        System.out.println(color+" dog is barking");
    }
    public void changeColor(String s){
        this.color=s;
    }
}

