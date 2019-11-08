import java.util.*;
public class Homework41 {
    static Scanner input=new Scanner(System.in);
    
    public static void main(String[] args) {
        int age;
        String nationality,edu;
        
        try{
            System.out.println("how old are you?");
            age=input.nextInt();
            if(age<23){
                throw new AgeException();
            }
            System.out.println("what is your level of education?");
            edu=input.next();
            if(!edu.equals("associate")){
                throw new EduException();
            }
            System.out.println("what is your nationality?");
            nationality=input.next();
            if(!nationality.equals("persian")){
                throw new NatException();
            }
           
             
        }catch(AgeException ex){
            System.out.println("result: "+ex);
        }
        catch(NatException ex){
            System.out.println("result: "+ex);
        }
        catch(EduException ex){
            System.out.println("result: "+ex);
        }
       
    }
    
}
    
