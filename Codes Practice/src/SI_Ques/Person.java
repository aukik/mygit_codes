package SI_Ques;

public abstract class Person {
    private String name;
    private Person() {
    }
    Person(String name) {
        this.name = name;
    }
    protected String getName() {
        return name;
    }
    protected void setName(String name) {
        this.name = name;
    }

}
