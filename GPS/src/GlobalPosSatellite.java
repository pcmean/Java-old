import java.util.*;
import java.text.*;
import java.lang.*;
public class GlobalPosSatellite{
    static int getTime1(){

        int finalTimeStampP1=0;
        int finalTime1=0;
        String timeStampP1 = new SimpleDateFormat("yyyyMMdd").format(Calendar.getInstance().getTime());
        finalTimeStampP1= Integer.parseInt(timeStampP1);
        finalTime1=finalTimeStampP1;
        return finalTime1;
    }

    static int getTime2(){

        int finalTimeStampP2=0;
        int finalTime2=0;
        String timeStampP2 = new SimpleDateFormat("HHmmss").format(Calendar.getInstance().getTime());
        finalTimeStampP2= Integer.parseInt(timeStampP2);
        finalTime2=finalTimeStampP2;
        return finalTime2;
    }

    public void GlobalPosSatellite(){

    }

    public void GlobalPosSatellite(String name, String altitude, double transmitionTime){

    }

}
