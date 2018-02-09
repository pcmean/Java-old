public class Time{
    
    private int hour;
    private int minute;
    
    public Time(int h, int m){
        
        this.hour=h;
        this.minute=m;
        
    }
    public String toString(){
        
        return hour+":"+minute;
        
    }
}
