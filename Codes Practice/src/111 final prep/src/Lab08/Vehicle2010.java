package Lab08;

public class Vehicle2010 extends Vehicle{
    public void moveUpperRight(){
        x++;
        y++;
    }
    public void moveLowerRight(){
        y--;
        x++;
    }
    public void moveUpperLeft(){
        x--;
        y++;
    }
    public void moveLowerLeft(){
        x--;
        y--;
    }
    public boolean equals(Vehicle2010 v){
        boolean b=false;
        if(super.x==v.x && super.y==v.y){
            b=true;
        }
        return b;
    }
}
