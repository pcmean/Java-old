public class GlobalPosSatelliteDriver
{
    public static void main(){

        int time1=GlobalPosSatellite.getTime1();
        int time2=GlobalPosSatellite.getTime2();
        int time2final= (time2+1000000000);
        int timeFinal=time1+time2;
        System.out.println(time1);
        System.out.println(time2);
        System.out.println(time2final);
        System.out.println(timeFinal);

    }
}
