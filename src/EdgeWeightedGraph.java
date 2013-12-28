import java.util.ArrayList;


public class EdgeWeightedGraph {

	private int V;
	private int E;
	private Bag<Edge>[] adj;
	private ArrayList<Edge> edges;
	
	EdgeWeightedGraph(int V){
		this.V=V;
		adj=(Bag<Edge>[])new Bag[V];
		for(int i=0;i<this.V;i++) adj[i]= new Bag<Edge>();
		edges= new ArrayList<Edge>();
	}
	
	public void addEdge(Edge e){
		if(e==null) System.out.println("Null pointer");
		int v=e.either();
		int w=e.other(v);
		adj[v].add(e);
		adj[w].add(e);
		edges.add(e);
	}
	
	public Iterable<Edge> adj(int v){
		return adj[v];
	}
	
	public Iterable<Edge> edges(){
		return edges;
	}
	
	public int V(){
		return this.V;
	}
	
	public int E(){
		return this.E;
	}
}
