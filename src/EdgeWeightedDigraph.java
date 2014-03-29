
public class EdgeWeightedDigraph {

	private int V;
	private int E;
	private Bag<DirectedEdge> [] adj;
	
	EdgeWeightedDigraph(int V){
		this.V=V;
		adj= (Bag<DirectedEdge>[])new Bag[this.V];
		for(int i=0;i<this.V;i++) adj[i]=new Bag<DirectedEdge>();
	}
	
	public void addEdge(int u, int v, double weight) throws RuntimeException{
		if(weight<=0) throw new RuntimeException("Negative and zero weights are not accepted");
		DirectedEdge e= new DirectedEdge(u,v,weight);
		adj[u].add(e);
		this.E=this.E+1;
	}
	
	/*return out edges*/
	public Iterable<DirectedEdge> adj(int u){
		return (Iterable<DirectedEdge>)this.adj[u];
	}
	
	public int V(){
		return this.V;
	}
	
	public int E(){
		return this.E;
	}
	
}
