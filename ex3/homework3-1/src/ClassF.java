public class ClassF extends Benz {
        public ClassF(){
        this.color="white";
        this.name="bj001";
        this.year=2018;
    }
    
    @Override
    public void printMe() {
        System.out.println("model of car: "+this.name+",color: "+this.color+",year: "+this.year);
    }
}
