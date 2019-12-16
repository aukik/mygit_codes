package SI_Ques;

public class Tester{
    public static void printVector(Vector3D v){
        System.out.println("x:"+v.getX()+" y:"+v.getY()+" z:"+v.getZ());
    }
    public static void main(String[] args){
        printVector(new Vector3D());
        printVector(new Vector3D(3, 5));
        printVector(new Vector3D(4, 7, 2));
    }
}