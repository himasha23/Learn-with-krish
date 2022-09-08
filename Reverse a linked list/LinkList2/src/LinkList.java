
public class LinkList {

	
	private Link first;
	
	public LinkList() {
		
		first = null;
	}
	
	public boolean isEmpty() {
		
		return (first == null);
	}
	
	public void insertfirst(int id)
	{
		Link newLink = new Link(id);
		
		newLink.next = first;
		
		first = newLink;
	}
	
	public void revrse() {
		
		Link current = first;
		Link temp = null;
		Link newnext = null;
		
		while (current != null) {
			
			newnext = current.next;
			
			current.next = temp;
			
			temp = current;
			
			current = newnext;
			
			
			
			
			
		}
		
		first = temp;
		
	}
	
	public void displayList() {
		
		Link current = first;
		
		while(current != null) {
			
			current.displayLink();
			current = current.next;
		}
		
		System.out.println("");
	}
	
	
	
}
