import java.util.*;
public class Homework43 {

   
    public static void main(String[] args) {
      Scanner input=new Scanner(System.in);
       String[] myStringArray = {"sogand", "sara", "alireza", "tara"};
       int[] grade = {15, 14, 10,6};
       int[] year = {95, 94, 90,92};
       int g,y,i=0;
       boolean found = false;
       String result="mardod";
       try{
           System.out.println("name:");
            String stringToLocate= input.next();
    for (String element:myStringArray )
    {
        if ( element.equals( stringToLocate)){
            found = true; 
            g=grade[i];
            y=year[i];
            System.out.println( "The peron is found!");
            System.out.println( "year:"+y);
            System.out.println( "grade:"+g);
            if(g>10){
                result="ghabool";
            }
            System.out.println("shoma "+result+" shodid");
        }
       i++;
    }
         if (!found) { 
              throw new NotFound();
            } 
    }catch(NotFound ex){
         System.out.println("something went wrong.");
           System.out.println("Exception: "+ex);
    }
    }
    
}
