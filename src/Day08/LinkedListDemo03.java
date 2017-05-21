package Day08;

import java.util.LinkedList;

/*
 * LinkedList多有操作手额外的方法
 * addFirst
 * addLast
 * 
 * getFirst
 * getLast
 */
public class LinkedListDemo03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> linked=new LinkedList<String>();
		linked.add("one");
		
		//addFirst & addLast
		linked.addFirst("twoone");
		linked.addLast("threeone");

		//getFirst & getLast
		String first=linked.getFirst();
		System.out.println(first);
		String last=linked.getLast();
		System.out.println(last);
		
		for (String string : linked) {
			System.out.print(string+" ");
			
		}
		System.out.println();
		//removeFirst & remmoveLast
		String removeFirst=linked.removeFirst();
	System.out.println("删除了"+removeFirst);
	
	String removeLast=linked.removeLast();
	System.out.println("删除了"+removeLast);
	
	}

}


























































