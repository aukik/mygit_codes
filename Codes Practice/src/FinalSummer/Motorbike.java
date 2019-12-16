package FinalSummer;

public class Motorbike implements Bike {
    public int Speed=0;
    public void speedUp(int increment){
        Speed+=increment;
    }
    public void applyBrakes(int decrement){
        Speed-=decrement;
    }
    public void printStatus(){
        System.out.println("Speed: "+this.Speed);
    }
}
