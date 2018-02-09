import java.util.*;
import java.io.*;

public class WebpageProcessor{
   private ArrayList<String> letters;
   private String line;
   
   public WebpageProcessor(){
      letters = new ArrayList<String>();
      line = new String();
      } // end constructor FileConverter
  
   public ArrayList<String> fileToLetters( String filename ){
      try{
         File myFile = new File( filename );
         FileReader fileReader = new FileReader(myFile);
         BufferedReader reader = new BufferedReader(fileReader);
         
         line = reader.readLine();
         //System.out.println( "Printing reader..." + line );
         //System.out.println( "The length of the line is: " + line.length() );
         
         for( int index = 0; index < line.length(); index++ ){
            letters.add( line.substring( index, index+1 ) );   
            } // end for
         reader.close();
         } // end try
      catch(Exception ex){
         ex.printStackTrace();	
         } // end catch   	
      return letters;   
      } // end method fileToLetters
       
      
   public ProcessedPage lettersToPage( ArrayList<String> letters ){
      // Part B: return a ProcessedPage object. Each element in the ArrayList in the
      //         ProcessedPage object represents one entire word from the String "line".
      ProcessedPage page = new ProcessedPage();
      ArrayList<String>temp= new ArrayList<String>();
      
      String tempWord=new String();
      
      for(int index=0; index<letters.size();index++){
    	  if(!(letters.get(index).equals(" "))){
    		  //if
    	  }
      }
      
      
      
      page.addWord( "Needs to be completed per Part B instructions" );
      return page;
      } // end method fileToWords
      
   } // end class WebpageProcessor