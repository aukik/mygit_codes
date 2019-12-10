package THD;

public class lastQuiz {
    public static void main(String[] args) {
        foodInterface pa=new Pasta("Pasta","Spaghetti");
        foodInterface pi=new Pasta("Pizza","Thin");
        System.out.println(pi.getName());
        System.out.println(pi.ingredients());
        System.out.println(pa.ingredients());
    }
}
