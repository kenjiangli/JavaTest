package Day07;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class EDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//没有泛型,需要自己做强制转换,具有风险
		ArrayList array=new ArrayList();
		array.add("abc");
		array.add("efg");
		array.add("hik");
		for (int i = 0; i < array.size(); i++) {
			String s=(String) array.get(i);
			System.out.println(s);
		}
		
		//有泛型,不是这个类型的元素不能存储进去,在获取元素的时候,不需要强制转换
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












































