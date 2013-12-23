import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;


public class Digraph {

	private int V=0;
	private int E=0;
	private Bag<Integer> []adj=null;
	
	Digraph(int v){
		this.V=v;
		adj=(Bag<Integer> []) new Bag[V];
		for(int i=0;i<V;i++) adj[i]= new Bag<Integer>();
	}
	
	Digraph(File in){
		try {
			if(!in.exists()){
				throw new RuntimeException("File is empty");
			}
			Scanner input = new Scanner(in);
			this.V=Integer.parseInt(input.nextLine());
			this.E=Integer.parseInt(input.nextLine());
			
			while(input.hasNext()){
				String [] numbers=input.nextLine().split(" ");
				int u=Integer.parseInt(numbers[0]);
				int v=Integer.parseInt(numbers[1]);
				addEdge(u, v);
			}
			
			
		} catch (FileNotFoundException e) {
			System.out.println("File not found");
		}
		 catch (IOException ioe) {
				System.out.println("IO Exception");
			}
		catch (Exception e){
			System.out.println("Exception in file processing");
		}
	}
	
	public void addEdge(int u, int v){
		adj[u].add(v);
	}
	
	public int V(){return V;}
	public int E(){return E;}
	
	
	public Iterable<Integer> adj(int u){
		return adj[u];
	}
	
	
	
}


