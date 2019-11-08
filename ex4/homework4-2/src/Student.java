public class Student {
    private String name;
    private int password,nickname;
    private boolean t1,t2,t3;
    public Student(){
        this.name=null;
        this.nickname=0;
        this.password=0;
    }
    public  Student(String n,int nn,int p){
        this.name=n;
        this.nickname=nn;
        this.password=p;
    } 
    
    

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the nickname
     */
    public int getNickname() {
        return nickname;
    }

    /**
     * @param nickname the nickname to set
     */
    public void setNickname(int nickname) {
        this.nickname = nickname;
    }

    /**
     * @return the password
     */
    public int getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(int password) {
        this.password = password;
    }
   
}
