package Day01;

import java.util.ArrayList;

/*
 * 匿名对象和有名对象
 * 
 * 匿名对象,没有名字的对象,只需要=右边的
 * 匿名对象缺点:
 * 			只能调用一次方法
 * 匿名对象的好处
 * 			代码短一点
 *
 *有名对象的好处
 *			可以重复调用方法
 *有名对象的缺点:	
 *			代码长一点
 *	
 *匿名对象的使用场景
 *	1.指向调用一次方法
 *	2.作为方法的参数传递
 */

public class Day01Person {

	public Day01Person() {
		// TODO Auto-generated constructor stub
		
		//对象的创建
		Person1 p1=new Person1("Steven",23);
		p1.eat();
		p1.sayHell();		
		
		//匿名对象,没有名字的对象,只需要=右边的
		new Person1().eat();
		new Person1().sayHell();
		
		ArrayList<Person1> arr=new ArrayList<Person1>();
		Person1 p2=new Person1("cook",40);
		arr.add(p2);
		
		//使用匿名对象
		arr.add(new Person1("groot", 19));
		
	}

}
