public class MyCar extends Vehicle{
    private int mpg;
    public MyCar(int milesPerGallon){
        this.mpg=milesPerGallon;
    }

    public MyCar(int passengers, int milesPerGallon){
        super(passengers);
        this.mpg=milesPerGallon;
    }

    public void connectToBluetooth(){
        System.out.println("conecting to bluetooth for a MyCar");
    }

    public String toString(){
        String output = new String(" ");
        output = super.toString()+"\n"+"Mileage per gallon for this car is: "+mpg;
        return output;
    }
}
