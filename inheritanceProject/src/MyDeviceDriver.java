import java.util.ArrayList;
public class MyDeviceDriver{
    public static void main(){
        //MyPhone phone1=new MyPhone();
        MyPhone phone=new MyPhone(16, "Gold", "ATT");
        MyPod pod=new MyPod(64, "Blue");
        MyCar car=new MyCar(40);
        ArrayList<Connectable>invetory=new ArrayList<Connectable>();
        invetory.add(phone);
        invetory.add(pod);
        invetory.add(car);

        for(Connectable device: invetory){
            device.connectToBluetooth();
        }

    }
}
