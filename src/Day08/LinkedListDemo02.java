package Day08;

import java.util.LinkedList;

/*
 * �������Ƚ��ȳ������ݽṹ
 * FIFO(first in first out)
 */
public class LinkedListDemo02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//����ģ��
		LinkedList<Integer> linked=new LinkedList<Integer>();
		
		//��ջ
		linked.offer(1);
		linked.offer(2);
		linked.offer(3);
		
		//��ջ
		System.out.println(linked.poll());//1
		System.out.println(linked.poll());//2
		System.out.println(linked.poll());//3
	}

}





















































