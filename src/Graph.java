import java.util.Iterator;


public class Graph {

	private int V=0;
	private int E=0;
	private Bag<Integer> [] adj=null;
	
	/*Constructor*/
	Graph(int V){
		this.V=V;
		adj=(Bag<Integer> []) new Bag[V];
		for(int i=0;i<V;i++) adj[i]=new Bag<Integer>();
	}
	
	public void addEdge(int u, int v){
		adj[u].add(v);
		adj[v].add(u);
		E=E+1;
	}
	
	public int V(){return V;}
	public int E(){return E;}
	
	public Iterable<Integer> adj(int u){
		return adj[u];
	}
	
	public String toString(){
		StringBuilder s= new StringBuilder();
		String newline= System.getProperty("line.separator");
		
		for(int i=0;i<V;i++){
			s.append(i+":");
			for(int w : adj[i]){
				s.append(w+" ");
			}
			s.append(newline);
		}
		return s.toString();
	}
}
