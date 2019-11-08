public class Student<NAME,YEAR,NICKNAME,GERAYESH,RESHTE> {
    private NAME name;
    private YEAR year;
    private NICKNAME nickname;
    private GERAYESH gerayesh;
    private RESHTE reshte;
    public Student(){
        this.name=null;
        this.nickname=null;
        this.year=null;
        this.gerayesh=null;
        this.reshte=null;
    }
    public Student(NAME name,YEAR year,NICKNAME nickname,GERAYESH gerayesh,RESHTE reshte){
        setName(name);
        setYear(year);
        setNickname(nickname);
        setGerayesh(gerayesh);
        setReshte(reshte);
    }

    /**
     * @return the name
     */
    public NAME getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(NAME name) {
        this.name = name;
    }

    /**
     * @return the year
     */
    public YEAR getYear() {
        return year;
    }

    /**
     * @param year the year to set
     */
    public void setYear(YEAR year) {
        this.year = year;
    }

    
    public NICKNAME getNickname() {
        return nickname;
    }

    
    public void setNickname(NICKNAME nickname) {
        this.nickname = nickname;
    }

   
    public GERAYESH getGerayesh() {
        return gerayesh;
    }

    
    public void setGerayesh(GERAYESH gerayesh) {
        this.gerayesh = gerayesh;
    }

    
    public RESHTE getReshte() {
        return reshte;
    }

   
    public void setReshte(RESHTE reshte) {
        this.reshte = reshte;
    }
    
    public String toString(){
        return("name: "+this.name+",age: "+this.year+",reshte: "+this.reshte+",gerayesh: "+this.gerayesh+" ,student number:"+this.nickname);
    }
}
