import java.util.ArrayList;

public class WebpageProcessorDriver
{
	public static void main( String[] args )
	{
		ArrayList<String> temp;
		WebpageProcessor page1 = new WebpageProcessor();  
		temp = new ArrayList<String>( page1.fileToLetters( "myfile.txt" ) );
		System.out.println( "Your letters are: " + temp );
		System.out.println( "Word(s) on processed page is/are: " + page1.lettersToPage( temp ) + "\n" );

		WebpageProcessor page2 = new WebpageProcessor();  
		temp = new ArrayList<String>( page2.fileToLetters( "page1.txt" ) );
		System.out.println( "Your letters are: " + temp );
		System.out.println( "Word(s) on processed page is/are: " + page2.lettersToPage( temp ) + "\n" );

		WebpageProcessor page3 = new WebpageProcessor();  
		temp = page3.fileToLetters( "page2.txt" );
		System.out.println( "Your letters are: " + temp );
		System.out.println( "Word(s) on processed page is/are: " + page3.lettersToPage( temp ) + "\n" );


		// This page contains "enter" keystrokes. You can use this page to test Part D
		System.out.println( "Page 3 can be used to test Part D - processing \"enter\" keystrokes" );
		WebpageProcessor page4 = new WebpageProcessor();  
		temp = page3.fileToLetters( "page3.txt" );
		System.out.println( "Your letters are: " + temp );
		System.out.println( "Word(s) on processed page is/are: " + page4.lettersToPage( temp ) + "\n" );
	} // end method main

} // end class WebpageProcessorDriver
