import java.util.*;

public class TileGame {
	ArrayList<NumberTile> myTiles = new ArrayList<NumberTile>();
	ArrayList<NumberTile> gameBoard = new ArrayList<NumberTile>();
	 NumberTile tile0 = new NumberTile(4, 3, 7, 4);
	 NumberTile tile1 = new NumberTile(6, 4, 3, 3);
	 NumberTile tile2 = new NumberTile(1, 2, 3, 4);
	 NumberTile tile3 = new NumberTile(3, 2, 5, 2);
	 NumberTile tile4 = new NumberTile(5, 9, 2, 2);
	 NumberTile hand1 = new NumberTile(4, 2, 9, 2);
	 NumberTile hand2 = new NumberTile(4, 2, 9, 8);
	 

	public TileGame() {
		gameBoard.add(0,tile0);
		gameBoard.add(1,tile1);
		gameBoard.add(2,tile2);
		gameBoard.add(3,tile3);
		gameBoard.add(4,tile4);
		myTiles.add(hand1);
		myTiles.add(hand2);	
		System.out.print("Done constructing TileGame");
	} // end constructor TileGame

	public int getIndexForFit(NumberTile tile) {
		int position = 0;
		boolean firstPosition = true;
		for (int index = 0; index < 1; index++) {
			if (tile.getRight() == gameBoard.get(index).getLeft()) {
				position = index;
				firstPosition = false;
			}
		}
		for (int index = 1; index < gameBoard.size(); index++) {
			if (tile.getLeft() == gameBoard.get(index - 1).getRight()) {
				if (tile.getRight() == gameBoard.get(index).getLeft()) {
					position = index;
				}
			}
		}
		for (int index = 4; index < 5; index++) {
			if (tile.getLeft() == gameBoard.get(index).getRight()) {
				position = index + 1;
			}
		}
		if (firstPosition == true) {
			if (position == 0) {
				position = -1;
				firstPosition = false;
			}
		}
		return position;
	} // end method getIndexForFit

	public boolean insertTile() {
		boolean insert = false;
		for(int index=0; index< myTiles.size(); index++){
			if(getIndexForFit(myTiles.get(index))!=-1) {insert=true; gameBoard.add(getIndexForFit(myTiles.get(index)),myTiles.get(index));}
			else if(getIndexForFit(myTiles.get(index))==-1){
				myTiles.get(index).rotate();
				if(getIndexForFit(myTiles.get(index))!=1){insert=true; gameBoard.add(getIndexForFit(myTiles.get(index)),myTiles.get(index));}
				else if(getIndexForFit(myTiles.get(index))==-1){
					myTiles.get(index).rotate();
					if(getIndexForFit(myTiles.get(index))!=1){insert=true; gameBoard.add(getIndexForFit(myTiles.get(index)),myTiles.get(index));}
				else if(getIndexForFit(myTiles.get(index))==-1){
					myTiles.get(index).rotate();
					if(getIndexForFit(myTiles.get(index))!=1){insert=true; gameBoard.add(getIndexForFit(myTiles.get(index)),myTiles.get(index));}
					if(getIndexForFit(myTiles.get(index))==1){insert=false;}
					}
				}
			}
		}
		for(int index=0;index<myTiles.size();index++){
			if(insert){myTiles.set(index,null);}
		}
		return insert;
	} // end method Tile

	public String toString() {
		String theTiles=new String();
		String gameBoardTiles=new String();
		for(int index=0;index<myTiles.size();index++){theTiles=theTiles+"Tile: "+(index+1)+"\n"+myTiles.get(index)+"\n";}
		for(int index=0; index<gameBoard.size();index++){gameBoardTiles=gameBoardTiles+"Tile: "+(index+1)+"\n"+gameBoard.get(index)+"\n";}
		return "My Tiles: \n"+theTiles+"\n Gameboard Tiles \n"+gameBoardTiles;
	} // end method toString
} // end class TileGame
