import java.util.ArrayList;

public class ProcessedPageCollection
   {
   private ArrayList<ProcessedPage> allPages;
   
   public ProcessedPageCollection()
      {
      allPages = new ArrayList<ProcessedPage>();
      } // end zero-arg construtor
      
   public void addPage( ProcessedPage page )
      {
      allPages.add( page );    
      } // end addPage
   
   public int getNumPages()
      {
      return allPages.size();    
      } // end method getNumPages
        
   public ArrayList<Integer> searchWord( String word )
      {
      System.out.println( "The searchWord method is to be completed in part C" );
      return null;
      }
   
   public String toString()
      {
      System.out.println( "Running ProcessedPageCollection toString() " );    
      String output = new String();

      for( int index=0; index< allPages.size(); index++ )
         {
         output += allPages.get(index) + "\n";     
         } // end for

      return output;   
      } // end method toString
   } // end class ProcessedPageCollection