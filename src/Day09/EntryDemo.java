package Day09;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

/*
 * Map�ӿ���
 * Map.Entry<K,V>;ӳ����(��-ֵ��)
 * 
 * set<Map,Entry<K,Y> entrySet() ���ش�ӳ���а�����ӳ���ϵ��set��ͼ
 * set<Map.Entry<K,V>>;set<E>:Map.Entry<K,V>
 * set<String>
 * ��ʾset�����д�ŵ���Map.Entry<K,V>����
 */
public class EntryDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, String> hm = new HashMap<String, String>();
		hm.put("������", "Baby");
		hm.put("�˳�", "��ٳ");
		hm.put("�", "������");
		hm.put("л����", "����");
		
		
		//Set�д�Ŷ��Entry<String,String>
		Set<Entry<String, String>> entrySet = hm.entrySet();
		
		//��ȡÿ��Entry,Entrt���м���ֵ
		for (Entry<String, String> entry : entrySet) {
			String key=entry.getKey();
			String value=entry.getValue();
			System.out.println(key+" "+value);
		}
	}

}























































































