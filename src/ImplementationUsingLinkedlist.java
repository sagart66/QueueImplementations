import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
public class ImplementationUsingLinkedlist {
	public static void main(String []args) {
	Scanner input=new Scanner(System.in);
	Linkedlist l=new Linkedlist();
	while(true) {
		System.out.println("\nEnter your choice\n"
				+ "1. Enqueue\n"
				+ "2. Dequeue\n");
		
		switch(input.nextInt()) {
		
		case 1:
			System.out.println("Enter element to be inserted");
			l.add(input.nextInt());
			break;
		case 2:
			if(l.isEmpty())
				System.out.println("Queue is Empty");
			else
				l.removeHead();
			break;
		}
		
		if(l.isEmpty())
			System.out.println("Queue is Empty");
		else {
			System.out.println("Elements of the queue are:");
			l.print();
		}

		}
}

}
class Node{
	int data;
	Node next;
	public Node() {
		data=0;
		next=null;
	}
	public Node(int d) {
		data=d;
		next=null;
		
	}
	public Node(int d,Node n) {
		data=d;
		next=n;
	
	}	
}







class Linkedlist{
	Node head=null;
	void add(int d) {
		if(head==null) {
			head=new Node(d);
		}else {
			Node temp=head;
			while(temp.next!=null) {
				temp=temp.next;
						
			}
			temp.next=new Node(d);

		}
	}
	int removeHead() {
		if(head==null) {
			return -1;
		}
		else {
			int temp=head.data;
			head=head.next;
			return temp;
		}
	}
	boolean isEmpty() {
		if(head==null)
			return true;
		return false;
	}	
	void print() {
		if(head==null) {
			System.out.println("Queue is empty");
		}
		else {
			Node temp=head;
			while(temp!=null) {
				System.out.println(temp.data);
				temp=temp.next;
				
			}			
			
			
			
		}
		
		
	}
}
























