package Day08;

import java.util.HashSet;
/*
 * HashSet是不能存储相同元素,但是HashSet它凭什么知道姓名和年龄一样就是相同的元素
 * 
 * HashSet是怎么来判断元素唯一(是否重复),依赖我们存进去的元素的2个方法.hashCode方法和equals方法
 * 只有hashCode一样,并且equals方法返回true那就说明这2个元素一样
 */
public class HashSetDemo02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 HashSet<Person0802> hs=new HashSet<>();
 

	Person0802 p1 = new Person0802("马云", 45);
	Person0802 p2 = new Person0802("马化腾", 42);
	Person0802 p3 = new Person0802("马冬梅", 25);
	Person0802 p4 = new Person0802("马赛克", 18);
	Person0802 p5 = new Person0802("马云", 45);
	Person0802 p6 = new Person0802("马赛克", 18);
	
	hs.add(p1);
	hs.add(p2);
	hs.add(p3);
	hs.add(p4);
	hs.add(p5);
	hs.add(p6);
	
	for (Person0802 person0802 : hs) {
		System.out.println(person0802);
	}
	}

}
class Person0802{
	private String name;
	private int age;
	public Person0802() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Person0802(String name, int age) {
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
	@Override
	public String toString() {
		return "Person0802 [name=" + name + ", age=" + age + "]";
	}
	
}





































