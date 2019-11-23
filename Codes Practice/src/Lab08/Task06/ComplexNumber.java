    package Task06;

    public class ComplexNumber extends RealNumber {
    private double ComplexValue;

    public double getImaginaryValue() {
        return ComplexValue;
    }
    public void setImaginaryValue(double r) {
        ComplexValue = r;
    }
    public ComplexNumber(){
        setImaginaryValue(1);
        setRealValue(1);
   }
    public ComplexNumber(double r,double i) {
        setRealValue(r);setImaginaryValue(i);
    }
    public String toString() {
        return super.toString()+"\nImaginaryPart: "+getImaginaryValue();
    }
    public void ping() {
        System.out.println("I'm in ComplexNumber class");
    }
    public void check(){
        ping();
        super.ping();
        System.out.println("Checking ended.");
    }
}
