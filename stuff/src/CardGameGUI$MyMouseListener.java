import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

class CardGameGUI$MyMouseListener
  implements MouseListener
{
  private CardGameGUI$MyMouseListener(CardGameGUI paramCardGameGUI) {}
  
  public void mouseClicked(MouseEvent paramMouseEvent)
  {
    for (int i = 0; i < CardGameGUI.access$100(this.this$0).size(); i++) {
      if ((paramMouseEvent.getSource().equals(CardGameGUI.access$200(this.this$0)[i])) && (CardGameGUI.access$100(this.this$0).cardAt(i) != null))
      {
        CardGameGUI.access$300(this.this$0)[i] = (CardGameGUI.access$300(this.this$0)[i] == 0 ? 1 : 0);
        this.this$0.repaint();
        return;
      }
    }
    CardGameGUI.access$400(this.this$0);
  }
  
  public void mouseExited(MouseEvent paramMouseEvent) {}
  
  public void mouseReleased(MouseEvent paramMouseEvent) {}
  
  public void mouseEntered(MouseEvent paramMouseEvent) {}
  
  public void mousePressed(MouseEvent paramMouseEvent) {}
}
