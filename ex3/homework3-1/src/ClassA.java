public class ClassA extends Benz{
    public ClassA(){
        this.color="black";
        this.name="cls 200";
        this.year=1990;
    }
    
    @Override
    public void printMe() {
        System.out.println("model of car: "+this.name+",color: "+this.color+",year: "+this.year);
    }
}
