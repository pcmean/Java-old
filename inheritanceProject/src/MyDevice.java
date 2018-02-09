public abstract class MyDevice implements Connectable{
    private int memory;
    private String color;
    public MyDevice(){
        this.memory=8;
        this.color=new String("Black");
    }

    public MyDevice(int memory, String color){
        this.memory=memory;
        this.color=color;
    }

    public abstract void connectToBluetooth();

    public String toString(){
        String output=new String();
        output="Memory capacity is: "+memory+"GB\n"+"Color is: "+color;
        return output;
    }
}