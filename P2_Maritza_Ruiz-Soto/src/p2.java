import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.MatchResult;

public class p2 {
	private static Queue<Tile> queue;
	private static Tile wolverine;
	private static Stack<Tile> visited;
	private static Character[][] maze;
	private static Tile diamond;
	private static int Mrow;
	private static int Mcol;
	private static int totalRows;
	private static int totalCols;
	//private static int totalRooms;
	
	private static Tile north;
	private static Tile south;
	private static Tile east;
	private static Tile west;

	public static void main(String[] args) {
		
		queue = new Queue<Tile>();
		
		visited = new Stack<Tile>();
		
		//maze = new String[][];	//used to help me determine the char at index since the 
		maze = new Character[totalRows][totalCols];										//read map method justs prints it
		System.out.println();
		readMap("2_FromSpecs");
		System.out.println(totalRows + " " + totalCols + " ");
		System.out.println();
		
		//Tile flop = visited.pop();
		
		visited.push(wolverine);
		queue.enqueue(wolverine);
		
		Mrow = wolverine.getRow();
		Mcol = wolverine.getCol();
		
		north = new Tile(wolverine.getRow()-1, wolverine.getCol(), maze[Mrow-1][Mcol]);
		south = new Tile(wolverine.getRow()+1, wolverine.getCol(), maze[Mrow+1][Mcol]);
		east = new Tile(wolverine.getRow(), wolverine.getCol()+1, maze[Mrow][Mcol+1]);
		west = new Tile(wolverine.getRow(), wolverine.getCol()-1, maze[Mrow][Mcol-1]);
		
		queuePath();
		
		//System.out.println(wolverine.getType()+" "+ wolverine.getRow() +" "+ wolverine.getCol());
		
		//we want to peek the top of the stack,
		//use peek
		//for use use dequeue
		//
		
		if (impossible() == true) {
			System.out.println("The Wolverine Store is closed.");
		}
		
	}
	
	public static void readMap(String filename) {
		
		try {
			File file = new File("TestCases/"+filename);
			
			Scanner scan = new Scanner(file); //taking in the file input
			
			int numRows = scan.nextInt();
			totalRows = numRows;
			int numCols = scan.nextInt();
			totalCols = numCols;
			int numRooms = scan.nextInt();
			
			int rowIndex = 0;
			//MatchResult s = scan.match();
			System.out.println();
			//coord.add(numRows + " " + numCols + " " + numRooms);
			
			int counter = 0;
			
			//process the map
			while (scan.hasNextLine()) {
				String row = scan.nextLine();
				
				System.out.println(row);
				//For each row, if it has char, I want it to add to the arraylist
				if (row.length() > 0) {
					for (int i = 0; i < numCols && i < row.length(); i++) {
						char el = row.charAt(i); //returns the char
						//counter++;
						maze[totalRows][i] = el;
						Tile obj = new Tile(rowIndex, i, el); //row, col, type
						//How can I implement the obj into a 2D array?
//						maze.enqueue(obj);
						
						if (el == 'W') {
							wolverine = obj;
							
							
							//coord2[0][0] = wolverine.toString() + " ";
							//this is how I locate the wolverine (?)
						} else if (el == '$') {
							diamond = obj;
						}
						queue.enqueue(obj);
						
					}
					
				}
				rowIndex++;
				queue.enqueue(null);
				
			}
			
			
			System.out.println();
			
			System.out.println(maze);
			//coord2 = new String[counter][4]; 
			//this will be used to display the visited coordinates
			System.out.println(visited);
			//coord2[0][coord2[0].length] = []{0, 0, 0, numRows}];
			
		} catch (FileNotFoundException e) {
			System.out.println(e);
		}
		
	}

	
	/*
	 * Used to determine the N S E W, maybe
	 */
	public static void queuePath() {
		
		while (queue.dequeue().getType() != '$') {
			
			
			if (north.getRow() < maze.length && north.getRow() >= 0) {
				queue.enqueue(north);
				if (north.getType() != '@' && north.getType() != '+') {
					wolverine = north;
					north.setType('+');
				}
			}
			
			if (south.getRow() < maze.length && south.getRow() >= 0) {
				queue.enqueue(south);
				if (south.getType() != '@') {
					wolverine = south;
					south.setType('+');
				}
			}
			
			if (east.getRow() < maze.length && east.getRow() >= 0) {
				queue.enqueue(east);
				if (east.getType() != '@' && east.getType() != '+') {
					wolverine = east;
					east.setType('+');
				}
			}
			
			if (west.getCol() < maze[totalCols].length && west.getCol() >= 0) {
				queue.enqueue(west);
				if (west.getType() != '@' && west.getType() != '+') {
					wolverine = west;
					west.setType('+');
				}
			}
			
//			for (int i = 0; i < queue.size(); i++) {
//				
//				//Tile cha = new Tile(wolverine.getRow()+1, wolverine.getCol(), north.getType());
//				
//				
//				
//			}
			
			
		}
			
			
		
	}
	
	/*
	 * Used to determine if it is possible to solve
	 */
	public static boolean impossible() {
		boolean temp = false;
		
		if (north.getType() == '@' && south.getType()=='@'&&east.getType()=='@'&&west.getType()=='@') {
			temp = true;
		}
		
		
		return temp;
	}

	
	
	/*
	 * Used to add each character to the in the coordinate based map
	 * Might not use this. Copied over the readMap so that i can manipulate better
	 */
//	public static void addCoord(String filename, ArrayList<String> arr) {
//
//		try {
//			File file = new File("TestCases/"+filename);
//			Scanner scan = new Scanner(file); //taking in the file input
//			
//			int numRows = scan.nextInt();
//			int numCols = scan.nextInt();
//			int numRooms = scan.nextInt();
//			
//			int rowIndex = 0; //Basically what col in the row.
//			//MatchResult s = scan.match();
//			System.out.println();
//			//Tile n = new Tile(numRows, numCols, el);
//			//coord.enqueue(n);
//			
//			int counter = 0;
//			
//			//process the map
//			while (scan.hasNextLine()) {
//				String row = scan.nextLine();
//				
//				/*
//				 * for sum reason, this line is printing my maze
//				 * One row at a time
//				 * 
//				 */
//				
//				//For each row, if it has char, I want it to add to the 
//				if (row.length() > 0) {
//					for (int i = 0; i < numCols && i < row.length(); i++) {
//						char el = row.charAt(i); //returns the char
//						counter++;
//						Tile obj = new Tile(rowIndex, i, el); //row, col, type
//						//How can I implement the obj into a 2D array?
//						maze.enqueue(obj);
//						
//						//coord.add(counter, el + " " + i + " " + rowIndex + " " + numRooms);
//						System.out.println(coord);
//						//coord.
//					}
//					
//					for (int i = 0; i < numCols && i < row.length(); i++) {
//						coord2 = new String[counter][4];
//						
//						char el = row.charAt(i);
//						Tile obj = new Tile(rowIndex, i, el);
//						
//						coord2[row.length()][0] = el + " ";
//						
//					}
//					
//				}
//				rowIndex++;
//				
//			}
//			
//			System.out.println();
//			
//			System.out.println(coord);
//			//System.out.println(numRows + " " + numCols + " " + numRooms);
//			//coord2 = new String[counter][4];
//			//coord2[0][coord2[0].length] = []{0, 0, 0, numRows}];
//			scan.close();
//			
//		} catch (FileNotFoundException e) {
//			System.out.println(e);
//		}
//		
//		
//	}
	
	
	
}
