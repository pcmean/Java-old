public class BoardDriver{
    private int row,col; private Board board;
    public static void main(){ Board gameboard= new Board(); GamePiece piece1=new GamePiece(3,3,gameboard); GamePiece piece2=new GamePiece(1,2,gameboard); piece1.addSelfToBoard(); piece2.addSelfToBoard(); System.out.println(gameboard);}
}

