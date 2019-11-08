public class Student {
    protected String name;
    protected int year ,tv;
    protected double grade;
    public Student(String name){
        this.name=name;
    }
    public boolean check(){
        if(this.name.equals("sogand")){
            return true;
        }else{
            return false;
        }
    }
    public void printInfo(){
        if(check()==true){
            this.year=2;
            this.tv=37;
            this.grade=16.89;
            System.out.println(toString());
             
        }else{
            System.out.println("person not found.");
        }
    }
    public String toString(){
        return ("your name is: "+this.name+",and your grade is: "+this.grade+" ,years of education:"+this.year+" ,number of courses: "+this.tv);
    }
}
