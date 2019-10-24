public class Car {
    private String make = "";
    private String model = "";
    int i=3;
    public Car(){
    i=1;
    }
    public Car(String m){
    this.make=m;
    i=2;

    }

    public Car(String m,String mo){
    this.make=m;
    this.model=mo;
    }

    public void start(){
        if(i==1){
            System.out.println("Car is starting");
        }
        else if(i==2){
            System.out.println("Car make: "+this.make+" is starting");
        }
        else if(i==3){
            System.out.println("Car make: "+this.make+", model: " +this.model+" is starting");
        }
    }
}