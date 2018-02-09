import java.util.ArrayList;

public class MyDevicesDriver{
   public static void main( String[] args ){
	   
      MyPod pod = new MyPod( 32, "Black" );
      MyPhone phone = new MyPhone( 16, "Blue", "AT&T" );
      MyCar HotRod = new MyCar(3);
      
      ArrayList<Connectable> inventory = new ArrayList<Connectable>();
      ArrayList<Discountable> i1 = new ArrayList<Discountable>();
      inventory.add( pod );
      i1.add(pod);
      inventory.add( phone );
      i1.add(phone);
      inventory.add( HotRod );
      i1.add(HotRod);
      
      for( Connectable device : inventory ){
         device.connectToBluetooth();              
         } // end for each
      for( Discountable device : i1 ){
         device.applyDiscount();              
         } // end for each
         
      } // end method main
   } // end class MyDevicesDriver
   