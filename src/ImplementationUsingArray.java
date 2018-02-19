import java.util.Scanner;
public class ImplementationUsingArray {
	public static void main(String []args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter size of the queue");
		Queue q=new Queue(input.nextInt());
		while(true) {
		System.out.println("\nEnter your choice\n"
				+ "1. Enqueue\n"
				+ "2. Dequeue\n");
		
		switch(input.nextInt()) {
		
		case 1:
			System.out.println("Enter element to be inserted");
			q.Enqueue(input.nextInt());
			break;
		case 2:
			q.Dequeue();
			break;
		}
		System.out.println("Elements of the queue are:");
		q.print();
	
		}
	}	
}
	

class Queue{
	int front=-1;
	int rear=-1;
	int size;
	int[] queue;
	public Queue(int s){
		size=s;
		queue=new int[size];
	}
	void Enqueue(int data) {
		if(rear>=size-1)
			System.out.println("queue is full. Element can't be inserted");
		else if(front==-1) {
			queue[++front]=data;
			rear++;
			
		}
		else {
			queue[++rear]=data;
		}
		
	}
	int Dequeue() {
		if(rear==front || front==-1) {
			System.out.println("queue is empty. No element to dequeue");
			return -1;
		}
		else{
			return queue[front++];
		}
		
	}
	void print() {
		
		if(front==-1 || front==-1 && rear==-1) {
			System.out.println("Queue is empty");
		}else {
			for(int i=front;i<=rear;i++)
				System.out.print(queue[i]+" ");
			
		}
	}
	
}
	
	