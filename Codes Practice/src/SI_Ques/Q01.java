package SI_Ques;

public class Q01 {
    public static void main(String[] args) {
        Student1 s1 = new Student1("CSE", 20101001, "Mark Wahlberg");
        Student1 s2 = new Student1("BBA", 20101002, "Zeeko Zaki");
        s1.printDetail();
        s2.printDetail();
        s2.setDepartment("CSE");
        s2.printDetail();
    }

}
