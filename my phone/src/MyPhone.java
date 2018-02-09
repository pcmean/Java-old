public class MyPhone{
    //1. create instance variables
    private int memoryCap;
    private double cost;
    private String carrier;
    private boolean isWiFiOn;
    
    //2. Write a constructor to initize instance variables.
    
    public MyPhone(){
        memoryCap= 90000000;
        cost=199.99;
        carrier= new String ("Verizon");
        isWiFiOn = false;
    }//end constructer MyPhone
    
    public MyPhone(int memoryCap,double cost, String carrier, boolean isWiFiOn){
        this.memoryCap=memoryCap;
        this.cost=cost;
        this.carrier= new String(carrier);
        this.isWiFiOn=isWiFiOn;
        
    }
    
    
    
    //3. toString()
    
    public String toString(){
        String output = new String();
        output = "Memory Capacity is: "+ memoryCap + "\n" + "Cost is: " + cost + "\n" + "Carrier is: " + carrier + "\n" + "WiFi is on? " + isWiFiOn;
        return output;
    }
    
}
