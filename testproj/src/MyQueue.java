import java.util.Queue;
public class MyQueue {
	private Queue<Integer> queue;
	private int size, capacity;
	
	public MyQueue(){
		capacity = 8;
	}
	
	public void enqueue(int v){
		queue.add(v);
	}
}
