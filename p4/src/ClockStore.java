public class ClockStore{
    
    static private Clock[] clocksInStock;
    static int mostTotalSeconds=0;
    
    public ClockStore(){
        
        clocksInStock = new Clock[3];
        this.clocksInStock[0] = new Clock(2, 44, 36);
        this.clocksInStock[1] = new Clock(5, 16, 57);
        this.clocksInStock[2] = new Clock(9, 53, 24);
        
        
    }
    
    public static int mostSeconds(){
        
        int mostTotalSeconds=0;
        
        for(int index=0;index<clocksInStock.length;index++){
            
            if(index==0){
                
                mostTotalSeconds=index;
                
            }
            
            if(clocksInStock[index].totalSeconds()>clocksInStock[mostTotalSeconds].totalSeconds()){
                
                mostTotalSeconds=index;
                
            }
            
            
        }
        return mostTotalSeconds;
    }
    
}
