package Day07;

import java.util.ArrayList;
import java.util.Iterator;

/*
 * 如果我们存一个数据使用变量
 * 存储多个数据就使用数组/ArrayList
 * 
 * 数组和ArrayList的区别:
 * 		数组:长度固定,有默认值,有索引,可以放基本数据类型也可以放引用数据类型
 * 
 * 		ArrayList:长度是可变的,没有默认值,有索引,只能放引用数据类型
 */
public class ArrayListAndInteratorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> array=new ArrayList<String>();
		array.add("abc");
		array.add("efg");
		array.add("hik");
		for (int i = 0; i < array.size(); i++) {
			System.out.println(array.get(i));
		}
		System.out.println("--------------------------------");
		/*
		 * 获取迭代器的步骤
		 * 1.获取迭代器
		 * 2.循环判断有没元素
		 * 3.有元素获取元素
		 */
		Iterator<String> itr=array.iterator();
		//hasNext();如果仍有元素可以迭代，则返回 true。
		//（换句话说，如果 next 返回了元素而不是抛出异常，则返回 true）。 
		while(itr.hasNext()){
			String str=itr.next();//返回迭代的下一个元素
			System.out.println(str);
		}
		
	}

}


















































