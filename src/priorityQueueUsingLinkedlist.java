import java.util.Scanner;
public class priorityQueueUsingLinkedlist {
	public static void main(String []args) {
		Scanner input=new Scanner(System.in);
		
	Linkedlist1 l=new Linkedlist1();
		
		while(true) {
			System.out.println("Enter your choice:\n 1. Insert \n 2. GetHighest Priority. \n 3. Remove");
			switch(input.nextInt()) {
			case 1:
				System.out.println("Enter Element and its priority");
				l.add(input.nextInt(), input.nextInt());
				break;
			case 2:
				System.out.println("Highest priority element is: "+l.getHighestPriority());
				break;
			case 3:
				l.remove();
				break;
			}
			System.out.println("Content of queue: ");
			l.print();
			System.out.println("");
			
			
		}
		
	}
}

class Node1{
	int data;
	int priority;
	Node1 next;
	public Node1() {
		data=0;
		priority=0;
		next=null;
	}
	public Node1(int d,int p) {
		data=d;
		priority=p;
		next=null;
		
	}
	public Node1(int d,int p,Node1 n) {
		data=d;
		priority=p;
		next=n;
	
	}	
}




class Linkedlist1{
	Node1 head=null;
	void add(int d,int p) {
		if(head==null) {
			head=new Node1(d,p);
		}else {
			Node1 temp=head;
			while(temp.next!=null) {
				temp=temp.next;
						
			}
			temp.next=new Node1(d,p);

		}
	}
	
	int getHighestPriority() {
		Node1 temp=head;
		int max=temp.priority;
		int val=temp.data;
		while(temp!=null) {
			if(temp.priority<max) {
				max=temp.priority;
				val=temp.data;
			}
			temp=temp.next;
		}
		
		return val;
		

	}
	
	Node1 getHighestPriority1() {
		Node1 temp=head;
		Node1 temp2=head;
		int max=temp.priority;
		while(temp.next!=null) {
			
			if(temp.next.priority<max) {
				max=temp.priority;
				temp2=temp;
			}
			temp=temp.next;
			//System.out.println("temp2"+temp2.data);
		}
		return temp2;
		
	}
	
	
	
	
	
	int remove() {
		int temp;
		if(head.next==null) {
			 temp=head.data;
			head=null;
			
		}
		else if(getHighestPriority1()==head) {
			if(head.priority<head.next.priority) {
			temp=head.data;
			head=head.next;
			}else {
				temp=head.next.data;
				head.next=null;
			}
		}
		
		
		else {
			 temp=getHighestPriority1().next.data;
			 getHighestPriority1().next=getHighestPriority1().next.next;
		}
		return temp;
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
			Node1 temp=head;
			while(temp!=null) {
				System.out.print(temp.data+"("+temp.priority+")"+" ");
				temp=temp.next;
				
			}			
			
			
			
		}
		
		
	}
}









