import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;
public class ImplememtationUsingCollections {
	public static void main(String []args) {
		Scanner input=new Scanner(System.in);
		Queue<Integer> q=new LinkedList();
		while(true) {
			System.out.println("\nEnter your choice\n"
					+ "1. Enqueue\n"
					+ "2. Dequeue\n");
			
			switch(input.nextInt()) {
			
			case 1:
				System.out.println("Enter element to be inserted");
				q.add(input.nextInt());
				break;
			case 2:
				if(q.isEmpty())
					System.out.println("Queue is Empty");
				else
					q.remove();
				break;
			}
			
			if(q.isEmpty())
				System.out.println("Queue is Empty");
			else
				System.out.println("Elements of the queue are:"+q);
		
	
			}
		}
}
	
	