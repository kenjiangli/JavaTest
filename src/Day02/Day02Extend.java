package Day02;
/*
 * 在Java中继承是描述两个类之间关系的(父类,子类),子类可以自动拥有父类的成员变量和成员方法
 * 
 * 把类相同的内容自定义在另外一个类中,让这些类和另外的类产生关系,这些类就可以使用另外类的代码了
 * 
 * 继承的格式
 * extends
 * public class 类名 extends 父类{ 
 * 
 * }
 * 
 * 注意:
 * 		当一个类中没有extends时,实际它是继承自Object,编译器会自动帮我们加上extends object
 * 		object是所有自定义类的父类,所有自定义类都直接或间接的继承自object
 * 		
 * 		object类是没有父类的
 * 		
 * 继承的好处:
 *		1.提高代码的复用性
 *		2.提高代码的维护性
 *		3.让类与类之间产生了联系
 * 		
 * 
 */
public class Day02Extend {
public static void main(String[] args) {
	//创建Coder,Coder继承自Person,会自动获取Person非私有的成员
	Coder c=new Coder();
	//c.name="jobs";
	//c.age=55;
	//System.out.println(c.name);
	
	//父类的属性private后,子类就无法使用了,但是父类提供了get/set方法
	c.setName("Jobs");
	c.setAge(55);
	System.out.println(c.getName());
	c.eat();
	c.sleep();
	c.coding();
}
	
}
class Person4{
	private int money;//私有化,无法获取
	private String name;
	private int age;
	//String name;
	//int age;
	
	public Person4() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Person4(int money, String name, int age) {
		super();
		this.money = money;
		this.name = name;
		this.age = age;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
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

	public void eat(){
		System.out.println("吃饭");
	}
	public void sleep(){
		System.out.println("睡觉");
	}

}
class Teacher extends Person4{
	public void teach(){
		System.out.println("教书");
	}
}
class  Coder extends Person4{
	public void coding(){
		System.out.println("撸代码");
	}
}







































