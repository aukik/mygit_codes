package SI_Ques;

public class Car implements Product {
    public String name;
    public double price;
    public int quantity;
    public Car(double price,String name,int quantity){
        this.name=name;
        this.price=price;
        this.quantity=quantity;

    }
    @Override
    public double getPrice() {
        return this.price;
    }

    @Override
    public int getQuantity() {
        return this.quantity;
    }

    @Override
    public String getName() {
        return this.name;
    }
}
