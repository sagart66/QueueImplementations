import java.util.*;
import java.util.Queue;
public class TreeTraversal {
	public static void main(String []args) {
		Tree t=new Tree();
		t.root=new myNode(5);
		t.root.left=new myNode(4);
		t.root.right=new myNode(6);
		t.root.left.left=new myNode(2);
		t.root.left.right=new myNode(5);
		t.root.right.left=new myNode(7);
		t.root.right.right=new myNode(8);
		t.Lot();
		
		
		
	}
	
	
}

class myNode{
	int data;
	myNode left;
	myNode right;
	myNode(int t){
		data=t;
		left=null;
		right=null;
	}
	
	
}
class Tree{
	myNode root;
	
	void Lot() {

	Queue<myNode> queue=new LinkedList();
	queue.add(root);
	while(!queue.isEmpty()) {
		myNode d=queue.poll();
		System.out.print(d.data+" ");
		if(d.left!=null)
			queue.add(d.left);
		if(d.right!=null)
			queue.add(d.right);
	}
	}
	
	
	
	
	}
	
	
	
	
	
	
