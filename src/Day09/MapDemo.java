package Day09;

import java.util.HashMap;

/*
 * Map接口:将键映射到值的对象(双列集合)。一个映射不能包含重复的键(键是唯一的)；每个键最多只能映射到一个值。 
 * 
 * Map的特点:双列集合,键是唯一的,值可以重复,可以存储null
 * 
 * V put(K key,V value)将指定的值与此映射中的指定健关联(可选操作).
 * 1.如果key不存在,就是添加,返回值是null
 * 2.如果key存在,就是修改,返回值是修改前的元素
 * 
 * V get(Object key) 返回指定键所映射的值,如果此映射不包含该键的映射关系,则返回null
 * V remove(Object key) 如果存在一个键的映射关系,则将其从此映射中移除
 * int size();返回此反射中的键-值映射关系数
 * 
 * 
    Map接口.
    	|- HashMap
    	|- LinkedHashMap
    	|- HashTable
 * 
 */
public class MapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<String, String> hm=new HashMap<String,String>();
		
		//添加元素put
		hm.put("sebs", "mia");
		hm.put("jack", "rose");
		hm.put("杨过", "小龙女");
		
		
		String v1=hm.put("basketball", "football");
		System.out.println(v1);
		
		//返回数量size()
		int size=hm.size();
		System.out.println(size);
		
		//当key存在的时候put方法表示修改元素,返回的值是修改前的元素
		String v2=hm.put("sebs", "not mia");
		System.out.println(v2);

		//根据健来获取某个值get();
		String v3=hm.get("sebs");
		System.out.println(v3);
		
		String v4=hm.get("wtf?");
		System.out.println(v4);
		
		//删除元素remove();
		String v5=hm.remove("basketball");
		System.out.println(v5);
		System.out.println(hm.size());
	}

}



















































