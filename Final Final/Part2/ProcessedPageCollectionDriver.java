import java.util.ArrayList;

public class ProcessedPageCollectionDriver
   {
   public static void main( String[] args )
      {
      WebpageProcessor rawText1 = new WebpageProcessor();  
      ArrayList<String> letters1 = rawText1.fileToLetters( "page1.txt" );
      ProcessedPage page1 = rawText1.lettersToPage( letters1 );
      
      WebpageProcessor rawText2 = new WebpageProcessor();  
      ArrayList<String> letters2 = rawText2.fileToLetters( "page2.txt" );
      ProcessedPage page2 = rawText2.lettersToPage( letters2 );
      
      WebpageProcessor rawText3 = new WebpageProcessor();  
      ArrayList<String> letters3 = rawText3.fileToLetters( "page3.txt" );
      ProcessedPage page3 = rawText3.lettersToPage( letters3 );
          
      ProcessedPageCollection internet = new ProcessedPageCollection();
      internet.addPage( page1 );
      internet.addPage( page2 );
      internet.addPage( page3 );
      System.out.println( "Number of pages in this collection is: " + internet.getNumPages() + "\n" );
      System.out.println( "Printing contents of all pages: \n" + internet );
      
      
      // Testing Part C: searchWord()
      System.out.println( "Printing Results of searchWord()" );
      System.out.println( internet.searchWord( "cat" ) );
      System.out.println( internet.searchWord( "dog" ) );
      System.out.println( "\n\n" );
          
      } // end method main
       
    } // end class WebPageDriver