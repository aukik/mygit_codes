package Assignment02;

public class Worker02 {
    public static int[] copy(int x[]){
        int temp[]=new int[x.length];
        for (int i = 0; i <x.length ; i++) {
            temp[i]=x[i];
        }
        return temp;
    }
    public static int[] join(int x[],int y[] ){
        int sum[]=new int[x.length+y.length];
        for (int i = 0; i <x.length ; i++) {
            sum[i]=x[i];
        }int c=0;
        for (int i = x.length; i <x.length + y.length ; i++) {
          sum[i]=y[c];
          c++;
        }
        return sum;
    }
   public static int[] copyRef(int x[] ){
        return x;
   }
   public static int add(int x,int y){
        int sum=x+y;
        return sum;
   }
}
