public class Spring2016 {

    public static void main(String [] args){
        System.out.println("Output 1: Total Number of Students = " + Student1.number);
        Student1 s1 = new Student1();
        System.out.println("Output 2: "+s1.getName());
        s1.setName("Donald");
        System.out.println("Output 3: "+s1.getName());
        Student1 s2 = new Student1("Jeb");
        System.out.println("Output 4: "+s2.getName());
        Student1 s3 = new Student1("Ted");
        System.out.println("Output 5: "+s3.getName());
        Student1 s4 = new Student1();
        System.out.println("Output 6: "+s4.getName());
        s4.setName("Ben");
        System.out.println("Output 7: "+s4.getName());
        System.out.println("Output 8: Total Number of Students = " + Student1.number);
    }

}
