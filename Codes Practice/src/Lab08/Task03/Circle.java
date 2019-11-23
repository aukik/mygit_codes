package Task03;

public class Circle extends Point {

     public Circle ( double r) {
         super(r);
    }
    public double space(){
        System.out.println("The Circle is ready!");
        System.out.print("The Radius is: ");
        return  3.1416*getRadius()*getRadius();
    }
}

