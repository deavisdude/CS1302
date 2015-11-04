/*
 * Davis Odom
 * 8/25/15
 * A Queue
 */
public class Queue {
	private int[] elements;
	private int size = 0;
	
	//Creates a new Queue with 8 slots
	public Queue(){
		elements = new int[8];
	}
	
	//adds an int to the queue and doubles the size if needed
	public void enqueue(int v){
		if(!(size >= elements.length)){
			elements[size] = v;
			size++;
		}else{
			int[] newElements = new int[elements.length*2];
			for(int i=0; i<elements.length; i++){
				newElements[i] = elements[i];
			}
			
			elements = newElements;
			
			elements[size] = v;
			size++;
		}
	}
	
	//removes the next item from the queue
	public int dequeue(){
		int bottom = elements[0];
		for(int i=0; i<size; i++){
			elements[i] = elements[i+1];
		}
		size--;
		return bottom;
	}
	
	//returns true if the queue is empty and false if not
	public boolean empty(){
		if(size == 0)
			return false;
		else return true;
	}
	
	//returns the size of the queue
	public int getSize(){
		return size;
	}
	
	//Spits out a string displaying all the elements in the queue
	public String toString(){
		String s = "Queue: {";
		for(int i=0; i<elements.length; i++){
			s = s.concat(" "+elements[i]+",");
		}
		s = s.concat("}");
		return s;
	}
}
