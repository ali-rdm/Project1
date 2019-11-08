import java.util.Scanner;
public class HomeEx2 {
    public static void main(String[] args) {
       Scanner input= new Scanner (System.in);
       System.out.println("enter your salary , please:");
       int s=input.nextInt();
       System.out.println("enter your instalment please:");
       int in=input.nextInt();
       if(in<=s){
            s=s-in;
            System.out.println("your salary without your instalment is:"+s+" $");
       }else if(s<0|| s< in){
           System.out.println("error");
       }
      
    }
    
}
