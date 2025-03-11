
public class Queue<T> {
	private Stack<T> stA;
	private Stack<T> staB;
	
	public Queue() {
		stA = new Stack<T>();
		staB = new Stack<T>();
		
	}
	
	public T dequeue() {
		if (stA.size() != 0) {
			while (stA.size() > 0) {
				staB.push(stA.pop());
			}
			
			T val = staB.pop();
			
			while (staB.size() > 0) {
				stA.push(staB.pop());
			}
			 return val;
		} else {
			return null;
		}
		
	}
	
	public void enqueue( T el) {
		stA.push(el);
	}
	
	public String toString() {
		if (stA.size() == 0) {
			return "[]";
		} else {
			String all = "";
			while (stA.size() != 0) {
				staB.push(stA.pop());
			}
			
			while (staB.size() != 0) {
				all += staB.peek() + " ";
				stA.push(staB.pop());
			}
			return "[" + all.substring(0, all.length() -2) + "]";
		}
	}
	
	public int size() {
		return stA.size();
	}
	
	public boolean smpty() {
		boolean temp = false;
		if (stA.size() != 0 ) {
			temp = false;
		} else {
			temp = true;
		}
		return temp;
	}
	
}
