package Day09;

import java.util.HashMap;

/*
 * Map�ӿ�:����ӳ�䵽ֵ�Ķ���(˫�м���)��һ��ӳ�䲻�ܰ����ظ��ļ�(����Ψһ��)��ÿ�������ֻ��ӳ�䵽һ��ֵ�� 
 * 
 * Map���ص�:˫�м���,����Ψһ��,ֵ�����ظ�,���Դ洢null
 * 
 * V put(K key,V value)��ָ����ֵ���ӳ���е�ָ��������(��ѡ����).
 * 1.���key������,�������,����ֵ��null
 * 2.���key����,�����޸�,����ֵ���޸�ǰ��Ԫ��
 * 
 * V get(Object key) ����ָ������ӳ���ֵ,�����ӳ�䲻�����ü���ӳ���ϵ,�򷵻�null
 * V remove(Object key) �������һ������ӳ���ϵ,����Ӵ�ӳ�����Ƴ�
 * int size();���ش˷����еļ�-ֵӳ���ϵ��
 * 
 * 
    Map�ӿ�.
    	|- HashMap
    	|- LinkedHashMap
    	|- HashTable
 * 
 */
public class MapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<String, String> hm=new HashMap<String,String>();
		
		//���Ԫ��put
		hm.put("sebs", "mia");
		hm.put("jack", "rose");
		hm.put("���", "С��Ů");
		
		
		String v1=hm.put("basketball", "football");
		System.out.println(v1);
		
		//��������size()
		int size=hm.size();
		System.out.println(size);
		
		//��key���ڵ�ʱ��put������ʾ�޸�Ԫ��,���ص�ֵ���޸�ǰ��Ԫ��
		String v2=hm.put("sebs", "not mia");
		System.out.println(v2);

		//���ݽ�����ȡĳ��ֵget();
		String v3=hm.get("sebs");
		System.out.println(v3);
		
		String v4=hm.get("wtf?");
		System.out.println(v4);
		
		//ɾ��Ԫ��remove();
		String v5=hm.remove("basketball");
		System.out.println(v5);
		System.out.println(hm.size());
	}

}



















































