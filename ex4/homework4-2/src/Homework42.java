import java.util.*;
public class Homework42 {
    static Scanner input=new Scanner(System.in);
    public static void main(String[] args){
        String name;
        int password,nickname;
        Student st1=new Student();
        try{
            System.out.println("enter your name: ");
            name=input.next();
            st1.setName(name);
            System.out.println("enter your nickname: ");
            nickname=input.nextInt();
            
            st1.setNickname(nickname);
            System.out.println("enter your password: ");
            password=input.nextInt();
            st1.setPassword(password);
        }catch(InputMismatchException  ex){
           
            System.out.println("it's not okay.");
        
        
        }
        
    }
   //اگر نیک نیم و پسوورد را عدد وارد نکند خطا می دهد./
   
}
