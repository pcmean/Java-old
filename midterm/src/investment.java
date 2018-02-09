import java.util.*;
import java.lang.*;
import javax.swing.*;
import java.awt.*;
import javax.xml.bind.DatatypeConverter;
public class investment{

    public static void main(){

        int investmentAmount = 5000;
        int numYears = 0;
        int currentAge = 0;
        double intrestRate = 0;
        int dowhile1 = 1;
        int dowhile2 = 1;
        int dowhile3 = 1;
        int dowhile4 = 1;
        int dowhile5 = 1;
        while(dowhile5==1){
            while(dowhile1 == 1){
                try{
                    numYears= Integer.parseInt(JOptionPane.showInputDialog("How many years do you want to predict your investment?"));
                    dowhile1++;
                }catch(Exception e){
                    JOptionPane.showMessageDialog(null, "What was that?","Thats not a number!",JOptionPane.WARNING_MESSAGE);
                }
            }
            while(dowhile2 == 1){
                try{
                    currentAge= Integer.parseInt(JOptionPane.showInputDialog("What is your current age?"));
                    dowhile2++;
                }catch(Exception e){
                    JOptionPane.showMessageDialog(null, "What was that?","Thats not a number!",JOptionPane.WARNING_MESSAGE);
                }
            }
            while(dowhile3 == 1){
                try{
                    investmentAmount= Integer.parseInt(JOptionPane.showInputDialog("What is your investmernt amount?"));
                    dowhile3++;
                }catch(Exception e){
                    JOptionPane.showMessageDialog(null, "What was that?","Thats not a number!",JOptionPane.WARNING_MESSAGE);
                }
            }
            while(dowhile4 == 1){
                try{
                    intrestRate= Double.parseDouble(JOptionPane.showInputDialog("What is yout intrest amount?"));
                    dowhile4++;
                }catch(Exception e){
                    JOptionPane.showMessageDialog(null, "What was that?","Thats not a number!",JOptionPane.WARNING_MESSAGE);
                }

            }

            int[]years=new int[numYears];
            for (int index=0; index<numYears;index++){
                years[index]=(2016+index);
            }
            int[]ages=new int[numYears];
            for(int index=0;index<numYears;index++){
                ages[index]=(currentAge+index);
            }
            double[]oneTimeInvestment=new double[numYears];
            double[]annualInvestment=new double[numYears];
            for(int index=0;index<numYears;index++){
                if(index==0){
                    oneTimeInvestment[index]=(investmentAmount*(intrestRate+1));
                }
                else{
                    oneTimeInvestment[index]=(oneTimeInvestment[index-1]*(intrestRate+1));
                }
            }
            for(int index=0;index<numYears;index++){
                if(index==0){
                    annualInvestment[index]=(investmentAmount*(intrestRate+1));
                }
                else{
                    annualInvestment[index]=((oneTimeInvestment[index-1]*(intrestRate+1))+investmentAmount);
                }
            }
            System.out.println(investmentAmount + "\t" + numYears + "\t" + currentAge + "\t" + intrestRate);
            System.out.println("\t\t\t\t"+"Investment Analysis"+"\n"+"Initial Investment:$"+"is "+investmentAmount+"\n"+"Rate of return: "+String.format("%.0f",intrestRate*100)+"%"+"\n\n\t\t"+"End of Year Balance"+"\n"+"Year"+"\t"+"Age"+"\t"+"One Time Investment"+"\t"+"Annual Investment");
            for(int index=0; index<numYears;index++){
                System.out.print(years[index]+"\t"+ages[index]+"\t"+"$"+String.format("%.2f",oneTimeInvestment[index])+"\t\t");
                System.out.println("\t\t"+"$"+String.format("%.2f",annualInvestment[index]));
            }//end 5th for loop
            dowhile1=1;
            dowhile2=1;
            dowhile3=1;
            dowhile4=1;
        }

    }
}
