public class MySong{
    // step 1 create instance varables variables
    private String tital;
    private int rating;
    
    // Step 2 Initialize variables in a construction
    
    public MySong(){
        
        tital = new String(" ");
        rating = 0;
        
    }
    
    public MySong(String tital, int rating){
        
        this.tital = tital;
        this.rating = rating;
        
    }
    
    public int getRating(){
        
        return this.rating;
        
    }
    
    public String toString(){
        
        String songInfo = new String(" ");
        songInfo = ("Tital: "+tital+", rating: "+rating);
        return songInfo;
    }
}
