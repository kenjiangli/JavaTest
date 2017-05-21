package Day08;

import java.util.LinkedList;

/*
 * 队列是先进先出的数据结构
 * FIFO(first in first out)
 */
public class LinkedListDemo02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//代码模拟
		LinkedList<Integer> linked=new LinkedList<Integer>();
		
		//进栈
		linked.offer(1);
		linked.offer(2);
		linked.offer(3);
		
		//出栈
		System.out.println(linked.poll());//1
		System.out.println(linked.poll());//2
		System.out.println(linked.poll());//3
	}

}





















































