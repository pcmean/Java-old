import javax.swing.JOptionPane;

public class tryexample {
	public static void main(String[] args) {
		int month = 0;
		int doWhile = 0;
		while(doWhile==0){
            try{
            	month = Integer.parseInt(JOptionPane.showInputDialog("Number of month (1-12)"));
            	doWhile++;
            }catch(Exception e){
            	JOptionPane.showMessageDialog(null, "What was that?","",JOptionPane.WARNING_MESSAGE);
            }
		}
		System.out.println(month);
    }
}
