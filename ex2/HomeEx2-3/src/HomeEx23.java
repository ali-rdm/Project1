import java.util.*;
public class HomeEx23 {
    public static void main(String[] args) {
       Scanner input= new Scanner(System.in);
       System.out.println("طول را وارد کنید:");
       double t=input.nextFloat();
       System.out.println("عرض را وارد کنید:");
        double a=input.nextFloat();
        Info shape=new Info(t,a);
        shape.printinfo();
    }
    
}
