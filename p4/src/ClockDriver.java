import javax.swing.*;
public class ClockDriver
{
    public static void main(String[]args){
        
        Clock bedroomClock = new Clock();
        System.out.println(bedroomClock);
        int hour=Integer.parseInt(JOptionPane.showInputDialog("What is the current hour?"));
        int minute=Integer.parseInt(JOptionPane.showInputDialog("What is the current minute?"));
        int second= Integer.parseInt(JOptionPane.showInputDialog("What is the current seccond?"));
        
        bedroomClock.setTime(hour, minute, second);
        System.out.println(bedroomClock);
        
        String setDST = new String();
        int counter = 0;
        while(counter==0){
            
            setDST=JOptionPane.showInputDialog("Is it Daylight Savings time?");
            if(setDST.equals("yes")){
                
                bedroomClock.setDaylightSaving(hour);
                
            }
        }
        
    }
}
