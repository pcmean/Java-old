import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRootPane;

public class CardGameGUI
  extends JFrame
  implements ActionListener
{
  private static final int DEFAULT_HEIGHT = 302;
  private static final int DEFAULT_WIDTH = 800;
  private static final int CARD_WIDTH = 73;
  private static final int CARD_HEIGHT = 97;
  private static final int LAYOUT_TOP = 30;
  private static final int LAYOUT_LEFT = 30;
  private static final int LAYOUT_WIDTH_INC = 100;
  private static final int LAYOUT_HEIGHT_INC = 125;
  private static final int BUTTON_TOP = 30;
  private static final int BUTTON_LEFT = 570;
  private static final int BUTTON_HEIGHT_INC = 50;
  private static final int LABEL_TOP = 160;
  private static final int LABEL_LEFT = 540;
  private static final int LABEL_HEIGHT_INC = 35;
  private Board board;
  private JPanel panel;
  private JButton replaceButton;
  private JButton restartButton;
  private JLabel statusMsg;
  private JLabel totalsMsg;
  private JLabel[] displayCards;
  private JLabel winMsg;
  private JLabel lossMsg;
  private Point[] cardCoords;
  private boolean[] selections;
  private int totalWins;
  private int totalGames;
  
  public CardGameGUI(Board paramBoard)
  {
    this.board = paramBoard;
    this.totalWins = 0;
    this.totalGames = 0;
    
    this.cardCoords = new Point[this.board.size()];
    int i = 30;
    int j = 30;
    for (int k = 0; k < this.cardCoords.length; k++)
    {
      this.cardCoords[k] = new Point(i, j);
      if (k % 5 == 4)
      {
        i = 30;
        j += 125;
      }
      else
      {
        i += 100;
      }
    }
    this.selections = new boolean[this.board.size()];
    initDisplay();
    setDefaultCloseOperation(3);
    repaint();
  }
  
  public void displayGame()
  {
    EventQueue.invokeLater(new Runnable()
    {
      public void run()
      {
        CardGameGUI.this.setVisible(true);
      }
    });
  }
  
  public void repaint()
  {
    for (int i = 0; i < this.board.size(); i++)
    {
      String str = imageFileName(this.board.cardAt(i), this.selections[i]);
      
      URL localURL = getClass().getResource(str);
      if (localURL != null)
      {
        ImageIcon localImageIcon = new ImageIcon(localURL);
        this.displayCards[i].setIcon(localImageIcon);
        this.displayCards[i].setVisible(true);
      }
      else
      {
        throw new RuntimeException("Card image not found: \"" + str + "\"");
      }
    }
    this.statusMsg.setText(this.board.deckSize() + " undealt cards remain.");
    
    this.statusMsg.setVisible(true);
    this.totalsMsg.setText("You've won " + this.totalWins + " out of " + this.totalGames + " games.");
    
    this.totalsMsg.setVisible(true);
    pack();
    this.panel.repaint();
  }
  
  private void initDisplay()
  {
    this.panel = new JPanel()
    {
      public void paintComponent(Graphics paramAnonymousGraphics)
      {
        super.paintComponent(paramAnonymousGraphics);
      }
    };
    String str1 = this.board.getClass().getSimpleName();
    int i = str1.length();
    int j = "Board".length();
    String str2 = str1.substring(i - j);
    if ((str2.equals("Board")) || (str2.equals("board")))
    {
      k = i - j;
      setTitle(str1.substring(0, k));
    }
    int k = (this.board.size() + 4) / 5;
    int m = 302;
    if (k > 2) {
      m += (k - 2) * 125;
    }
    setSize(new Dimension(800, m));
    this.panel.setLayout(null);
    this.panel.setPreferredSize(new Dimension(780, m - 20));
    
    this.displayCards = new JLabel[this.board.size()];
    for (int n = 0; n < this.board.size(); n++)
    {
      this.displayCards[n] = new JLabel();
      this.panel.add(this.displayCards[n]);
      this.displayCards[n].setBounds(this.cardCoords[n].x, this.cardCoords[n].y, 73, 97);
      
      this.displayCards[n].addMouseListener(new CardGameGUI.MyMouseListener(null));
      this.selections[n] = false;
    }
    this.replaceButton = new JButton();
    this.replaceButton.setText("Replace");
    this.panel.add(this.replaceButton);
    this.replaceButton.setBounds(570, 30, 100, 30);
    this.replaceButton.addActionListener(this);
    
    this.restartButton = new JButton();
    this.restartButton.setText("Restart");
    this.panel.add(this.restartButton);
    this.restartButton.setBounds(570, 80, 100, 30);
    
    this.restartButton.addActionListener(this);
    
    this.statusMsg = new JLabel(this.board.deckSize() + " undealt cards remain.");
    
    this.panel.add(this.statusMsg);
    this.statusMsg.setBounds(540, 160, 250, 30);
    
    this.winMsg = new JLabel();
    this.winMsg.setBounds(540, 195, 200, 30);
    this.winMsg.setFont(new Font("SansSerif", 1, 25));
    this.winMsg.setForeground(Color.GREEN);
    this.winMsg.setText("You win!");
    this.panel.add(this.winMsg);
    this.winMsg.setVisible(false);
    
    this.lossMsg = new JLabel();
    this.lossMsg.setBounds(540, 195, 200, 30);
    this.lossMsg.setFont(new Font("SanSerif", 1, 25));
    this.lossMsg.setForeground(Color.RED);
    this.lossMsg.setText("Sorry, you lose.");
    this.panel.add(this.lossMsg);
    this.lossMsg.setVisible(false);
    
    this.totalsMsg = new JLabel("You've won " + this.totalWins + " out of " + this.totalGames + " games.");
    
    this.totalsMsg.setBounds(540, 230, 250, 30);
    
    this.panel.add(this.totalsMsg);
    if (!this.board.anotherPlayIsPossible()) {
      signalLoss();
    }
    pack();
    getContentPane().add(this.panel);
    getRootPane().setDefaultButton(this.replaceButton);
    this.panel.setVisible(true);
  }
  
  private void signalError()
  {
    Toolkit localToolkit = this.panel.getToolkit();
    localToolkit.beep();
  }
  
  private String imageFileName(Card paramCard, boolean paramBoolean)
  {
    String str = "cards/";
    if (paramCard == null) {
      return "cards/back1.GIF";
    }
    str = str + paramCard.rank() + paramCard.suit();
    if (paramBoolean) {
      str = str + "S";
    }
    str = str + ".GIF";
    return str;
  }
  
  public void actionPerformed(ActionEvent paramActionEvent)
  {
    if (paramActionEvent.getSource().equals(this.replaceButton))
    {
      ArrayList localArrayList = new ArrayList();
      for (int j = 0; j < this.board.size(); j++) {
        if (this.selections[j] != 0) {
          localArrayList.add(new Integer(j));
        }
      }
      if (!this.board.isLegal(localArrayList))
      {
        signalError();
        return;
      }
      for (j = 0; j < this.board.size(); j++) {
        this.selections[j] = false;
      }
      this.board.replaceSelectedCards(localArrayList);
      if (this.board.isEmpty()) {
        signalWin();
      } else if (!this.board.anotherPlayIsPossible()) {
        signalLoss();
      }
      repaint();
    }
    else if (paramActionEvent.getSource().equals(this.restartButton))
    {
      this.board.newGame();
      getRootPane().setDefaultButton(this.replaceButton);
      this.winMsg.setVisible(false);
      this.lossMsg.setVisible(false);
      if (!this.board.anotherPlayIsPossible())
      {
        signalLoss();
        this.lossMsg.setVisible(true);
      }
      for (int i = 0; i < this.selections.length; i++) {
        this.selections[i] = false;
      }
      repaint();
    }
    else
    {
      signalError();
      return;
    }
  }
  
  private void signalWin()
  {
    getRootPane().setDefaultButton(this.restartButton);
    this.winMsg.setVisible(true);
    this.totalWins += 1;
    this.totalGames += 1;
  }
  
  private void signalLoss()
  {
    getRootPane().setDefaultButton(this.restartButton);
    this.lossMsg.setVisible(true);
    this.totalGames += 1;
  }
  
  private class MyMouseListener
    implements MouseListener
  {
    private MyMouseListener() {}
    
    public void mouseClicked(MouseEvent paramMouseEvent)
    {
      for (int i = 0; i < CardGameGUI.this.board.size(); i++) {
        if ((paramMouseEvent.getSource().equals(CardGameGUI.this.displayCards[i])) && (CardGameGUI.this.board.cardAt(i) != null))
        {
          CardGameGUI.this.selections[i] = (CardGameGUI.this.selections[i] == 0 ? 1 : 0);
          CardGameGUI.this.repaint();
          return;
        }
      }
      CardGameGUI.this.signalError();
    }
    
    public void mouseExited(MouseEvent paramMouseEvent) {}
    
    public void mouseReleased(MouseEvent paramMouseEvent) {}
    
    public void mouseEntered(MouseEvent paramMouseEvent) {}
    
    public void mousePressed(MouseEvent paramMouseEvent) {}
  }
}
