public class ClassC extends Benz {
    public ClassC(){
        this.color="pink";
        this.name="c12001";
        this.year=1998;
    }
    
    @Override
    public void printMe() {
        System.out.println("model of car: "+this.name+",color: "+this.color+",year: "+this.year);
    }
}
