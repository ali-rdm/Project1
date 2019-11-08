public class ClassD extends Benz {
        public ClassD(){
        this.color="lightblue";
        this.name="km212";
        this.year=2011;
    }
    
    @Override
    public void printMe() {
        System.out.println("model of car: "+this.name+",color: "+this.color+",year: "+this.year);
    }
}
