
public class DirectedEdge implements Comparable<DirectedEdge> {

	private int source;
	private int dest;
	private double weight;
	
	DirectedEdge(int u, int v, double weight){
		this.source=u;
		this.dest=v;
		this.weight=weight;
	}
	
	public int source(){
		return this.source;
	}
	
	public int dest(){
		return this.dest;
	}
	
	public double weight(){
		return this.weight;
	}
	
	/*We need to add Comparator for priority queue to order the edges*/
	@Override
	public int compareTo(DirectedEdge other){
		if(this.weight==other.weight) return 0;
		if(this.weight<other.weight) return -1;
		return 1;
	}
}
