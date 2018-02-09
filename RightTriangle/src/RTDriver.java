import java.util.*;
import java.lang.*;
import javax.swing.*;
import java.awt.*;
import javax.xml.bind.DatatypeConverter;
public class RTDriver{
    public static void main(){

        RightTriangle triangle = new RightTriangle();
        int doWhile3=0;
        int height=0;
        int base=0;
        int option3;
        int option4;

        double angle=0.0;
        String formula = "";
        while(doWhile3==0){
            try{

                height=Integer.parseInt(JOptionPane.showInputDialog("What is the current height?"));
                base=Integer.parseInt(JOptionPane.showInputDialog("What is the current base?"));
                doWhile3++;

            }catch(Exception e){

                JOptionPane.showMessageDialog(null, "What was that?","That is not a number!!!!!",JOptionPane.WARNING_MESSAGE);


            }
        }
        //System.out.println(bedroomClock);
        //Clock bedroomClock = new Clock();
        //ClockStore mts = new ClockStore();
        //message5 = "The clock with the greatest time is clock "+Integer.toString(ClockStore.mostangles())+".";
        //option5 = JOptionPane.showConfirmDialog(null, message5, "Clock with greates time.", JOptionPane.DEFAULT_OPTION);

    }
}
