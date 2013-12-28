
public class MyDFS {

	private boolean []visited;
	private int [] parent;
	private int source;
	private int vertices;
	
	MyDFS(Graph g, int s){
		vertices=g.V();
		source=s;
		visited=new boolean[vertices];
		parent = new int[vertices];
		dfs(g,s);
	}
	
	public void dfs(Graph g, int s){
		
		visited[s]=true;
		for(int u : g.adj(s)){
		  if(visited[u]==false){
			visited[u]=true;
			parent[u]=s;
			dfs(g,u);
	   	  }
		}
	}
	
	public boolean hasPathTo(int dest){
		return visited[dest];
	}
	
	public int parent(int dest){
		return parent[dest];
	}
}
