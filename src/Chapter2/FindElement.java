package Chapter2;

public class FindElement {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Link link2 = new Link(1);
		link2.addBehind(5);
		link2.next.addBehind(5);
		link2.next.next.addBehind(4);
		link2.next.next.next.addBehind(7);
		link2.next.next.next.next.addBehind(7);
		
		link2 = find(link2, 6);
		
		System.out.println(link2.data);

	}
	
	public static Link find(Link list, int elementNumber){
		Link i = list;
		int counter = 1;
		while(i.next != null){
			if(counter == elementNumber){
				return i;
			}
			counter++;
			i = i.next;
		}
		//last case
		if(counter == elementNumber){
			return i;
		}
		//if element number is bigger or smaller than list
		Link none = new Link(0);
		return none;
	}

}
