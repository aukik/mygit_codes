package MockFinal;

public class Lamborghini extends Car {
    private int topSpeed;
    public Lamborghini(String color, String manufacturer, String name){
        super(color, manufacturer, name);
        carCount++;
    }
    public void setTopSpeed(int topSpeed){
        this.topSpeed=topSpeed;
    }
    public int totalCars(){
        return carCount;
    }
    public void move(){
        System.out.println(carName+" is moving");
        System.out.println("Top Speed of "+topSpeed);
    }
}
