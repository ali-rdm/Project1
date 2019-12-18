
public class FControler {
    private Farsh model;
    private FarshVeiw veiw;
    
    public FControler(Farsh mo,FarshVeiw ve){
         this.model=mo;
        this.veiw=ve;  
    }
    public void setModel(String m){
        model.setModel(m);
    }
    public void setPrice(int p){
        model.setPrice(p);
    }
    public void setNum(int n){
        model.setNum(n);
    }
    public String getModel(){
        return model.getModel();
    }
    public int getPrice(){
        return model.getPrice();
    }
    public int getNum(){
        return model.getNum();
    }
    public void updateView(){				
      veiw.prFarshDe(model.getModel(),model.getPrice(),model.getNum());
   }	
    
}
