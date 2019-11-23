package Task05;
public class Vehicle{
    public int x;
    public int y;
    public void moveUp(){
        y++;
    }
    public void moveDown(){
        y--;
    }
    public void moveLeft(){
        x--;
    }
    public void moveRight(){
        x++;
    }
    public String toString(){
        return "( "+x+" , "+y+" )";
    }
}
