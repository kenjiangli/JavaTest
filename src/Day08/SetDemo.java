package Day08;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

/*
 * Set�ӿڵ��ص�
 * 	û������,Ԫ�ز��ظ�
 * 
 * HashSet:û��˳��
 * LinkedHashSet:��˳���
 */
public class SetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		HashSet<String> hs=new HashSet<String>();
		LinkedHashSet<String> hs=new LinkedHashSet<String>();
		hs.add("b");
		hs.add("a");
		hs.add("c");
		hs.add("c");
		hs.add("c");
		hs.add("b");
		hs.add("a");
		
		
		Iterator<String> iterator = hs.iterator();
		while(iterator.hasNext()){
			String next=iterator.next();
			System.out.println(next);
		}
		}

}




















































