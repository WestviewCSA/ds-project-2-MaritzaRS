import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.MatchResult;

public class p2 {
	private static Queue<Tile> maze;
	private static Tile wolverine;
	private static ArrayList<String> coord;
	private static String[][] coord2;
	private static Tile diamond;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * From David
		 */
		maze = new Queue<Tile>();
		
		coord = new ArrayList<String>();
		
		readMap("2_FromSpecs");
		//System.out.println(maze);
		
//		scan.findWithinHorizon(Wolverine, 0);
		
		if (impossible() == true) {
			System.out.println("The Wolverine Store is closed.");
		}
		
	}
	
	public static void readMap(String filename) {
		
		try {
			File file = new File("TestCases/"+filename);
			
			Scanner scan = new Scanner(file); //taking in the file input
			
			int numRows = scan.nextInt();
			int numCols = scan.nextInt();
			int numRooms = scan.nextInt();
			
			int rowIndex = 0;
			//MatchResult s = scan.match();
			System.out.println();
			//coord.add(numRows + " " + numCols + " " + numRooms);
			//System.out.println(coord);
			
			int counter = 0;
			
			//process the map
			while (scan.hasNextLine()) {
				String row = scan.nextLine();
				
				System.out.println(row);
				/*
				 * for sum reason, this line is printing my maze
				 * One row at a time
				 * 
				 */
				
				//For each row, if it has char, I want it to add to the arraylist
				if (row.length() > 0) {
					for (int i = 0; i < numCols && i < row.length(); i++) {
						char el = row.charAt(i); //returns the char
						//counter++;
						Tile obj = new Tile(rowIndex, i, el); //row, col, type
						//How can I implement the obj into a 2D array?
						maze.enqueue(obj);
						
						if (el == 'W') {
							wolverine = obj;
							//this is how I locate the wolverine (?)
						} else if (el == '$') {
							diamond = obj;
						}
//						
//						coord.add(el + " " + i + " " + rowIndex + " " + numRooms);
//						//System.out.println(coord);
//						coord.clear();
					}
					
				}
				rowIndex++;
				
			}
			
			System.out.println();
			System.out.println(numRows + " " + numCols + " " + numRooms);
			coord2 = new String[counter][4];
			//coord2[0][coord2[0].length] = []{0, 0, 0, numRows}];
			
		} catch (FileNotFoundException e) {
			System.out.println(e);
		}
		
	}
	
	/*
	 * Used to add each character to the in the coordinate based map
	 * Might not use this. Copied over the readMap so that i can manipulate better
	 */
	public static void addCoord(String filename, ArrayList<String> arr) {

		try {
			File file = new File("TestCases/"+filename);
			Scanner scan = new Scanner(file); //taking in the file input
			
			int numRows = scan.nextInt();
			int numCols = scan.nextInt();
			int numRooms = scan.nextInt();
			
			int rowIndex = 0; //Basically what col in the row.
			//MatchResult s = scan.match();
			System.out.println();
			coord.add(numRows + " " + numCols + " " + numRooms);
			
			int counter = 0;
			
			//process the map
			while (scan.hasNextLine()) {
				String row = scan.nextLine();
				
				/*
				 * for sum reason, this line is printing my maze
				 * One row at a time
				 * 
				 */
				
				//For each row, if it has char, I want it to add to the 
				if (row.length() > 0) {
					for (int i = 0; i < numCols && i < row.length(); i++) {
						char el = row.charAt(i); //returns the char
						counter++;
						Tile obj = new Tile(rowIndex, i, el); //row, col, type
						//How can I implement the obj into a 2D array?
						maze.enqueue(obj);
						
						coord.add(counter, el + " " + i + " " + rowIndex + " " + numRooms);
						System.out.println(coord);
						//coord.
					}
					
					for (int i = 0; i < numCols && i < row.length(); i++) {
						coord2 = new String[counter][4];
						
						char el = row.charAt(i);
						Tile obj = new Tile(rowIndex, i, el);
						
						coord2[row.length()][0] = el + " ";
						
					}
					
				}
				rowIndex++;
				
			}
			
			System.out.println();
			
			System.out.println(coord);
			//System.out.println(numRows + " " + numCols + " " + numRooms);
			//coord2 = new String[counter][4];
			//coord2[0][coord2[0].length] = []{0, 0, 0, numRows}];
			scan.close();
			
		} catch (FileNotFoundException e) {
			System.out.println(e);
		}
		
		
	}
	
	/*
	 * Used to add to the coordinate list when Wol moved
	 */
	public void move(Queue<Tile> help) {
		
		
	}
	
	
	/*
	 * Used to determine if it is possible to solve
	 */
	public static boolean impossible() {
		boolean temp = false;
		
		
		
		
		return temp;
	}

}
