import java.util.Scanner;
import java.util.Stack;
import java.util.Iterator;
public class QueueUsingStacks {
	public static void main(String []args) {
		Scanner input=new Scanner(System.in);
		Stack<Integer>s1=new Stack<>();
		Stack<Integer>s2=new Stack<>();
		String msg="Enter your choice\n1. Enqueue \n2. Dequeue";
		while(true) {
			System.out.println(msg);
			switch(input.nextInt()) {
			case 1:
				System.out.println("Enter element to be inserted");
				s1.push(input.nextInt());
				break;
			case 2:
				
				
				
				while(!s1.empty()) {
					s2.push(s1.pop());
				}
				
				if(s2.isEmpty())
					System.out.println("Queue is empty");
				else System.out.println("poped element"+s2.pop());
				
				break;
			}
			/*
			System.out.println("Content of the queue");
			if(s1.isEmpty() && s2.isEmpty())
				System.out.println("Queue is empty");
			else {
			Iterator w=s1.iterator();
			while(w.hasNext())
				System.out.print(w.next()+" ");
			Iterator w1=s2.iterator();
			while(w1.hasNext())
				System.out.print(w1.next()+" ");
			System.out.println();
			}
			*/
			
			
		}
		
		
		
		
		
	}
}
