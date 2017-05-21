package Day09;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;


/*
 * Map接口
 * 
 * Set<T> keySet():将Map集合中的所有key放到一个set集合中
 * Collections<T> values():将所有的值放到一个集合中
 */
public class KeySetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<String, String> hm = new HashMap<String, String>();
		hm.put("黄晓明", "Baby");
		hm.put("邓超", "孙俪");
		hm.put("李晨", "范冰冰");
		hm.put("谢霆锋", "王菲");
		
		//keySet() 拿到所有的键
		Set<String> keys=hm.keySet();
		
		//迭代器,拿到键
		Iterator<String> itr = keys.iterator();
		while (itr.hasNext()) {
			String key = (String) itr.next();
			System.out.println(key);
		}
		System.out.println("------------------------");
		
		//拿到值
		Collection<String> values = hm.values();
		for (String string : values) {
			System.out.println(string);
		}
	}

}


























































































