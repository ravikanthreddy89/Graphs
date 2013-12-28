import java.util.LinkedList;


public class MyBFS {

	private boolean [] visited;
	private int [] parent;
	private int source;
	
	MyBFS(Graph g, int s){
		visited=new boolean[g.V()];
		parent= new int[g.V()];
		source=s;
		bfs(g, source);		
	}
	
	MyBFS(Digraph g, int s){
		visited=new boolean[g.V()];
		parent= new int[g.V()];
		source=s;
		bfs(g, source);		
	}
	
	
	public void bfs(Graph g, int s){
		LinkedList<Integer> q= new LinkedList<Integer>();
		q.addLast(s);
		
		while(!q.isEmpty()){
			//int node=q.getFirst();
			int node=q.removeFirst();
			for(int nbrs : g.adj(node)){
				if(visited[nbrs]==false){
					q.addLast(nbrs);
					parent[nbrs]=node;
				}
			}
			visited[node]=true;
		}
	}
	
	
	public void bfs(Digraph g, int s){
		LinkedList<Integer> q= new LinkedList<Integer>();
		q.addLast(s);
		
		while(!q.isEmpty()){
			//int node=q.getFirst();
			int node=q.removeFirst();
			for(int nbrs : g.adj(node)){
				if(visited[nbrs]==false){
					q.addLast(nbrs);
					parent[nbrs]=node;
				}
			}
			visited[node]=true;
		}
	}
	
	public int parent(int dest){
		return parent[dest];
	}
	public boolean hasPathTo(int dest){
		return visited[dest];
	}
}
