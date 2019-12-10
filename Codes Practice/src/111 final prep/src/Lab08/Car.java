package Lab08;

public class Car  {
    private static int c=0;
    private int year;
    public static int getObjectCount(){
        return c;
    }
    public Car(int y){
        year=y;
        c++;
    }
    public int getYear(){
        return year;
    }

}
