package Day09;

import java.util.HashMap;
import java.util.Set;


//Map�ı���,һ���õ���key��ֵvalue

public class KeysAndVaueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, String> hm = new HashMap<String, String>();
		hm.put("������", "Baby");
		hm.put("�˳�", "��ٳ");
		hm.put("�", "������");
		hm.put("л����", "����");
		
		// ͨ������ֵ
		/*		String v1 = hm.get("������");
				System.out.println(v1);
				
				String v2 = hm.get("�˳�");
				System.out.println(v2);
				
				String v3 = hm.get("�");
				System.out.println(v3);
				
				String v4 = hm.get("л����");
				System.out.println(v4);*/
				
				// ��������ͨ��������,��������,1��Ҫ�Լ�д��.�п���д��2.������кö�
				// �����鷳.keySet���Խ����еļ�����һ��set������.
				// 1.ͨ��keySet�����õ����еļ�
				// 2.�������set����,���Ե����õ�ÿ����
				// 3.ʹ��get����.�����Ҷ�Ӧ��ֵ
	
		
		//ͨ��keySet�õ����еļ�
		Set<String> key = hm.keySet();
		
		//�������set����,���Ե����õ�ÿ����
		for (String string : key) {
			
			//ʹ��get����,�����ҵ���Ӧ��ֵ
			String value=hm.get(string);
			System.out.println(string+" "+value);
		}
		
	}

}

















































































