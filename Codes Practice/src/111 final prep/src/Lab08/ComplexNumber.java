package Lab08;

public class ComplexNumber extends RealNumber {
    private double complexValue;
    public ComplexNumber(){
        setComplexValue(1);
        setRealValue(1);
    }
    public double getComplexValue() {
        return complexValue;
    }

    public void setComplexValue(double complexValue) {
        this.complexValue = complexValue;
    }

    public ComplexNumber(double r){
       setComplexValue(r);
    }
    public String toString(){
        return "RealPart: "+getRealValue()+"\nImaginaryPart: "+getComplexValue();
    }
    public void ping(){
        System.out.println("I'm in ComplexNumber class");
    }
    public ComplexNumber(double r,double c){
        setRealValue(r);
        setComplexValue(c);
    }

    public void check(){
        this.ping();
        super.ping();
        System.out.println("Checking ended");
    }

}
