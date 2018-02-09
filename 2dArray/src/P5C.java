import java.util.*;
import java.lang.*;
import javax.swing.*;
import java.awt.*;
import javax.xml.bind.DatatypeConverter;
public class P5C{
    public static void main(){

        int [][]grid=new int[10][10];
        int chosenNum= 1;
        int dowhile1 = 1;

        for(int row=0; row<grid.length;row++){
            for(int col=0; col<grid[0].length;col++){
                grid[row][col]=(row)*(col);
            }
        }
        for(int row=0; row<1;row++){
            for(int col=0; col<grid[0].length;col++){
                grid[row][col]=col;
            }
        }
        for(int row=0; row<1;row++){
            for(int col=0; col<grid[0].length;col++){
                grid[col][row]=col;
            }
        }
        
        
        for(int row=0; row<grid.length; row++){
            for(int col=0; col<grid[0].length;col++){
                System.out.print(grid[row][col]+"\t");                
            }
            System.out.println("\n");
        }
    }
}
