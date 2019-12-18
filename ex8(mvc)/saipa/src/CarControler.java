
public class CarControler {
    private Cars model;
    private CarVeiw veiw;
    
    public CarControler(Cars mod,CarVeiw ve){
        this.model=mod;
        this.veiw=ve; 
    }
    public void setCarName(String n){
        model.setcn(n);
    }
     public String getCarName(){
         return model.getcn();
     }
      public void setCarModel(String m){
        model.setmo(m);
    }
     public String getCarModel(){
         return model.getmo();
     }
     public int getNum(){
         return model.getnum();
     }
     public void setNum(int n){
         model.setnu(n);
     }
     public void updateView(){				
      veiw.printCarDetails(model.getcn(), model.getmo(),model.getnum());
   }	
    
    
}
