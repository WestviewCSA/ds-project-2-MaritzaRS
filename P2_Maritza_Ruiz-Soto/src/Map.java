
public class Map {
	
	private Tile[][] map;
	
	private int row;
	private int col;
	private char room;
	//given a 2D array of Tiles
	
	//so far, we have an array of the Tile objects
	
	/*
	 * I need to put the Tile elements into this array
	 * 1) initiate the array
	 * 2) getter and setter for array
	 * 3) Need a system to access from outside
	 * 
	 * The point of the coordinate system is likely to 
	 * assume what moves have been made, similar to chess
	 * It essentially creates another (?) array with each row 
	 * being a move. 
	 * Map char  Row  Col  Maze "Level"
	 * 
	 */
	public void setTile(int rowNum, int column, char roomNum) {
		
		room = roomNum;
	}
	
	public Map(int rowNum, int colNum, char newChar) {
		row = rowNum;
		col = colNum;
		room = newChar;
		
		map = new Tile[row][col];
	}
	
	
	
	
}
