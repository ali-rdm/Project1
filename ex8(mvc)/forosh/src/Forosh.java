
import java.util.Scanner;


public class Forosh {

    public static void main(String[] args) {
        Farsh mo1=retIcesFromDB();
        Farsh mo2=retIcesFromDb();
        FarshVeiw fv =new FarshVeiw ();
        FControler cont1= new FControler(mo1,fv);
        FControler cont2=new FControler(mo2,fv);
        cont1.updateView();
        cont2.updateView();
        Scanner input=new Scanner (System.in);
        System.out.println("1)kharid 0)enseraf:");
        String str1=input.nextLine();
        int n=Integer.parseInt(str1);
        if(n==1){
            System.out.println("model:1)qashqayi 2)bakhtiari");
             String str2=input.nextLine();
             if(str2.equals("qashqayi")){
                System.out.println("number of carpet: ");
                int m=input.nextInt();
             int q=cont1.getNum();
             int sum;
             if(m<q){
                 sum=q-m; 
                 cont1.setNum(sum);
                 cont1.updateView();
             }else{
                 System.out.println("dar anbar be tedad vared shode jens vojood nadarad.");
             }
                 
             }else if(str2.equals("bakhtiari")){
                System.out.println("number of carpet: ");
                int m=input.nextInt();
                int q=cont2.getNum();
                int sum;
                if(m<q){
                    sum=q-m; 
                    cont2.setNum(sum);
                    cont2.updateView();
                }else{
                     System.out.println("dar anbar be tedad vared shode jens vojood nadarad.");
                } 
  
             }else{
                 System.out.println("not found in store");
             }
            
        }else if(n==0){
            System.out.println("khoroj movafaghiat amiz");
            System.exit(0);
        }
       
    }
    private static Farsh retIcesFromDB(){
        Farsh ob1=new Farsh();
        ob1.setModel("qashqayi");
        ob1.setPrice(12000);
        ob1.setNum(19);
        return ob1;
    }
    private static Farsh retIcesFromDb(){
        Farsh ob1=new Farsh();
        ob1.setModel("bakhtiari");
        ob1.setPrice(17000);
        ob1.setNum(23);
        return ob1;
    }
    
}
