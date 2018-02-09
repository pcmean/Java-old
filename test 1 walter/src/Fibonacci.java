import javax.swing.JOptionPane;
 
public class Fibonacci
   {
   public static void main( String[]args )
      {
      String numberSeen = JOptionPane.showInputDialog( "How many do you want to see?" ); 
      int numFib = Integer.parseInt( numberSeen );
     
      int[] numbers = new int[50];
      for( int index = 0; index < numFib; index++ )
         {
         numbers[index] = index + 1;
         } // end first for loop
     
      int[] fibonacci = new int[50];
      for( int index = 0; index < numFib; index++ )
         {
         if( index < 2 )
            {
            fibonacci[index] = index;   
            } // end if
         else
            {
            fibonacci[index] = fibonacci[index-1 ] + fibonacci[index-2];
            } // end else
         } // end second for loop
     
      System.out.println( "Number\t" + "Fibonacci Number\t" + "Running Total of FNs" );
      int runningTotal = 0;
      for( int index = 0; index < numFib; index++ )
         {
         runningTotal = fibonacci[index] + runningTotal;
         System.out.println( numbers[index] + "\t" + fibonacci[index] + "\t\t\t" + runningTotal );
         } // end third for loop
      } // end method main
   } // end class Fibonacci