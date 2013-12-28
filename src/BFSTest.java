
public class BFSTest {

	public static void main(String [] args){
		Graph g= new Graph(10);
		
		Digraph dg= new Digraph(10);
		
		/*Undirected graph testing*/
		g.addEdge(1,2);
		g.addEdge(1,3);
		g.addEdge(3,4);
		g.addEdge(3,5);
		g.addEdge(5,6);
		g.addEdge(5,7);
		g.addEdge(8, 9);
		BFSPaths bfs= new BFSPaths(g, 1);
		System.out.println("break");
		MyBFS mbfs= new MyBFS(g, 7);
		
		
		System.out.println("Path between nodes 1 and 7 "+ mbfs.hasPathTo(7));
		System.out.println("Path between nodes 1 and 6 "+ mbfs.hasPathTo(6));
		System.out.println("Path between nodes 1 and 5 "+ mbfs.hasPathTo(5));
		System.out.println("Path between nodes 1 and 4 "+ mbfs.hasPathTo(4));
		System.out.println("Path between nodes 1 and 3 "+ mbfs.hasPathTo(3));
		System.out.println("Path between nodes 1 and 2 "+ mbfs.hasPathTo(2));
		System.out.println("Path between nodes 1 and 8 "+ mbfs.hasPathTo(8));
		System.out.println("Path between nodes 1 and 9 "+ mbfs.hasPathTo(9));
		
		
		/*Digraph testing*/
		dg.addEdge(1,2);
		dg.addEdge(1,3);
		dg.addEdge(3,4);
		dg.addEdge(3,5);
		dg.addEdge(5,6);
		dg.addEdge(5,7);
		dg.addEdge(8,9);	
		
		MyBFS d_mbfs= new MyBFS(dg, 1);
		//MyBFS d_mbfs= new MyBFS(dg, 7);
				
		System.out.println("Path between nodes 1 and 7 "+ d_mbfs.hasPathTo(7));
		System.out.println("Path between nodes 1 and 6 "+ d_mbfs.hasPathTo(6));
		System.out.println("Path between nodes 1 and 5 "+ d_mbfs.hasPathTo(5));
		System.out.println("Path between nodes 1 and 4 "+ d_mbfs.hasPathTo(4));
		System.out.println("Path between nodes 1 and 3 "+ d_mbfs.hasPathTo(3));
		System.out.println("Path between nodes 1 and 2 "+ d_mbfs.hasPathTo(2));
		System.out.println("Path between nodes 1 and 8 "+ d_mbfs.hasPathTo(8));
		System.out.println("Path between nodes 1 and 9 "+ d_mbfs.hasPathTo(9));
				
		}
}
