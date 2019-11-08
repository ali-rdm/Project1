import java.util.*;
public class HomeEx122 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in); 
        System.out.println("enter a number:");
        int n=input.nextInt();
        int s=0,sum=0;
       while(n>0){
           s=n%10;
           n=n/10;
           sum+=s;
           
       }
       System.out.println("sum is:"+sum);
    }
    
}
