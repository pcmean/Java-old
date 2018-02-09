import java.util.ArrayList; 

public class MyDeviceDriver {
public static void main(String[]args)
{
MyPhone phone1=new MyPhone();
MyPhone phone2=new MyPhone(16, "Gold", "Verizon");

System.out.println(phone1);
System.out.println();
System.out.println(phone2); 
System.out.println("\n");


MyPod pod1=new MyPod();
MyPod pod2=new MyPod(64, "Blue");
System.out.println(pod1);
System.out.println();
System.out.println(pod2);
System.out.println("\n"); 

ArrayList<MyDevice>inventory=new ArrayList<MyDevice>();
inventory.add(phone1);
inventory.add(phone2);
inventory.add(pod1);
inventory.add(pod2);
	
for(MyDevice device: inventory)
{
	System.out.println(device);
	
}//end for each

	
}//end main	
}//end class MyDeviceDriver
