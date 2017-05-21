package Day07;

public class ToStringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1=new Person("lee",18);
		System.out.println(p1);//将对象放入输出语句其实是调用对象的toString方法,将toString方法返回的字符串进行了打印
	}

}
class Person{
	private String name;
	private int age;
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	//父类Object的toString方法默认是将对象的地址打印出来
	
	//直接获得集合元素,可以重写toString方法 
	@Override
	public String toString() {
		return  name + ", " +age;
	}
	
}