package Task10;

public class Car {
    public int year;
    public static int total_cars=0;
    public Car(int a){
        year=a;
        total_cars++;
    }
    public int getYear(){
        return year;
    }
    public static int getObjectCount(){
        return total_cars;
    }
}
