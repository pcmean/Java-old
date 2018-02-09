public class Board{
    private GamePiece[][]theBoard;//2d array
    public Board(){theBoard=new GamePiece[4][4];}
    public void addPiece(GamePiece piece){theBoard[piece.getRow()][piece.getCol()]=piece;}
    public String toString(){String output=new String(); for(int row=0;row<theBoard.length;row++){ for(int col=0;col<theBoard[0].length;col++){output+=theBoard[row][col]+"\t";} output+="\n"; } return output;}
}
