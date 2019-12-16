package SI_Ques;

public class Vector2D {

    private int x = 0, y = 0;
    public Vector2D(){

    }
    public Vector2D(int x){
        this.x = x;
    }
    public Vector2D(int x, int y){
        this.x = x;
        this.y = y;
    }
    public final int getX(){
        return x;
    }
    public final int getY(){
        return y;
    }
}