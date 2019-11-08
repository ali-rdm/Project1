import java.util.*;
public class Homework31 {

    static Scanner input=new Scanner(System.in);
    public static void main(String[] args) {
        String name;
        System.out.println("please enter 'benz':");
        name=input.nextLine();
        if(name.toLowerCase().equals("benz")){
            ClassA car1=new ClassA();
            car1.printMe();
            ClassB car2=new ClassB();
            car2.printMe();
            ClassC car3=new ClassC();
            car3.printMe();
            ClassD car4=new ClassD();
            car4.printMe();
            ClassF car5=new ClassF();
            car5.printMe();
            
        }
        else{
            System.out.println("not found!");
            
        }
        
       
    }
    
}
