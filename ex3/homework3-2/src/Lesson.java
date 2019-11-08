public  class  Lesson  implements PishNiaz,HamNiaz{
    protected String name;
    public Lesson(String name){
        this.name=name;
    }
    public boolean check(){
        if(this.name.equals("mabani"))
            return true;
        else
            return false;
            
    }
   public void printInfo(){
       if(this.check()==true){
           System.out.println("pishniaz: "+NPN+" ,tedade vahede pishniaz: "+TV1+" ,hamniaz: "+NHN+" ,tedade vahede hamniaz: "+TV2);
       }else{
           System.out.println("not correct.");
       }
   }
}
