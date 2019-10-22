public class Student {
    public int ai;
    public int id;
    public String name;

    public Student(int a,int i,String na){
        this.ai=a;
        this.id=i;
        this.name=na;
    }
    public boolean check(Student s){
        boolean b=false;
        if(s.ai==this.ai){
            b=true;
        }
        return b;
    }
    public void identify(){
        System.out.println("ApplicantID: "+ai+", StudentID:" +id+", Name: "+name);
    }
    public void match(Student a){
        if(a.name==this.name){
            System.out.println(this.id+" is the same person as "+a.id);
        }
        else{
            System.out.println(this.id+" is a different person from "+a.id);
        }
    }
    public void setName(String a){
        this.name=a;
    }
}

