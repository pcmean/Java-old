public class MyPod extends MyDevice{

    public MyPod(){
        super();

    }

    public MyPod(int memory, String color){
        super(memory,color);

    }

    public void connectToBluetooth(){
        System.out.println("Connecting to bluetooth for a MyPod");
    }

    public String toString(){
        return super.toString();

    }
}