import java.util.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
public class Homework53 {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String name,grade;
        Map map=new HashMap();
        System.out.println("name:");
        name=input.next();
        map.put("name",name);
        System.out.println("grade:");
        grade=input.next();
        map.put("grade",grade);
        System.out.println(map.get("name"));
        System.out.println(map.get("grade"));
        if(Integer.parseInt(grade)>10){
             System.out.println("ghabool shodi");
        
        }else{
            System.out.println("rad shodi");
        }
    }
    
}
