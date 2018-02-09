import javax.swing.*;
public class DailyTemp{

    static  void main(){
        int numdaysint = -1;
        do{
            String numDays = JOptionPane.showInputDialog("enter the days(A number)");
            try{
                numdaysint = Integer.parseInt(numDays);
            }
            catch(Exception e){
                JOptionPane.showInputDialog("NOW THIS IS WHY WE CAN'T HAVE NICE THINGS");

            }
            if (numdaysint<=0){

                break;
            }
            int[]dates=new int[numdaysint];
            int[]dailytemps = new int[numdaysint];
            for(int i = 0; i <numdaysint; i++){
                dates[i]=i++;

            }
            for(int i=0; i<numdaysint;i++){
                dailytemps[i] = -100+(int)(Math.random()*200);
            }
            String[] forecast = new String[numdaysint];
            for(int i = 0; i<numdaysint;i++){
                if(dailytemps[i]>=80){
                    forecast[i]=new String("hot");
                }
                if(dailytemps[i]<80&&dailytemps[i]>-60){
                    forecast[i]=new String("moderate");
                }
                if(dailytemps[i]<60&&dailytemps[i]>32){
                    forecast[i]=new String("cold");
                }
                else{
                    forecast[i]=new String("Frezing");
                }
            }
            System.out.println("\n"+"\n"+"Date"+"\t"+"Daily Temp"+"\t"+"Forecast");
            for(int i = 0;i<numdaysint;i++){
                System.out.println("\n"+"\n"+dates[i]+"\t"+dailytemps[i]+"\t\r"+forecast[i]);

            }
        }while(numdaysint!=-999);
    }	
}

