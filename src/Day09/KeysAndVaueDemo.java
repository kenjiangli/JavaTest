package Day09;

import java.util.HashMap;
import java.util.Set;


//Map的遍历,一次拿到键key和值value

public class KeysAndVaueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, String> hm = new HashMap<String, String>();
		hm.put("黄晓明", "Baby");
		hm.put("邓超", "孙俪");
		hm.put("李晨", "范冰冰");
		hm.put("谢霆锋", "王菲");
		
		// 通过键找值
		/*		String v1 = hm.get("黄晓明");
				System.out.println(v1);
				
				String v2 = hm.get("邓超");
				System.out.println(v2);
				
				String v3 = hm.get("李晨");
				System.out.println(v3);
				
				String v4 = hm.get("谢霆锋");
				System.out.println(v4);*/
				
				// 上面这样通过键找找,存在问题,1需要自己写键.有可能写错2.如果键有好多
				// 键很麻烦.keySet可以将所有的键放在一个set集合中.
				// 1.通过keySet方法拿到所有的键
				// 2.遍历这个set集合,可以单独拿到每个键
				// 3.使用get方法.可以找对应的值
	
		
		//通过keySet拿到所有的键
		Set<String> key = hm.keySet();
		
		//遍历这个set集合,可以单独拿到每个键
		for (String string : key) {
			
			//使用get方法,可以找到对应的值
			String value=hm.get(string);
			System.out.println(string+" "+value);
		}
		
	}

}

















































































