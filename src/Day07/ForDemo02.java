package Day07;

import java.util.ArrayList;

public class ForDemo02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//集合方法测试
		method01();
		method02();
	}

	private static void method02() {
		// TODO Auto-generated method stub
		ArrayList<Person3> array=new ArrayList<Person3>();
		Person3 p1=new Person3("sebs", 27);
		Person3 p2=new Person3("Mia",25);
		Person3 p3=new Person3("jobs", 30);
		array.add(p1);
		array.add(p2);
		array.add(p3);
		
		for (Person3 person3 : array) {
			System.out.println(person3);
		}
		
	}

	private static void method01() {
		// TODO Auto-generated method stub
		ArrayList<Integer> array=new ArrayList<Integer>();
		array.add(123);
		array.add(456);
		array.add(789);
		for (Integer integer : array) {
			System.out.println(integer);
		}
	}

}
class Person3{
	private String name;
	private int age;
	public Person3() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Person3(String name, int age) {
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
		return name + ", " + age ;
	}
	
	
}