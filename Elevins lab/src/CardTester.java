import javax.swing.JOptionPane;
/**
 * This is a class that tests the Card class.
 */
public class CardTester {

    /**
     * The main method in this class checks the Card operations for consistency.
     *           @param args is not used.
     */
    public static void main(String[] args) {
        String[] choicesCard = {"Pick One","2", "3", "4", "5", "6", "7","8","9","10","Jack","Queen","King"};
        String[] choicesSuit = {"Pick One","Hearts","Clubs","Spades","Diamonds"};
        Object[] message1 = {
                "the card is a", choicesCard,choicesCard[0],
                "Of:", choicesSuit,choicesSuit[0]};
        //String input = JOptionPane.showInputDialog(null, message1, "Login", JOptionPane.OK_CANCEL_OPTION);

        String input = (String) JOptionPane.showInputDialog(null, "Choose now...", "Card", JOptionPane.QUESTION_MESSAGE, null, choicesCard, choicesCard[0],null, choicesSuit,choicesSuit[0]);
        System.out.println(input);
        /* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
    }
}

