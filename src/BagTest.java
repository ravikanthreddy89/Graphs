import java.util.Iterator;


public class BagTest {

	public static void main(String [] args){
		Bag<Integer> bg= new Bag<Integer>();
		
		for(int i=0;i<5;i++){
			bg.add(i);
		}
		Iterator<Integer> it=bg.iterator();
		
		for(int i=0;it.hasNext();){
			System.out.println(it.next());
		}
	}
}
