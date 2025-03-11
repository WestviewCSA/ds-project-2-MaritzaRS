import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class p2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * From David
		 * 
		 */
		readMap("1_FromSpecs");
		
		/*
		 * Need to make a Queue
		 * 
		 */
		
		/*
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
//		
//		
//		if (maze.contains(Wolverine)) {
//			
//		}
//		File file = new File(System.in);
//		
//		Scanner scanner = new Scanner(file);
		
		
	}
	
	public static void readMap(String filename) {
		
		try {
			File file = new File(filename);
			Scanner scan = new Scanner(file);
			
			int numRows = scan.nextInt();
			int numCols = scan.nextInt();
			int numRooms = scan.nextInt();
			
			int rowIndex = 0;
			
			//proccess the map
			while (scan.hasNextLine()) {
				String row = scan.nextLine();
				
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
		
		
	}
	
	/*
	 * Used to add to the coordinate list when Wol moved
	 */
	public void move(ArrayList sun) {
		
		
	}

}
