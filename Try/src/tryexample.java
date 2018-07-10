import javax.swing.JOptionPane;

public class tryexample {
	public static void main(String[] args) {
		boolean doWhile1=true;
		while(doWhile1==true){
		int input=0;
		boolean doWhile = true;
			while(doWhile==true){
	            try{
	            	input = Integer.parseInt(JOptionPane.showInputDialog("Which output do you want?"));
	            	doWhile=false;
	            }catch(Exception e){
	            	JOptionPane.showMessageDialog(null, "What was that?","",JOptionPane.WARNING_MESSAGE);
	            }
			}
			
		}
		
    }
}