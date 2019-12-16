package SI_Ques;

public class Q2 {
    public static void analyze(int a){
        System.out.println("Data Type: int, Value: "+a);
    }
    public static void analyze(boolean a){
        System.out.println("Data Type: boolean, Value: "+a);
    }
    public static void analyze(String a){
        System.out.println("Data Type: String, Value: "+a);
    }

    public static void main(String[] args) {
        analyze(2019);
        analyze(true);
        analyze("Tyupkin");
    }
}
