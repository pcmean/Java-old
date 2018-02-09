
public class MyPhone{
    //1. create instance variables

    private int memCap;
    private double cost;
    private String color;
    private boolean isWiFiOn;

    public MyPhone(){
        memCap=0;
        cost=0;
        color=new String(" ");
        isWiFiOn=false;
    }

    public int getMemCap(){
        return memCap;

    }

    public void setMemCap(int memory){
        this.memCap=memory;

    }

    public MyPhone(int memory, double cost, String color, boolean isWiFiOn){
        this.memCap=memCap;
        this.cost=cost;
        this.color=color;
        this.isWiFiOn=isWiFiOn;
    }

    //3. to string

    public String toString(){
        String output = new String();
        output = "Memory Capacity is: "+ memCap + "\n" + "Cost is: " + cost + "\n"  + "Color is: " + color + "\n" + "WiFi is on? " + isWiFiOn;
        return output;

    }
}
