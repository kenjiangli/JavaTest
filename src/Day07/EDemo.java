package Day07;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class EDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//û�з���,��Ҫ�Լ���ǿ��ת��,���з���
		ArrayList array=new ArrayList();
		array.add("abc");
		array.add("efg");
		array.add("hik");
		for (int i = 0; i < array.size(); i++) {
			String s=(String) array.get(i);
			System.out.println(s);
		}
		
		//�з���,����������͵�Ԫ�ز��ܴ洢��ȥ,�ڻ�ȡԪ�ص�ʱ��,����Ҫǿ��ת��
		ArrayList<String> array2=new ArrayList<String>();
		array2.add("abc");
		array2.add("efg");
		array2.add("hik");
		for (int i = 0; i < array2.size(); i++) {
			String s= array2.get(i);
			System.out.println(s);
		}
	}

}












































