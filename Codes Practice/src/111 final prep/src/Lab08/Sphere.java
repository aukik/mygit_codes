package Lab08;

public class Sphere extends Point {
    public Sphere(double r){
        super(r);
    }

    public double space(){
        System.out.println(4*3.1416*getRadius()*getRadius());
        return 0;
    }

}
