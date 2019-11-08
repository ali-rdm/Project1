import java.util.*;
public class Homework33 {
    static Scanner input=new Scanner(System.in);
    public static void main(String[] args) {
        String namest;
         System.out.println("enter your first name: ");
        namest=input.nextLine();
        Student st1=new Student(namest);
        st1.printInfo();
        
    }
    
}
