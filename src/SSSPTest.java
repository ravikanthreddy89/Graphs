import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class SSSPTest {

	public static void main(String [] args){
		EdgeWeightedDigraph edg;
		SSSP sp=null;
		try {
			Scanner input=new Scanner(new File(args[0]));
			System.out.println("File name :"+args[0]);
			int verticies=Integer.parseInt(input.nextLine());
			input.nextLine();
			edg=new EdgeWeightedDigraph(verticies);
			while(input.hasNext()){
				String []ip=input.nextLine().split(" ");
				edg.addEdge(Integer.parseInt(ip[0]), Integer.parseInt(ip[1]), Double.parseDouble(ip[2]));
				sp= new SSSP(edg,0);
			}
				System.out.println("parent :"+sp.parent(6));
				System.out.println("Dist :"+sp.dist(6));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
