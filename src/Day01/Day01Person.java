package Day01;

import java.util.ArrayList;

/*
 * �����������������
 * 
 * ��������,û�����ֵĶ���,ֻ��Ҫ=�ұߵ�
 * ��������ȱ��:
 * 			ֻ�ܵ���һ�η���
 * ��������ĺô�
 * 			�����һ��
 *
 *��������ĺô�
 *			�����ظ����÷���
 *���������ȱ��:	
 *			���볤һ��
 *	
 *���������ʹ�ó���
 *	1.ָ�����һ�η���
 *	2.��Ϊ�����Ĳ�������
 */

public class Day01Person {

	public Day01Person() {
		// TODO Auto-generated constructor stub
		
		//����Ĵ���
		Person1 p1=new Person1("Steven",23);
		p1.eat();
		p1.sayHell();		
		
		//��������,û�����ֵĶ���,ֻ��Ҫ=�ұߵ�
		new Person1().eat();
		new Person1().sayHell();
		
		ArrayList<Person1> arr=new ArrayList<Person1>();
		Person1 p2=new Person1("cook",40);
		arr.add(p2);
		
		//ʹ����������
		arr.add(new Person1("groot", 19));
		
	}

}
