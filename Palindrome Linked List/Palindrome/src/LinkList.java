import java.util.Stack;

import org.w3c.dom.Node;

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
	
	public void displayList() {
		
		Link current = first;
		
		while(current != null) {
			
			current.displayLink();
			current = current.next;
		}
		
		System.out.println("");
	}

	public boolean ispal() {
		// TODO Auto-generated method stub
		
		Link temp = first; 
		Stack<Integer> st = new Stack<>();
		
		while (temp != null) 
		{
			
			st.push(temp.iData);	//push to stack	
			temp = temp.next;		//move to next node
		}
		
		temp = first;  //reset 
		
		while (temp != null) {	//	pop from the stack
			
			if(temp.iData != st.pop()) { //comparison
				
				System.out.println("not palindrome");
				return false; 
			}
			
			temp = temp.next;  //move to next node
		}
		
		System.out.println("palindrome");
		return true;
		
	}
	
	
	
}
