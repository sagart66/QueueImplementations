import java.util.Scanner;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Queue;
public class GenerateBinaryNumbers {
	public static void main(String []args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter value of k");
		Queue<String> q=new LinkedList();
		int k=input.nextInt();
		q.add("1");
		while(k-->0) {
			String s1=q.remove();
			System.out.println(s1);
			q.add(s1+"0");
			q.add(s1+"1");
			
			
		}
			
		
	}

}
