import java.util.ArrayList;

public class Stack<J> {
	
	private ArrayList<J> data;
	
	public Stack() {
		
		//initialize the instance vars!
		data = new ArrayList<J>();
	}
	
	public void push(J el) {
		data.add(el); //added to the end of the list/ "TOP"
	}
	
	public J pop() {
		if (data.size() > 0) {
			return data.remove(data.size()-1);
		} else {
			return null;
		}
		
	}
	
	public J peek() {
		
 		if (data.size() != 0) {
			return data.get(data.size()-1);
		} else {
			return null;
		}
	}
	
	public boolean empty() {
		boolean temp = false;
		if (data.size() != 0) {
			temp = false;
		} else {
			temp = true;
		}
		return temp;
	}
	
	public int size() {
		return data.size();
	}
	//uses the arraylist to string to return strong
	//representation of data
 
}
