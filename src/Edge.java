
public class Edge implements Comparable<Edge> {

	private final int  v,w;
	private final double weight ;
	
	Edge(int v, int w, double weight){
		this.v=v;
		this.w=w;
		this.weight=weight;
	}
	
	public int either(){
		return v;
	}
	
	public int other(int v){
		if(v==v) return w;
		else return v;
	}

	public double weight(){
		return this.weight;
	}
	@Override
	public int compareTo(Edge that) {
		// TODO Auto-generated method stub
		if(this.weight == that.weight) return 0;
		else if(this.weight > that.weight) return 1;
		else return -1;
	}
}
