package Day07;

import java.util.ArrayList;

/*
 * 泛类型,方法的参数类型可以跟着类时的类型一样
 * 格式
 * 
 * class 类名<E>{
 * 修饰符 返回值 方法名(E 变量名)
 * }
 * 
 * 在定义类的时候不确定类型使用E代替
 * 
 * 	Person<String> p = new Person<String>();
	p.say("Hello");
 * 
 * 
	public class ArrayList<E> {

		public boolean add(E e) {
        	
    	}
	}
 */

public class DIYEDemo {
public static void main(String[] args) {
	
	ArrayList<String> array = new ArrayList<String>();
//	array.add(e) String e
	
	ArrayList<Integer> array2 = new ArrayList<Integer>();
//	array2.add(e) Integer e
	
	//自己确立泛型
	Person4<String> p=new Person4<String>();
	p.work(" and work");
	
	Person4<Integer> p2=new Person4<Integer>();
	p2.work(123);
}
}

//定义类的时候不知道方法时什么类型
class Person4<E>{
	public void work(E e){
		System.out.println("work"+e);
	}
}








































