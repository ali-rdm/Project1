import java.util.*;
public class HomeEx113 {
    public static void main(String[] args) {
      Scanner input=new Scanner (System.in);
      System.out.println("enter a number between 1,7:");
      int n=input.nextInt();
      switch(n){
          case 1:
              System.out.println("sat");
              break;
          case 2:
              System.out.println("sun");
              break;
          case 3:
              System.out.println("mon");
              break;
          case 4:
              System.out.println("tue");
              break;    
          case 5:
              System.out.println("wed");
              break;    
          case 6:
              System.out.println("thu");
              break;
          case 7:
              System.out.println("fri");
              break;
          default:
              System.out.println("is not in range 1 ,7!");
              break;
      }
    }
    
}
