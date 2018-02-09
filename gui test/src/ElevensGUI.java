public class ElevensGUI
{
  public static void main(String[] paramArrayOfString)
  {
    ElevensBoard localElevensBoard = new ElevensBoard();
    CardGameGUI localCardGameGUI = new CardGameGUI(localElevensBoard);
    localCardGameGUI.displayGame();
  }
}
