package MockFinal;

public abstract class Car implements Moveable{
    public String color;
    public String manufacturer;
    String carName;
    public static int carCount=0;
    Car(String color, String manufacturer, String name){
        this.color = color;
        this.manufacturer = manufacturer;
        this.carName = name;
    }
    public abstract void setTopSpeed(int topSpeed);
    public abstract int totalCars();
}