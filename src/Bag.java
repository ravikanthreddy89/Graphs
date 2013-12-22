import java.util.Iterator;
import java.util.NoSuchElementException;


public class Bag<Item> implements Iterable<Item> {

	class Node<Item>{
		Item item;
		Node next;
	}
	
	private Node first=null;
	
	public void add(Item item){
		Node oldfirst = first;
		first= new Node();
		first.item =item;
		first.next=oldfirst;
	}
	
	public Iterator<Item> iterator(){
		return  new ListIterator(first);
	}
	
	private class ListIterator<Item> implements Iterator<Item> {
		
		private Node<Item> current=null;
		
		ListIterator(Node start){
			current=start;
			
		}
				
		public boolean hasNext(){
			return current!=null;
		}
		
		public void remove(){
			throw new UnsupportedOperationException();
		}

		@Override
		public Item next() {
			// TODO Auto-generated method stub
			if(hasNext()==false){throw new NoSuchElementException();}
			Item ret=current.item;
			current=current.next;
			return ret;
		}
	}
}
