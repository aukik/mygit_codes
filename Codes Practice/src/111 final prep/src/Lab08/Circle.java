package Lab08;

public class Circle extends Point {
   public Circle(double r){
        super(r);
    }

    public double space(){
        System.out.println(3.1416*getRadius()*getRadius());
        return 0;
    }

}
