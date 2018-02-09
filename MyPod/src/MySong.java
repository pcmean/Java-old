public class MySong{
    // step 1 create instance varables variables
    private String title;
    private int rating;
    
    // Step 2 Initialize variables in a construction
    
    public MySong(){
        
        title = new String(" ");
        rating = 0;
        
    }
    
    public MySong(String title, int rating){
        
        this.title = title;
        this.rating = rating;
        
    }
    
    public int getRating(){
        
        return this.rating;
        
    }
    
    public String toString(){
        
        String songInfo = new String(" ");
        songInfo = ("Title is: "+title+", rating is: "+rating);
        return songInfo;
    }
}
