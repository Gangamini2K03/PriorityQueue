	
import java.util.PriorityQueue;

class Main{
	public static void main(String args[]){
		PriorityQueue<Integer> pQueue = new PriorityQueue<Integer>();
		
		pQueue.addLast(20);
		pQueue.addFirst(10);
		pQueue.add(15);
		
		System.out.println(pQueue);
		int size = pQueue.size();
		System.out.println(size);
		
		for(int i= 0; i<size; i++){
		
		System.out.println(pQueue.poll());
	
		}
		
	}
}
		
		
		