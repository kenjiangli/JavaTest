package Day09;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;


/*
 * Map�ӿ�
 * 
 * Set<T> keySet():��Map�����е�����key�ŵ�һ��set������
 * Collections<T> values():�����е�ֵ�ŵ�һ��������
 */
public class KeySetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<String, String> hm = new HashMap<String, String>();
		hm.put("������", "Baby");
		hm.put("�˳�", "��ٳ");
		hm.put("�", "������");
		hm.put("л����", "����");
		
		//keySet() �õ����еļ�
		Set<String> keys=hm.keySet();
		
		//������,�õ���
		Iterator<String> itr = keys.iterator();
		while (itr.hasNext()) {
			String key = (String) itr.next();
			System.out.println(key);
		}
		System.out.println("------------------------");
		
		//�õ�ֵ
		Collection<String> values = hm.values();
		for (String string : values) {
			System.out.println(string);
		}
	}

}


























































































