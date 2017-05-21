package Day07;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

/*
 *  定义一个Person类,里面有姓名和年龄属性,生成对应的
 *  	getter/setter方法以及满参构造,空参构造,定义一个测试类,
 * 
 * 在测试类中定义一个集合,集合中存储多个Person对象,最终
 * 遍历该集合,分别打印出这些人的姓名和年龄,并且统计出这些人的总年龄打印在控制台上
 */
public class IteratorDemo02 {
public static void main(String[] args) {
	
	//定义集合
	ArrayList<Person2> array=new ArrayList<Person2>();
	Person2 p1=new Person2("sebs", 27);
	Person2 p2=new Person2("Mia",25);
	Person2 p3=new Person2("jobs", 30);
	array.add(p1);
	array.add(p2);
	array.add(p3);
	
	//总年龄
	int tage=0;
	
	//使用迭代器集合遍历
	//Iterator<Person2> itr=array.iterator();
	ListIterator<Person2> itr=array.listIterator();//换做ListIterator
	while(itr.hasNext()){
		Person2 p=itr.next();
		System.out.println(p.getName()+" "+p.getAge());
		tage+=p.getAge();
		
		//当年龄是25岁时,添加多一个人
		if(p.getAge()==25){
			Person2 p4=new Person2("shelton", 29); 
			//array.add(p4);  java.util.ConcurrentModificationException并发修改异常
			//                问题的原因,迭代器在获取元素,这时放入一个元素,迭代器不知道
			//				  不能直接用array.add 去添加元素,需要使用迭代器去添加元素需要使用List专用的迭代器ListIterator
			itr.add(p4);
			
			itr.previous();//返回列表中的前一个元素。
		}
		
	}
	System.out.println(tage);
	
	//再次迭代一次
	Iterator<Person2> itr2=array.iterator();
	while(itr2.hasNext()){
		Person2 p=itr2.next();
		System.out.println(p.getName()+" "+p.getAge());
}

}
}
//定义一个Person类
class Person2{
	private String name;
	private int age;
	public Person2() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Person2(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
}

