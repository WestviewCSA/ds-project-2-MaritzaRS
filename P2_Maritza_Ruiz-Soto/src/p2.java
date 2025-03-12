import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.MatchResult;

public class p2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * From David
		 * 
		 */
		readMap("4_Personal");
		
		/*
		 * Need to make a Queue
		 * 
		 */
		
//		ArrayList<Stack> maze = new ArrayList<Stack>();
//		ArrayList<Queue> coord = new ArrayList<Queue>();
//		
//		String Wolverine = "W";
//		
//		Scanner scan = new Scanner(System.in);
//		
//		scan.findWithinHorizon(Wolverine, 0);
		
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
				if (row.length()>0) {
					for (int i = 0; i < numCols && i < row.length(); i++) {
						char el = row.charAt(i);
						Tile obj = new Tile(rowIndex, i , el);
						
					}
				}
				
				
			}
		
			
		} catch (FileNotFoundException e) {
			System.out.println(e);
		}
		
		/*
		 * Deliminator: 
		 * Can allow the system to ignore certain input
		 * Thinking about use for ignoring the text in 1_FromSpecs
		 * or other mazes using out of allowed bounds
		 * 
		 * try:
		 * can be used to try a segment of code,
		 * as long as able to be run, and "catch" and exception 
		 * if otherwise
		 * 
		 * char:
		 * data type to store a single character, in quote marks
		 * 
		 */
		
		
	}
	
	/*
	 * Used to add to the coordinate list when Wol moved
	 */
	public void move(ArrayList sun) {
		
		
	}

}
