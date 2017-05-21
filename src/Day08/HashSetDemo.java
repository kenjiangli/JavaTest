package Day08;

//HasgSet:元素不重复,没有索引,存储和取出没有顺序

import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//method01();
		method02();
	}

	private static void method02() {
		// TODO Auto-generated method stub
		
		HashSet<String> hs=new HashSet<String>();
		hs.add("one");
		hs.add("two");
		hs.add("two");
		hs.add("three");
		hs.add("five");
		
		for (String string : hs) {
			System.out.print(string+" ");
		}
		
	}

	private static void method01() {
		// TODO Auto-generated method stub
		HashSet<Integer> hs=new HashSet<Integer>();
		hs.add(1);
		hs.add(3);
		hs.add(1);
		hs.add(5);
		hs.add(5);
		
		for (Integer integer : hs) {
			System.out.print(integer+" ");
		}
	}

}






































