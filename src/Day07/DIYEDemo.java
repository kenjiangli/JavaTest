package Day07;

import java.util.ArrayList;

/*
 * ������,�����Ĳ������Ϳ��Ը�����ʱ������һ��
 * ��ʽ
 * 
 * class ����<E>{
 * ���η� ����ֵ ������(E ������)
 * }
 * 
 * �ڶ������ʱ��ȷ������ʹ��E����
 * 
 * 	Person<String> p = new Person<String>();
	p.say("Hello");
 * 
 * 
	public class ArrayList<E> {

		public boolean add(E e) {
        	
    	}
	}
 */

public class DIYEDemo {
public static void main(String[] args) {
	
	ArrayList<String> array = new ArrayList<String>();
//	array.add(e) String e
	
	ArrayList<Integer> array2 = new ArrayList<Integer>();
//	array2.add(e) Integer e
	
	//�Լ�ȷ������
	Person4<String> p=new Person4<String>();
	p.work(" and work");
	
	Person4<Integer> p2=new Person4<Integer>();
	p2.work(123);
}
}

//�������ʱ��֪������ʱʲô����
class Person4<E>{
	public void work(E e){
		System.out.println("work"+e);
	}
}








































