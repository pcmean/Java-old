public class Clock{

    private int hours;
    private int minutes;
    private double seconds;

    public Clock(){

        hours=0;
        minutes=0;
        seconds=0.0;

    }

    public Clock(int hours, int minutes, double seconds){

        this.hours=hours;
        this.minutes=minutes;
        this.seconds=seconds;

    }

    public void setTime(int hours, int minutes, double seconds){

        this.hours=hours;
        this.minutes=minutes;
        this.seconds=seconds;

    }

    public void setDaylightSaving(int hours){

        this.hours=hours+1;

    }

    public int totalSeconds(){

        int total=(this.hours*3600)+(this.minutes*60)+((int)this.seconds);
        return total;

    }

    public String toString(){

        String time = new String();
        time = ("The time is "+hours+":"+minutes+":"+seconds+"\n"+
            "The total number of seconds is: "+totalSeconds()+"\n\n");

        return time;
    }

}
