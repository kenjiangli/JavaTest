package Day08;

import java.util.LinkedList;

//LinkedList�Ļ���ʹ��
public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//����Linkedist
		LinkedList<String> linked=new LinkedList<String>();
		
		//���Ԫ��
		linked.add("super");
		linked.add("spider");
		linked.add("fire");
		
		//��ָ��λ�����Ԫ��
		linked.add(2, "crow");
		
		//�޸�Ԫ��
		linked.set(0, "superman");
		
		for (String string : linked) {
			System.out.println(string);
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
