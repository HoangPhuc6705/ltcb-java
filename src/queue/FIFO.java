package queue;

import java.util.LinkedList;
import java.util.Queue;

public class FIFO {
	public static void main(String[] args) {
		Queue<Integer> q = new LinkedList<>();
		q.add(2);
		q.add(1);
		q.add(3);
		
		System.out.println(q.peek());
		System.out.println(q.poll());
		System.out.println(q.peek());
	}
}
