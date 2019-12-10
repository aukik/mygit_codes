package THD;

public class Pizza implements foodInterface {
    public Pizza(String name,String ingredients){
        this.name=name;
        this.ingredients=ingredients;
    }
    public String ingredients;
    public String name;
    public String ingredients(){
        return "Italian Cuisine, "+getName()+" crust type: " + ingredients;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
