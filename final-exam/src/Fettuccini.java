import java.util.*;
import java.lang.*;
import javax.swing.*;
import java.awt.*;
import javax.xml.bind.DatatypeConverter;
public class Fettuccini{
    public static void main(){

        int numFet= 1;
        int dowhile1 = 1;
        int locCol;
        int locRow;
        int fillFetNum = 0;
        int fillFetNum1 = 0;
        int fillFetNum2 = 0;
        int number=0;
        ArrayList<Integer>coordinates= new ArrayList<Integer>();
        while(dowhile1 == 1){
            try{
                numFet= Integer.parseInt(JOptionPane.showInputDialog("What number do you wana look for?(between 1 and 9)"));
                if(numFet>30){
                    numFet=30;
                }
                System.out.println(numFet+"\n\n\n\n\n\n\n\n\n\n\n");
                dowhile1++;
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, "What was that?","Thats not a number!",JOptionPane.WARNING_MESSAGE);
            }
        }

        int [][]grid=new int[numFet][3];
        for(int row=0; row<grid.length;row++){
            number=row+1;
            grid[row][0]=(number);
            //System.out.println(number);
        }
        grid[0][1]=(-1);
        grid[1][1]=(0);
        grid[2][1]=(1);
        //System.out.println(+grid[0][1]+"\t"+grid[1][1]+"\t"+grid[2][1]);
        for(int row=3; row<grid.length;row++){
            locRow=row-1;
            locCol=row-3;
            //System.out.println(row+"\t"+grid[locRow][1]+"\t"+grid[locCol][1]);
            fillFetNum1=(grid[locRow][1]);
            fillFetNum2=(grid[locCol][1]);
            fillFetNum=fillFetNum1+fillFetNum2;

            grid[row][1]=(fillFetNum);
        }
        for(int row=0; row<grid.length;row++){
            number=0;
            if((grid[row][0]%2)==0){
                number=(grid[row][1]);
            }// even
            else{
                number=((grid[row][0])+(grid[row][1]));
            }// odd
            System.out.println(number);
            grid[row][2]=(number);
        }
        System.out.println("Numbers"+"\t\t"+"Fettuccini Number"+"\t"+"Fettuccini Sum");
        for(int row=0; row<grid.length; row++){
            for(int col=0; col<grid[0].length;col++){

                System.out.print(grid[row][col]+"\t\t\t");                

            }
            System.out.println();
        }	
    }
}