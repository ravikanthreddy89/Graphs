
public class BFSTest {

	public static void main(String [] args){
		Graph g= new Graph(10);
		g.addEdge(1,2);
		g.addEdge(1,3);
		g.addEdge(3,4);
		g.addEdge(3,5);
		g.addEdge(5,6);
		g.addEdge(5,7);
		
		g.addEdge(8, 9);
		BFSPaths bfs= new BFSPaths(g, 1);
		System.out.println("break");
		MyBFS mbfs= new MyBFS(g, 1);
		
		
		System.out.println("Path between nodes 1 and 7 "+ mbfs.hasPathTo(7));
		System.out.println("Path between nodes 1 and 7 "+ mbfs.hasPathTo(6));
		System.out.println("Path between nodes 1 and 7 "+ mbfs.hasPathTo(5));
		System.out.println("Path between nodes 1 and 7 "+ mbfs.hasPathTo(4));
		System.out.println("Path between nodes 1 and 7 "+ mbfs.hasPathTo(3));
		System.out.println("Path between nodes 1 and 7 "+ mbfs.hasPathTo(2));
		System.out.println("Path between nodes 1 and 7 "+ mbfs.hasPathTo(8));
		System.out.println("Path between nodes 1 and 7 "+ mbfs.hasPathTo(9));
	}
}
