import javax.swing.text.html.HTMLDocument.Iterator;


public class DFSTest {

	public static void main(String []args){
		Graph g= new Graph(8);
		
		g.addEdge(0,1);
		g.addEdge(1,2);
		g.addEdge(1,3);
		g.addEdge(2,4);
		g.addEdge(3,4);
		g.addEdge(5,6);
		g.addEdge(5,7);
		
		DepthFirstSearch dfs= new DepthFirstSearch(g, 1);
		
		DFSIterative dfs_i = new DFSIterative(g, 1);
		
		System.out.println("Path between 1 and 4 :"+ dfs.hasPathTo(4));
		System.out.println("Path between 1 and 2 :"+ dfs.hasPathTo(2));
		System.out.println("Path between 1 and 3 :"+ dfs.hasPathTo(3));
		System.out.println("Path between 1 and 0 :"+ dfs.hasPathTo(0));
		System.out.println("Path between node 1 and node 4 ");
		for(int v : dfs.path(4)){
	    	if(v==1) System.out.print(v);
	    	else System.out.print(v+"-");
	    }
		
		System.out.println("Path between 1 and 4 :"+ dfs_i.hasPathTo(4));
		System.out.println("Path between 1 and 2 :"+ dfs_i.hasPathTo(2));
		System.out.println("Path between 1 and 3 :"+ dfs_i.hasPathTo(3));
		System.out.println("Path between 1 and 0 :"+ dfs_i.hasPathTo(0));
		
		System.out.println("Path between node 1 and node 4 ");
		for(int v : dfs_i.path(4)){
	    	if(v==1) System.out.print(v);
	    	else System.out.print(v+"-");
	    }
	    
	}
}
