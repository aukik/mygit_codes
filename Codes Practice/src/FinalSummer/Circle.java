package FinalSummer;

public class Circle extends Shape{
    private int r;
    public Circle(int r){
        this.r=r;
    }
    public double getArea(){
        return 3.1416*r*r;
    }

}
