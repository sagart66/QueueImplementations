import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.Comparator;
import java.util.Iterator;
public class PriorityQueueUsingCollection {
	public static void main(String []args) {
		Scanner input=new Scanner(System.in);
		
		PriorityQueue<Integer>q=new PriorityQueue<Integer>();

		while(true) {
			System.out.println("Enter your choice:\n 1. PriorityQueue with element itself as priority (Here element with least value has higher priority)\n 2. Priority Queue with seperate values ");
			switch(input.nextInt()) {
			case 1:
			
			while(true) {
				System.out.println("Enter your choice:\n 1. Insert \n 2. GetHighest Priority. \n 3. Remove");
				switch(input.nextInt()) {
				case 1:
					System.out.println("Enter Element and its priority");
					q.add(input.nextInt());
			
					break;
				case 2:
					System.out.println("Highest priority element is: "+q.peek());
					break;
				case 3:
				q.poll() ;
					break;
				}
			System.out.println("Content of queue: "+q);
			
			System.out.println("");;
		}
		case 2:
			PriorityQueue<cust>q1=new PriorityQueue(10,idComparator);
			while(true) {
			System.out.println("Enter your choice:\n 1. Insert \n 2. GetHighest Priority. \n 3. Remove");
			switch(input.nextInt()) {
			case 1:
				cust c1=new cust(input.nextInt(),input.nextInt());
				q1.add(c1);
				break;
			case 2:
				System.out.println("Highest Element is: "+q1.peek().data);
			break;
			case 3:
				q1.poll();
				break;
			}
			System.out.println("Content of Queue:");
			Iterator<cust> i = q1.iterator();
			if(q1.isEmpty())
				System.out.println("Queue is empty");
			while(i.hasNext()) {
				cust a=i.next();
				System.out.print(a.data+"("+a.priority+")");
			
				
			}
			System.out.println();
			}
			}
		}
	}
		public static Comparator<cust> idComparator = new Comparator<cust>(){
			@Override
			
			public int compare(cust c1, cust c2) {
	            return (int) (c1.priority-c2.priority);
	        }
		};

}

class cust{
	int data;
	int priority;
	cust(int a,int b) {
		data=a;
		priority=b;
	}
}