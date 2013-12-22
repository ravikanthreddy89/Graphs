import java.util.Stack;


public class DFSIterative {

	private final int source;
	private int vertices;
	private boolean [] marked;
	private int[] edgeTo;
	
	
	DFSIterative(Graph g, int source){
		this.source=source;
		vertices=g.V();
		marked= new boolean[vertices];
		edgeTo= new int[vertices];
		dfs(g,source);
	}
	
	public void dfs(Graph g, int source){
		Stack<Integer> stack= new Stack<Integer>();
		stack.push(source);
		marked[source]=true;
		
		while(!stack.isEmpty()){
			int u=stack.peek();
			for(int v : g.adj(u)){
				if(marked[v]==false){
					marked[v]=true;
					edgeTo[v]=u;
					System.out.println("pushing : "+v);
					stack.push(v);
					u=v;
				}
			}
		    
			System.out.println("done with "+stack.pop());
		}
		
		
	}
	
	public boolean hasPathTo(int s){return marked[s];}
	
	public Iterable<Integer> path(int d){
		Stack<Integer> path= new Stack<Integer>();
		path.push(d);
		
		while(d!=source){
			d=edgeTo[d];
			path.push(d);
		}
		
		return path;
	}
}
