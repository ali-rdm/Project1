import java.util.*;
public class HomeEx1{
    public static void main(String[] args) {
       Scanner input= new Scanner (System.in);
       System.out.println("please enter a number:");
       int n=input.nextInt();
       if(n%2==0){
           System.out.format("%d is even.\n",n);
       }else{
           System.out.format("%d is odd.\n", n);
       }
       
    }
    
}
