/**
 * @author FRCTeam5678
 *
 */
public class MyCar extends Vehicle implements Connectable, Discountable{
	public MyCar() {
		super();   
	} // end zero argument constructor

	public MyCar( int passangers)
	{
		super(passangers);
	} // end two argument constructor

	public void connectToBluetooth()
	{
		System.out.println( "Connecting to bluetooth for a MyCar" );   

	} // end method connectToBlueTooth

	public void applyDiscount() {
		
		System.out.println("Price Discount for MyCar is 20%");
	}

	/*
	public String toString()
	{
		return super.toString();   
	} // end method toString()

	*/
}
