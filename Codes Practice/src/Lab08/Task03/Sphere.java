package Task03;

public class Sphere extends Point {
    public Sphere ( double r) {
        super(r);
    }
    public double space(){
        System.out.println("The Sphere is ready!\nThe volume is: ");
        return (4/3)*3.1416*Math.pow(getRadius(),3);
    }
}
