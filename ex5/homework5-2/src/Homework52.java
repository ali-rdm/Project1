import java.util.*;
public class Homework52 {

    static Scanner input=new Scanner(System.in);
    public static void main(String[] args) {
        int num1,num2,num3;
      Student<Integer,Integer,Integer> student = new Student<Integer,Integer,Integer>();
      System.out.println("student number:");
      num1=input.nextInt();
      System.out.println("student id:");
      num2=input.nextInt();
      System.out.println("student password:");
      num3=input.nextInt();
      student.add(new Integer(num1),new Integer(num2),new Integer(num3));
      System.out.printf("student number :%d\n\n", student.getSnum());
      System.out.printf("student id: :%d\n\n", student.getSid());
      System.out.printf("student password: :%d\n\n", student.getSpass());
      
   }
    
}
