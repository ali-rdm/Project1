
public final class Info {
    double a;
    double b;
    public void seta(double value){
        a=Math.abs(value);
    }
    public void setb(double value){
        b=Math.abs(value);
    }
    public Info (double a1,double b1){
        seta(a1);
        setb(b1);
    }
    public double masahat(){
        double s=0;
        if(a==b){
            s=a*a;
        }else{
            s=a*b;
        }
       
        return s;
    }
    public double mohit(){
        double p=0;
        if(a==b){
            p=a*4;
        }else{
            p=(a+b)*2 ;
        }
       
        return p;
    }
     public void printinfo(){
        System.out.format("a is: %.2f\n",a);
        System.out.format("b is: %.2f\n", b);
        System.out.format("mohit is: %.2f\n", mohit());
        System.out.format("masahat is:%.2f \n",masahat());
    }
}
