import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.MatchResult;

public class p2 {
	private static Queue<Tile> maze;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * From David
		 * 
		 */
		
		
		maze = new Queue<Tile>();
		
		//ArrayList<Queue> coord = new ArrayList<Queue>();
		
		readMap("2_FromSpecs");
		System.out.println(maze);
		
//		ArrayList<Stack> maze = new ArrayList<Stack>();
//		ArrayList<Queue> coord = new ArrayList<Queue>();
//		
//		String Wolverine = "W";
//		
//		Scanner scan = new Scanner(System.in);
//		
//		scan.findWithinHorizon(Wolverine, 0);
		
		if (impossible() == true) {
			System.out.println("The Wolverine Store is closed.");
		}
		
	}
	
	public static void readMap(String filename) {
		
		try {
			File file = new File("TestCases/"+filename);
			Scanner scan = new Scanner(file);
			
			int numRows = scan.nextInt();
			int numCols = scan.nextInt();
			int numRooms = scan.nextInt();
			
			int rowIndex = 0;
			//MatchResult s = scan.match();
			
			//process the map
			while (scan.hasNextLine()) {
				String row = scan.nextLine();
				
				System.out.println(row);
				//For each row, if it has char, I want it to add to the arraylist
				if (row.length() > 0) {
					for (int i = 0; i < numCols && i < row.length(); i++) {
						char el = row.charAt(i); //returns the char
						Tile obj = new Tile(rowIndex, i, el); //row, col, type
						//Do we want to manipulate the object here?
						//How can I implement the obj into a 2D array?
						maze.enqueue(obj);
						
					}
					
				}
				rowIndex++;
			}
			
			
		} catch (FileNotFoundException e) {
			System.out.println(e);
		}
		
	}
	
	/*
	 * Used to add to the coordinate list when Wol moved
	 */
	public void move(ArrayList sun) {
		
		
	}
	
	
	/*
	 * Used to determine if it is possible to solve
	 */
	public static boolean impossible() {
		boolean temp = false;
		
		return temp;
	}

}
