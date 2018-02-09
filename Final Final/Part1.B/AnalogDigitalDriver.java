/*
 * Write a class AnalogDigitalDriver that creates an instance of a BWTV and a HDTV. These objects should then be added to an ArrayList of “TV”s. 
a. Use a for-each loop to print the type of TV and whether or not the TV is on. 
b. Use a regular for loop to turn on each TV. 
c. Use a separate for-each loop to print the type of TV and whether or not it is on. 
d. Print the result of calling the “rotateRabbitEars()” method for a BWTV.
e. Print the result of calling the “connectHDMI()” method for a HDTV.
 */
import java.util.*;
public class AnalogDigitalDriver{
	public static void main( String[] args ){
		HDTV HD = new HDTV();
		BWTV BW = new BWTV();
		ArrayList<TV> TVs = new ArrayList<TV>();
		TVs.add(HD);
		TVs.add(BW);
		for( TV device : TVs ){
			System.out.println(device.tvType()+"\nTv On?: "+device.getTvOn()+"\n");              
		} // end for each
		for(int index=0; index<TVs.size();index++){
			TVs.get(index).setTvOn(true);
		}
		for( TV device : TVs ){
			System.out.println(device.tvType()+"\nTv On?: "+device.getTvOn()+"\n");                
		} // end for each
		BW.rotateRabbitEars();
		HD.connectHDMI();
	}
}
