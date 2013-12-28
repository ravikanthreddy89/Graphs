import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;


public class KruskalMST {

	private final double weight;
	private ArrayList<Edge> mst= new ArrayList<Edge>();
	

	KruskalMST(EdgeWeightedGraph G){
		MinPQ<Edge> pq = new MinPQ<Edge>();// we dont need to pass a new comparator let it 
		                                                  // follow the natural ordering of edges
		double temp_wt=0;
		for(Edge e : G.edges()) pq.insert(e);
		UF set= new UF(G.V());
		while(!pq.isEmpty() && mst.size()<(G.V()-1)){
			Edge e= pq.delMin();
			int v=e.either();
			int w=e.other(v);
			if(!set.connected(v,w)){
				set.union(v, w);
				mst.add(e);
				temp_wt+=e.weight();
			}
		}
		this.weight=temp_wt;
	}
	
	
	public Iterable<Edge> edges(){
		return mst;
	}
	
	public double weight(){
		return this.weight;
	}
}
