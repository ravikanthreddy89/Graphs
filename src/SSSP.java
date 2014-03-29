import java.util.Map;
import java.util.TreeMap;


public class SSSP {

	/*Need to maintain shortest path and cost for
	 * reaching that node*/
	private double [] dist;//maintains cost info
	private int [] parent;//maintains parent info
	private int source;
	
	SSSP(EdgeWeightedDigraph ewd, int source){
		this.dist=new double[ewd.V()];
		this.parent=new int[ewd.V()];
		this.source=source;
		for(int i=0;i<ewd.V();i++) {
			dist[i]=Integer.MAX_VALUE;
			parent[i]=-1;
		}
		dist[this.source]=0;
		djikstra(ewd, source);		
	}
	
	
	public double dist(int point){
		return dist[point];
	}
	
	public int parent(int point){
		return parent[point];
	}
	
	private void djikstra(EdgeWeightedDigraph edg, int s){
		/*Minimum priority queue to maintain next edge*/
		TreeMap<Double, Integer> minPQ= new TreeMap<Double,Integer>();
		minPQ.put(dist[s], s);
		
		while(!minPQ.isEmpty()){
			double wt=minPQ.firstKey();
			int w=minPQ.get(wt);
			System.out.println("relaxing edges from "+w);
			for(DirectedEdge ed : edg.adj(w)){
				System.out.println("break");
				int dest=ed.dest();
				//System.out.println("Destination "+dest);
				if(dist[dest]> dist[w]+ed.weight()){
					System.out.println("Updating distance of "+dest);
					dist[dest]=dist[w]+ed.weight();
					parent[dest]=w;
					minPQ.put(dist[dest], dest);
				}
			}
			minPQ.remove(wt);//we have found the shorted path
			                 // so remove him from the set
		}
		
	}
}
