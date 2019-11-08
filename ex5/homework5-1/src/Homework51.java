import java.util.*;
public class Homework51 {

    public static void main(String[] args) {
        String name,reshte,gerayesh;
        int age,stdn;
        Scanner input=new Scanner(System.in);
        Student st=new Student();
        System.out.println("name:");
        name=input.next();
        st.setName(name);
        System.out.println("sen:");
        age=input.nextInt();
        st.setYear(age);
        System.out.println("reshte");
        reshte=input.next();
        st.setReshte(reshte);
        System.out.println("shomare daneshjoe:");
        stdn=input.nextInt();
        st.setNickname(stdn);
        System.out.println("gerayesh:");
        gerayesh=input.next();
        st.setGerayesh(gerayesh);
        System.out.println("result: "+st);
    }
    
}
