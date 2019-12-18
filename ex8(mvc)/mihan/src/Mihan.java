
import java.util.Scanner;


public class Mihan {

   
    public static void main(String[] args) {
        int n;
        Icecream mo1=retIcesFromDB();
        Icecream mo2=retIcesFromDb();
        Icecream mo3=retIcesFrmDB();
        Icecream mo4=retIcesFormDB();
        IceVeiw veiw=new IceVeiw();
        IceControler cont1=new IceControler(mo1,veiw);
        IceControler cont2=new IceControler(mo2,veiw);
        IceControler cont3=new IceControler(mo3,veiw);
        IceControler cont4=new IceControler(mo4,veiw);
        System.out.println("bastani haye mojod dar anbar:");
        cont1.updateView();
        cont2.updateView();
        cont3.updateView();
        cont4.updateView();
        
        Scanner input=new Scanner (System.in);
        
        System.out.println("1)kharid 0)enseraf:");
        String str1=input.nextLine();
        n=Integer.parseInt(str1);
        if(n==1){
            System.out.println("icecream's name:");
        String str2=input.nextLine();
        if(str2.equals("kim")){
            System.out.println("icecream's tam:1)vanili,2)shokolati");
            String str3=input.nextLine();
            if(str3.equals("vanili")){
                System.out.println("number of icecreams: ");
             int m=input.nextInt();
             int q=cont1.getIceNu();
             int sum;
             if(m<q){
                 sum=q-m; 
                 cont1.setIceNu(sum);
                 cont1.updateView();
             }else{
                 System.out.println("dar anbar be tedad vared shode jens vojood nadarad.");
             }
            }else if(str3.equals("shokolati")){
                System.out.println("number of icecreams: ");
                int m=input.nextInt();
                int q=cont2.getIceNu();
                int sum;
                if(m<q){
                     sum=q-m;
                     cont2.setIceNu(sum);
                     cont2.updateView();
                }else{
                 System.out.println("dar anbar be tedad vared shode jens vojood nadarad.");
             } 
                
            }
        }else if(str2.equals("salar")){
            System.out.println("icecream's tam:1)shatooti,2)tootfrangi");
            String str3=input.nextLine();
            if(str3.equals("shatooti")){
                System.out.println("number of icecreams: ");
                int m=input.nextInt();
             int q=cont3.getIceNu();
             int sum;
             if(m<q){
                 sum=q-m; 
                 cont3.setIceNu(sum);
                 cont3.updateView();
             }else{
                 System.out.println("dar anbar be tedad vared shode jens vojood nadarad.");
             }
            }else if(str3.equals("tootfrangi")){
                System.out.println("number of icecreams: ");
                int m=input.nextInt();
                int q=cont4.getIceNu();
                int sum;
                if(m<q){
                     sum=q-m;
                     cont4.setIceNu(sum);
                     cont4.updateView();
                }else{
                 System.out.println("dar anbar be tedad vared shode jens vojood nadarad.");
             }  
            }
        }
        }else if(n==0){
            System.out.println("khoroj movafaghiat amiz!");
        }
        
    
    }
    private static Icecream retIcesFromDB(){
    Icecream ob1=new Icecream();
    ob1.setModel("kim");
    ob1.setTam("vanili");
    ob1.setNum(15);
    return ob1;
    }
    private static Icecream retIcesFromDb(){
    Icecream ob1=new Icecream();
    ob1.setModel("kim");
    ob1.setTam("shokolati");
    ob1.setNum(20);
    return ob1;
    }
    private static Icecream retIcesFrmDB(){
    Icecream ob1=new Icecream();
    ob1.setModel("salar");
    ob1.setTam("shatooti");
    ob1.setNum(7);
    return ob1;
    }
    private static Icecream retIcesFormDB(){
    Icecream ob1=new Icecream();
    ob1.setModel("salar");
    ob1.setTam("tootfrangi");
    ob1.setNum(17);
    return ob1;
    }
    
   
    
    
    
    
}
