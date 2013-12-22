
public class ConnectedComponents {

	private boolean []visited;
	private int [] comp_id;
	private int components;
	private int vertices;
	
	/*Detecting components using DFS*/
	ConnectedComponents(Graph g){
		vertices=g.V();
		comp_id= new int[vertices];
		visited= new boolean[vertices];
		for(int i=0;i< vertices ; i++){
			if(visited[i]==false){
				dfs(g, i);
				components=components+1;
			}
			
		}
	}
	
	public void dfs(Graph g, int s){
		for(int u: g.adj(s)){
			if(visited[u]==false){
				visited[u]=true;
				dfs(g,u);
				comp_id[u]=components;
			}
		}
	}
	
	public int comp(int node){
		return comp_id[node];
	}
}
