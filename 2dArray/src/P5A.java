import java.util.*;
import javax.swing.*;
public class P5A{
    public static void main(String[]args){

        int [][]grid=new int[3][4];
        int chosenNum= 1;
        int dowhile1 = 1;
        int locCol;
        int locRow;
        ArrayList<Integer>coordinates= new ArrayList<Integer>();
        while(dowhile1 == 1){
            try{
                chosenNum= Integer.parseInt(JOptionPane.showInputDialog("What number do you wana look for?(between 1 and 9)"));
                dowhile1++;
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, "What was that?","Thats not a number!",JOptionPane.WARNING_MESSAGE);
            }
        }

        for(int row=0; row<grid.length;row++){
            for(int col=0; col<grid[0].length;col++){
                grid[row][col]=(int)(1+Math.random()*8);
                if(grid[row][col]==chosenNum){
                    coordinates.add(row);
                    coordinates.add(col);
                }
            }
        }
        for(int row=0; row<grid.length; row++){
            for(int col=0; col<grid[0].length;col++){

                System.out.print(grid[row][col]+" ");                

            }
            System.out.println();
        }
        if(coordinates.size()>0){
            System.out.println("The number "+chosenNum+" can be found at the following coordinates(row,col): ");
            for(int index=0; index<coordinates.size();index = index + 2){
                locRow=0+coordinates.get(index);
                locCol=0+coordinates.get(index+1);
                System.out.println("("+locRow+","+locCol+")");
                
            }
        }
        else{
            System.out.println("I can't find "+chosenNum+" in the grid!");
        }

    }
}
