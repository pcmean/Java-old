import java.util.*;
import java.lang.*;
import javax.swing.*;
import java.awt.*;
import javax.xml.bind.DatatypeConverter;
public class P5D{
    public static void main(){

        String [][]grid=new String[9][9];

        String[] Letters = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
        int letter=0;
        for(int row=0; row<grid.length;row++){//create 2d array
            for(int col=0; col<grid[0].length;col++){
                grid[row][col]=Letters[letter];
                //System.out.print(grid[row][col]+" ");
                //System.out.println(letter);
                letter++;
                if(letter>=26){
                    letter=0;
                }
            }
        }
        for(int row=0; row<grid.length; row++){//prints 2d array
            for(int col=0; col<grid[0].length;col++){
                System.out.print(grid[row][col]+"\t");                
            }
            System.out.println("\n");
        }
    }
}

