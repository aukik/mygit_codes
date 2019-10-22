
public class Dog {
    private String color = "Black";
    public Dog(){}
    public Dog(String a){
        this.color=a;
    }
    public void bark(){
        System.out.println(this.color+" dog is barking");
    }
    public void changeColor(String a){
        this.color=a;
    }
}
