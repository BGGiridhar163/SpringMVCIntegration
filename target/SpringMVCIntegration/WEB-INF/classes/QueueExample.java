import java.util.Queue;

public class QueueExample {
	public static void main(String[]args) {
		Queue<String>q1 = new Queue<String>();
		q1.add("welcome");
		q1.add("to");
		q1.add("java");
		q1.add("class");
		System.out.println(q1);
		q1.poll();
		System.out.println(q1);
		
	}

}
