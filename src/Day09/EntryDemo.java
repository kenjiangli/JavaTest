package Day09;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

/*
 * Map接口中
 * Map.Entry<K,V>;映射项(键-值对)
 * 
 * set<Map,Entry<K,Y> entrySet() 返回此映射中包含的映射关系的set视图
 * set<Map.Entry<K,V>>;set<E>:Map.Entry<K,V>
 * set<String>
 * 表示set集合中存放的是Map.Entry<K,V>类型
 */
public class EntryDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, String> hm = new HashMap<String, String>();
		hm.put("黄晓明", "Baby");
		hm.put("邓超", "孙俪");
		hm.put("李晨", "范冰冰");
		hm.put("谢霆锋", "王菲");
		
		
		//Set中存放多个Entry<String,String>
		Set<Entry<String, String>> entrySet = hm.entrySet();
		
		//获取每个Entry,Entrt中有键和值
		for (Entry<String, String> entry : entrySet) {
			String key=entry.getKey();
			String value=entry.getValue();
			System.out.println(key+" "+value);
		}
	}

}























































































