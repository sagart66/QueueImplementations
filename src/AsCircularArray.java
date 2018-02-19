import java.util.Scanner;
public class AsCircularArray {
	public static void main(String []args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter size of queue");
		int n=input.nextInt();
		String msg="Please enter following input:\n\n Enter 1 to insert element in a queue \n Enter 2 to Delete element from a queue \n and Enter -1 to exit the program\n";

		queue1 first = new queue1(n);
		int a=0;
		int item;

        do{
            System.out.println(msg);
			a=input.nextInt();
			switch(a)
			{
			case 1:
				System.out.println("Inserting element in queue, Please enter a number");
				item= input.nextInt();
				first.enqueue(item);
				first.print();
				break;
			case 2:

				int l=first.dequeue();
                if(l!=Integer.MIN_VALUE) {
                    System.out.println("Deleting an element from a queue:- ");
                    System.out.println(l);
                }
				else
				    System.out.println("No element to delete");

				break;
			case -1:
				System.out.println("Program has ended");
				break;
			default:
				System.out.println("Enter valid input");
				break;
			
			}
		}while(a!=-1);
    }
}


class queue1{
	 int queue[];
	 int front=0;
	 int rear=0;
	  int size;
	 queue1(int n){
	     size=n+1;
	     queue=new int[size];
     }

	int dequeue() {
		if(front==rear) {
			System.out.println("Queue is empty");
			return Integer.MIN_VALUE;
		}
		else {
			front = (front+1)%10;
			return queue[front];
		}
		
	}
	void enqueue(int a) {
		int l=rear;
	     rear=(rear+1)%size;
		if(front==rear) {
            rear = l;
            System.out.println("Queue is full");
        }
		else {
			queue[rear]=a;
		}
	}
	void print() {
		System.out.println("Elements of the queue are");
		if(front==rear) {
			
			System.out.println("Queue is Empty");
		
		}
		else {
			
			for(int i=(front+1);i<=rear;i++) {
				System.out.println(queue[i]+" ");
			}
		}
		
		
	}
	
	
	
	
}