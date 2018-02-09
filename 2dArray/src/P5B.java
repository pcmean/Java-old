import java.util.*;
import java.lang.*;
import javax.swing.*;
import java.awt.*;
import javax.xml.bind.DatatypeConverter;
public class P5B{
    public static void main(){

        int [][]grid=new int[3][5];
        int populate = 1;
        int rowTotal=0;
        ArrayList<Integer>totals= new ArrayList<Integer>();

        for(int row=0; row<grid.length;row++){//create 2d array
            for(int col=0; col<grid[0].length;col++){
                grid[row][col]=populate;
                populate++;
            }
        }
        for(int row=0; row<grid.length;row++){//total the rows
            rowTotal=0;
            for(int col=0; col<grid[0].length;col++){
                rowTotal = rowTotal+grid[row][col];
            }
            totals.add(rowTotal);
        }
        for(int col=0; col<grid[0].length;col++){//total the cols 
            rowTotal=0;
            for(int row=0; row<grid.length;row++){
                rowTotal = rowTotal+grid[row][col];
            }
            totals.add(rowTotal);
        }
        rowTotal=0;
        for(int index=0; index<grid.length;index++){
            rowTotal = rowTotal+totals.get(index);
        }
        totals.add(rowTotal);
        //totals.get(0); = row 0
        //totals.get(1); = row 1
        //totals.get(2); = row 2

        //totals.get(3); = col 0
        //totals.get(4); = col 1
        //totals.get(5); = col 2
        //totals.get(6); = col 3
        //totals.get(7); = col 4

        //totals.get(8); = grand total
        for(int row=0; row<grid.length; row++){
            for(int col=0; col<grid[0].length;col++){
                System.out.print(grid[row][col]+"\t");                
            }
            System.out.println();
        }
        System.out.println("\n\n All the totals!!!");
        System.out.println("The total of row 0 is "+totals.get(0)+".");
        System.out.println("The total of row 1 is "+totals.get(1)+".");
        System.out.println("The total of row 2 is "+totals.get(2)+"."+"\n\n");

        System.out.println("The total of col 0 is "+totals.get(3)+".");
        System.out.println("The total of col 1 is "+totals.get(4)+".");
        System.out.println("The total of col 2 is "+totals.get(5)+".");
        System.out.println("The total of col 3 is "+totals.get(6)+".");
        System.out.println("The total of col 4 is "+totals.get(7)+"."+"\n\n");

        System.out.println("The Grand total is "+totals.get(8)+".");
    }
}
