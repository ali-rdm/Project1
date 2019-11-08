public class ClassB extends Benz {
    public ClassB(){
        this.color="yellow";
        this.name="sls 150";
        this.year=2005;
    }
    
    @Override
    public void printMe() {
        System.out.println("model of car: "+this.name+",color: "+this.color+",year: "+this.year);
    }
}
