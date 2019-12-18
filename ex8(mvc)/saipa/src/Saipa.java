import java.util.*;
public class Saipa {
    
    public static void main(String[] args) {
        int n;
        Cars mo1=retcarsFromDB();
        Cars mo2=retcarsFromDb();
        CarVeiw veiw= new CarVeiw();
        CarControler cont=new CarControler(mo1,veiw);
        CarControler cont2=new CarControler(mo2,veiw);
        cont.updateView();
        cont2.updateView();
        Scanner input=new Scanner (System.in);
        System.out.println("1)kharid,2)enseraf");
        String str=input.nextLine();
        n=Integer.parseInt(str);
        System.out.println("enter the number of model: 1)111,2)132");
        String str2=input.nextLine();
        if(n==1 && str2.equals("111")){
            int q=cont.getNum();
            q--;
            cont.setNum(q);
            cont.updateView();
             System.out.println("ba movafaghiat kharid kardid.");
        }else if(n==1 && str2.equals("132") ){
            int q=cont2.getNum();
             q--;
             cont2.setNum(q);
             cont2.updateView();
             System.out.println("ba movafaghiat kharid kardid.");
            
        }
        else if(n==2){
            System.out.println("az samane forosh saipa ba movafaghiat kharej shodid");
        }
        
        
      
    }
    
    private static Cars retcarsFromDB(){
    Cars car1=new Cars();
    car1.setcn("praide");
    car1.setmo("111");
    car1.setnu(10);
    
    
    
    return car1;
    }
    private static Cars retcarsFromDb(){
        Cars car2=new Cars();
        car2.setcn("praide");
        car2.setmo("132");
        car2.setnu(8);
        
        return car2;
    }
    
}

