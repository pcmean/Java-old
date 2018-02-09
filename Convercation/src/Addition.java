import javax.swing.JOptionPane;
public class Addition{
    public static void main(){
        int num1 = 10;
        int num2 = 20;

        int sum = num1 + num2;

        System.out.println("The sum is: "+sum);
        //         JOptionPane.showMessageDialog(null,"the sum is:   " + sum, "The Summing Program",JOptionPane.WARNING_MESSAGE);
        //         JOptionPane.showMessageDialog(null,"the sum is:   " + sum, "The Summing Program",JOptionPane.ERROR_MESSAGE);
        //         JOptionPane.showMessageDialog(null,"the sum is:   " + sum, "The Summing Program",JOptionPane.INFORMATION_MESSAGE);
        //         JOptionPane.showMessageDialog(null,"the sum is:   " + sum, "The Summing Program",JOptionPane.QUESTION_MESSAGE);

        for(int ctr = 0; ctr<20;ctr++){
            JOptionPane.showMessageDialog(null,"the sum is:   " + sum, "The Summing Program",JOptionPane.WARNING_MESSAGE);
            JOptionPane.showMessageDialog(null,"the sum is:   " + sum, "The Summing Program",JOptionPane.ERROR_MESSAGE);
            JOptionPane.showMessageDialog(null,"the sum is:   " + sum, "The Summing Program",JOptionPane.INFORMATION_MESSAGE);
            JOptionPane.showMessageDialog(null,"the sum is:   " + sum, "The Summing Program",JOptionPane.QUESTION_MESSAGE);
        }

    }
}

