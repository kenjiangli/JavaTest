package Day08;

import java.util.LinkedList;

//LinkedList的基本使用
public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//创建Linkedist
		LinkedList<String> linked=new LinkedList<String>();
		
		//添加元素
		linked.add("super");
		linked.add("spider");
		linked.add("fire");
		
		//在指定位置添加元素
		linked.add(2, "crow");
		
		//修改元素
		linked.set(0, "superman");
		
		for (String string : linked) {
			System.out.println(string);
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
