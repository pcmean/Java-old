public class GamePiece{
    private int row,col;
    private Board board;
    public GamePiece(int row, int col, Board board){this.row=row; this.col=col; this.board=board;}
    public void addSelfToBoard(){board.addPiece(this);}
    public int getRow(){return this.row;}
    public int getCol(){return this.col;}
    public String toString(){return row+","+col;}
}
