package SI_Ques;

public class Vector3D extends Vector2D {
    private int z = 0;
    public Vector3D(){}
    public Vector3D(int x){
        super(x);
    }
    public Vector3D(int x, int y){
     super(x,y);
    }
    public Vector3D(int x,int y,int z){
        super(x,y);
        this.z=z;
    }
    public int getZ(){
        return z;
    }

}
