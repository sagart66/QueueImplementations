import java.util.*;
import java.util.Queue;
public class SlidingWindowMaxOfAllSubarraysOfSizeK {
	public static void main(String []args) {
		LinkedList<Integer> q=new LinkedList<>();
		LinkedList<Integer> l=new LinkedList();
		Scanner input=new Scanner(System.in);
		System.out.println("Enter value of k");
		int k=input.nextInt();
		System.out.println("Enter number of elements in array");
		int n=input.nextInt();
		
		for(int i=0;i<k;i++) {
			q.add(input.nextInt());
		}
		l.add(Collections.max(q));
		for(int i=k;i<n;i++) {
			q.removeFirst();
			q.addLast(input.nextInt());
			l.add(Collections.max(q));
		}
		System.out.println("Elements of the array "+q);
		System.out.println("Corresponding Max values "+l);
		
		
		
		
	}
}
