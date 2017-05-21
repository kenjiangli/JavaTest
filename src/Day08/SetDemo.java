package Day08;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

/*
 * Set接口的特点
 * 	没有索引,元素不重复
 * 
 * HashSet:没有顺序
 * LinkedHashSet:有顺序的
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




















































