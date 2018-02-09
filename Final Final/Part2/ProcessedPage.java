import java.util.ArrayList;

public class ProcessedPage
   {
   private ArrayList<String> page;  // each element of page is a single word
   
   public ProcessedPage()
      {
      page = new ArrayList<String>();    
      } // end zero-arg constructor
      
   public void addWord( String word )
      {
      page.add( word );          
      } // end method addWord
        
   public String toString()
      {
      String output = new String();
      for( String word : page )
         {
         output += word + " ";    
         } // end for
      return output;   
      }
       
   } // end class ProcessedPage