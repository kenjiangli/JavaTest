package Day08;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayAndLinkedDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//method01();
		method02();
	}
	
	/*
	 * ʹ�õ�������ṹ.Node<E>����Ϊ����Ľڵ�
	 * LinkedList�ص�:��ѯ��,��ɾ��
	 * 
	 */
private static void method02() {
		// TODO Auto-generated method stub
		LinkedList<Integer> arr=new LinkedList<Integer>();
		arr.add(11);
		arr.add(22);
		arr.add(33);
		arr.add(44);
		arr.add(55);
		arr.add(55);
		arr.add(55);
		arr.add(55);
		arr.add(55);
		arr.add(55);
		arr.add(55);
		
		arr.remove(1);
	for (Integer integer : arr) {
		System.out.println(integer+" ");
	}
}
	/*
 * ArrayList�ײ�ʹ�õ�������ṹ
 * Ԫ���Ǵ洢��Object[] elementData;
 * �������ĳ�����10��
 * ��Ԫ�ز���,�Ὣ��������,������ԭ����1.5��
 * ����ʹ�õ��ǿ�������
 *   ArrayList���ص�:��ѯ��,��ɾ��.
 * �ο�ʾ��ͼ
 */
	private static void method01() {
		// TODO Auto-generated method stub
		ArrayList<Integer> arr=new ArrayList<Integer>();
		arr.add(11);
		arr.add(22);
		arr.add(33);
		arr.add(44);
		arr.add(55);
		arr.add(55);
		arr.add(55);
		arr.add(55);
		arr.add(55);
		arr.add(55);
		arr.add(55);
		
		arr.remove(2);
		
		for (Integer integer : arr) {
			System.out.print(integer+" ");
		}
	}

}














































