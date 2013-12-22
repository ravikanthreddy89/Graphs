import java.util.Stack;


public class DepthFirstSearch {

	private int s;// source node
	private int vertices;
	private boolean[] marked ; 
	private int[] parent; 
	
	DepthFirstSearch(Graph g, int s){
		this.s=s;
		vertices=g.V();
		marked= new boolean[vertices];
		parent= new int[vertices];
		dfs(g,s);
	}
	private void dfs(Graph g, int v){
		marked[v]=true;
		for(int u : g.adj(v)){
			if(marked[u]==false){
				parent[u]=v;
				dfs(g,u);
			}
		}
	}
	
	public boolean hasPathTo(int v){return marked[v];}
	
	public Iterable<Integer> path(int v){
		Stack<Integer> path=new Stack<Integer>();
		path.push(v);
		while(v!=s){
			path.push(parent[v]);
			v=parent[v];
		}
		
		return path;
	}
}
