package om.collection.queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueDemo {
	public static void main(String[] args) {
		
		Queue<Integer> queue = new PriorityQueue<Integer>();
		queue.add(76);
		queue.add(43);
		queue.add(23);
		queue.add(98);
		queue.add(12);
		queue.add(77);
		
		System.out.println(queue);
		
		while (!queue.isEmpty()) {
			System.out.println(queue.poll());
		}
	}
}
