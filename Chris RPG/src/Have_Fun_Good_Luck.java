import javax.swing.JOptionPane;

public class Have_Fun_Good_Luck {
	public static void main(String[] args) {
		boolean doWhile1=true, doWhile2 = true;
		int input1=0,input2=0;
		String Output = null;
		while(doWhile1==true){
			doWhile2=true;
			while(doWhile2==true){
				try{
					input1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Which output do you want?", "Please enter a number betwen 1-5",JOptionPane.QUESTION_MESSAGE));
					doWhile2=false;
				}catch(Exception e){
					JOptionPane.showMessageDialog(null, "What was that?","",JOptionPane.ERROR_MESSAGE);
				}
			}
			if(input1>0&&input1<=3)
				switch (input1) {
					case 1:  Output = "Look Behind you!?!?!?!"; break;
					case 2:  Output = "Don't be out too late!"; break;
					case 3:  Output = "O Snap theres a dinosoar there"; break;
					default: Output = "We are all Doomed!!!!"; break;
				}
			JOptionPane.showMessageDialog(null,Output, "Your Output", JOptionPane.OK_OPTION);

			input2 = (JOptionPane.showConfirmDialog(null,"Would you like to run this program again?", "Choose one", JOptionPane.YES_NO_OPTION));
			System.out.println(input2);
			if(input2==1) {
				doWhile1=false;
			}

		}

	}
}
