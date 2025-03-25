
public class Tile {
	
	private int row, col;
	private char type;
	//In a coordinate based map, rol, col are x and y respectively
	//thus, Tile takes the place of a coordinate point in map
	//However, what's the role of Tile in coordinate based?
	//It seems that the Tile is the map element represented in 0 col
	//
	
	public Tile (int row, int col, char type) {
		super(); //allows the method to refer to the parent class
		this.row = row;
		this.col = col;
		this.type = type;
	}
	
	public int getRow() {
		return row;
	}
	public void setRow(int row) {
		this.row = row;
	}
	public int getCol() {
		return col;
	}
	public void setCol(int col) {
		this.col = col;
	}
	public char getType() {
		return type;
	}
	public void setType(char type) {
		this.type = type;
	}
	
	public void hasType(int Row, int Col) {
//		if ( || type != '.') {
//			
//		}
	}
	
}
