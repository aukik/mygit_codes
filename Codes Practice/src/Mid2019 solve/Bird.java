public class Bird {
    public String type;
    public String color;
  public Bird(){
      this.type="Bird";
  }
    public Bird(String t){
        this.type=t;
    }
    public Bird(String t,String c){
        this.type=t;
        this.color=c;
    }
    public void fly(){
      if(this.type==null && this.color==null){
          System.out.println("Bird*is*flying.");
      }
      else if(this.color==null){
          System.out.println(this.type+"*bird*is*flying.");
      }
      else{
          System.out.println(this.type+"*"+this.color+"*bird*is*flying.");
      }
    }
}
