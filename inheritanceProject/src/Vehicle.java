public abstract class Vehicle implements Connectable{
    private int numPassengers;
    public Vehicle(){
        this.numPassengers=0;
    }

    public Vehicle(int passengers){
        this.numPassengers=passengers;
    }

    public abstract void connectToBluetooth();

    public String toString(){
        return "Number of Passengers is: "+numPassengers;
    }

}
