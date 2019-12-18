
public class IceControler {
    private Icecream model;
    private IceVeiw veiw;
    
     public IceControler(Icecream mod,IceVeiw ve){
        this.model=mod;
        this.veiw=ve; 
    }
    public void setIceName(String n){
        model.setModel(n);
    }
    public String getIceName(){
       return model.getModel();
    }
    public String getIceT(){
       return model.getTam();
    }
    public int getIceNu(){
       return model.getNum();
    }
    public void setIceT(String n){
        model.setTam(n);
    }
    public void setIceNu(int nu){
        model.setNum(nu);
    }
    public void updateView(){				
      veiw.prIccrDe(model.getModel(), model.getTam(),model.getNum());
   }	
     
}
