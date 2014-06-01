package Chapter2;

import java.util.ArrayList;
/**
 * 
 * @author hankwk
 * This class takes in a linked list and will remove duplicate values in the list (int)
 * This is from exercise 2.1
 */
public class RemoveDups {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Link link2 = new Link(1);
		link2.changeData(4);
		link2.addBehind(5);
		link2.next.addBehind(5);
		link2.next.next.addBehind(4);
		link2.next.next.next.addBehind(7);
		link2.next.next.next.next.addBehind(7);
		
		removeDuplicates(link2);
		
		while(link2 != null){
			System.out.println(link2.data);
			link2 = link2.next;
		}

	}
	
	public static void removeDuplicates(Link list){
		ArrayList<Integer> al = new ArrayList<Integer>();
		Link i = list;
		boolean deleteFlag = false;
		
		//first case
		al.add(i.data);
		
		while(i.next != null){
			deleteFlag = false;
			for(int j = 0; j < al.size(); j++){
				if(al.get(j) == i.next.data && i.next.next != null){
					i.next = i.next.next; //remove node
					deleteFlag = true;
				}
				else if(al.get(j) == i.next.data && i.next.next == null){
					i.next = null;
				}
			}
			if(i.next != null && deleteFlag == false){
				al.add(i.next.data);
				i = i.next;
			}
		}
		System.out.println(al);
	}

}
