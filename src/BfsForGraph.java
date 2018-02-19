import  java.util.*;
public class BfsForGraph {
	public static void main(String []args) {
		Scanner input=new Scanner(System.in);
		
		Graph g = new Graph(4);
 
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);
        g.Bfs(2);
		
		
	}
}
class Graph{
	int V;
	LinkedList<Integer> adj[];
	Graph(int v){
		V=v;
		adj=new LinkedList[v];
		for(int i=0;i<v;i++)
			adj[i]=new LinkedList<Integer>();
	
	}
	void addEdge(int a,int b) {
		adj[a].add(b);
	}
	void Bfs(int s) {
		boolean visited[]=new boolean[V];
		LinkedList<Integer> queue=new LinkedList<>();
		visited[s]=true;
		queue.add(s);
	
		while(!queue.isEmpty()) {
			 s=queue.poll();
			System.out.print(s+" ");
			Iterator<Integer> a = adj[s].listIterator();
			while(a.hasNext()) {
				int k=a.next();
				if(visited[k]!=true) {
					visited[k]=true;
					queue.add(k);
					
				}
				
				
			}
			
			
			
		}
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}