import java.util.*;
import java.lang.*;
import javax.swing.*;
import java.awt.*;
import javax.xml.bind.DatatypeConverter;
public class BoardDriverLoop{
    private int row,col; private Board board;
    public static void main(){ Board gameboard= new Board(); int inrow = 0,incol = 0; while(true){ try{inrow=Integer.parseInt(JOptionPane.showInputDialog("what row would you like the gamepiece at")); }catch(Exception e){ JOptionPane.showMessageDialog(null, "What was that?","",JOptionPane.WARNING_MESSAGE);} try{ incol=Integer.parseInt(JOptionPane.showInputDialog("what col would you like the gamepiece at"));}catch(Exception e){ JOptionPane.showMessageDialog(null, "What was that?","",JOptionPane.WARNING_MESSAGE);}GamePiece piece1=new GamePiece(inrow,incol,gameboard); gameboard.addPiece(piece1); System.out.println('\u000C'); System.out.println(gameboard);}}
}
