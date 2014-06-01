package Chapter2;

public class Link {

	Link next;
	int data;
	
	public Link(){
		this.next = null;
		this.data = 0;
	}
	
	//1 arg constructor for data to add to this link
	public Link(int number){
		this.data = number;
	}
	
	//2 arg constructor for number for this link and new Link
	public Link(Link newLink, int number){
		this.next = newLink;
		this.data = number;
	}
	
	public void addBehind(int data){
		this.next = new Link();
		this.next.data = data;
	}
	
	public void changeData(int data){
		this.data = data;
	}
	
	public void appendToTail(int data){
		Link end = new Link(data);
		Link i = this;
		
		while(i.next != null){
			i = i.next;
		}
		i.next = end;
	}
	
	public Link delete(Link head, int data){
		Link i = head;
		//if data to be deleted is on head, move head to next node
		if(i.data == data){
			head = i.next;
			return head;
		}
		//go through rest of nodes to find data to be deleted
		//we have to work two nodes ahead because we only have head to work with
		while(i.next != null){
			if(i.next.data == data){
				i.next = i.next.next;
				return head; //head did not change in this situation
			}
			i = i.next; //go to next link and look
		}
		return head;  //return original head, no data to be deleted found
	}

}
