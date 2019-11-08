import java.util.*;
public class HomeEX22 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        
       int n=0;
       double sum=0;
       double f=0;
       System.out.println("tedade nomarat ra vared konid:");
        n=input.nextInt();
        if(n<0){
            System.out.println("error!");
        }
        if(n>0){
            double point[]=new double[n];
        for (int i = 0; i < n ; i++) {
            System.out.println("nomre khod ra vared konid:");
            point[i]= input.nextFloat();
            sum+=point[i];
        }
        
        f=sum/n;
        if(f>=10){
             System.out.println("miangin nomre shoma:"+f);
             System.out.println("ghaboul shodi!!!");
        }else{
             System.out.println("miangin nomre shoma:"+f);
            System.out.println("mardod shodi!!!");
        }
       
        }
       
    }
    
}
