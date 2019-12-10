package THD;

public class Pasta implements foodInterface{
    public String ingredients;
    public String name;
    public Pasta(String name,String ingredients){
        this.name=name;
        this.ingredients=ingredients;
    }
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
