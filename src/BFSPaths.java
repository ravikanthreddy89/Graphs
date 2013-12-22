import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;


public class BFSPaths {

	private int[] edgeTo;
	private boolean[] marked;
	private int[] distTo;
	private int source;
	private int vertices;
	
	BFSPaths(Graph g, int s){
		source=s;
		vertices=g.V();
		marked=new boolean[vertices];// no initialization required, default value is false
		edgeTo= new int[vertices];
		distTo= new int[vertices];
		for(int i=0;i<vertices;i++) distTo[i]=Integer.MAX_VALUE;
		bfs(g, s);
	}
	
	private void bfs(Graph g, int s){
		Queue<Integer> q= new ArrayDeque<Integer>();// Queue is an interface not a class.
		((ArrayDeque<Integer>) q).addLast(s);
		marked[s]=true;
		distTo[s]=0;
		
		while(q.isEmpty()==false){
			int v=q.poll();
			
			for(int u: g.adj(v)){
				if(marked[u]==false){
					((ArrayDeque<Integer>) q).addLast(u);
				}
				distTo[u]=distTo[v]+1;
				edgeTo[u]=v;
				marked[u]=true;
			}
		}
	}
	
	
	public boolean hasPathTo(int dest){return marked[dest];}
	
	public Iterable<Integer> path(int dest){
		Stack<Integer> path= new Stack<Integer>();
		int x;
		for(x=dest ; distTo[x]!=0; x=edgeTo[x]){
			path.push(x);
		}
		path.push(x);
		return path;
	}

	
}
