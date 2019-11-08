public class Student<SNUM,SID,SPASS> {
    private SNUM snum;
    private SID sid;
    private SPASS spass;

    
    public SNUM getSnum() {
        return snum;
    }

    
    public void setSnum(SNUM snum) {
        this.snum = snum;
    }

    
    public SID getSid() {
        return sid;
    }

    
    public void setSid(SID sid) {
        this.sid = sid;
    }

    
    public SPASS getSpass() {
        return spass;
    }

    
    public void setSpass(SPASS spass) {
        this.spass = spass;
    }
     public void add(SNUM t,SID b,SPASS c) {
      this.snum = t;
      this.sid=b;
      this.spass=c;
   }

    
}
