

public class Link {
	
	int iData;
	Link next;
	
	
	public Link(int id) {
		
		iData = id;
		next = null;
	}
	
	public void displayLink() {
		
		System.out.println(iData);
	}

}
