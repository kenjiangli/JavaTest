package Day07;

import java.util.ArrayList;
import java.util.Iterator;

/*
 * ������Ǵ�һ������ʹ�ñ���
 * �洢������ݾ�ʹ������/ArrayList
 * 
 * �����ArrayList������:
 * 		����:���ȹ̶�,��Ĭ��ֵ,������,���ԷŻ�����������Ҳ���Է�������������
 * 
 * 		ArrayList:�����ǿɱ��,û��Ĭ��ֵ,������,ֻ�ܷ�������������
 */
public class ArrayListAndInteratorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> array=new ArrayList<String>();
		array.add("abc");
		array.add("efg");
		array.add("hik");
		for (int i = 0; i < array.size(); i++) {
			System.out.println(array.get(i));
		}
		System.out.println("--------------------------------");
		/*
		 * ��ȡ�������Ĳ���
		 * 1.��ȡ������
		 * 2.ѭ���ж���ûԪ��
		 * 3.��Ԫ�ػ�ȡԪ��
		 */
		Iterator<String> itr=array.iterator();
		//hasNext();�������Ԫ�ؿ��Ե������򷵻� true��
		//�����仰˵����� next ������Ԫ�ض������׳��쳣���򷵻� true���� 
		while(itr.hasNext()){
			String str=itr.next();//���ص�������һ��Ԫ��
			System.out.println(str);
		}
		
	}

}

















































