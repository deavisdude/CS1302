/*
 * Davis Odom
 * 8/25/15
 * Tests the Queue
 */
public class Program {
	public static void main(String[] args){
		Queue queue = new Queue();
		for(int i=0; i<20; i++){
			queue.enqueue(i+1);
			System.out.println(queue);
		}
		for(int i=0; i<20; i++){
			queue.dequeue();
			System.out.println(queue);
		}
	}
}
