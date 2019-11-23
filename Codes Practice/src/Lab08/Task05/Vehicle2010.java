package Task05;

public class Vehicle2010 extends Vehicle {
    public void moveUpperRight(){
        x++;y++;
    }
    public void moveUpperLeft(){
        y++;x--;
    }
    public void moveLowerLeft(){
        y--;x--;
    }
    public void moveLowerRight(){
        y--;x++;
    }
    public boolean equals(Vehicle2010 car){
        boolean a=false;
        if(car.x==super.x && car.y==super.y){
            a=true;
        }
        return a;
    }
}
