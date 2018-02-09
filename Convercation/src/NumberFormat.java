public class NumberFormat{
    public static void main(){
        double myNumber1=12390.0987654345678987654;
        double myNumber2=3.14158;
        
        System.out.println("Without formatting, my numbers are: \n" + myNumber1 +", "+myNumber2);
        String s = String.format("%.3f,%.2f",myNumber1,myNumber2);
        System.out.println("Now with formatting, my numbers are: \n" +s);

    }
}

