package SI_Ques;

public class Q3 {
    public static void method(Product i) {
        double price = i.getPrice();
        String name = i.getName();
        int quantity = i.getQuantity();
        System.out.println("Total price of " + name + " is USD " +
                (quantity * price));
    }
    public static void main(String[] args) {
        Car c = new Car(1, "Bugatti", 19000);
        method(c);
        Shirt s = new Shirt(5, "Calvin Klein", 200);
        method(s);
    }

}
