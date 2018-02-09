public class MyPhone extends MyDevice{
    private String carrier;
    public MyPhone(){
        super();//calls the constructor from the class
        this.carrier=new String ("none");
    }

    public MyPhone(int memory, String color, String carrier){
        super(memory,color);//MyDevice is calling it for MyPhone
        this.carrier=carrier;
    }

    public void connectToBluetooth(){
        System.out.println("Connecting to bluetooth for a MyPhone");
    }

    public String toString(){
        String output=new String("");
        output=super.toString()+"\n"+"Carrier is: "+carrier;
        return output;
    }
}