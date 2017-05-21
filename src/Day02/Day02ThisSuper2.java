package Day02;
/*
 * 如果一个没有写构造方法,系统默认会添加一个构造方法
 * public 类名(){
 * super();
 *  }
 *  
 *  如果自己写了构造方法,就没有默认的构造方法
 *  
 *  继承后:
 *  1.子类会默认调用父类的构造方法.
 *  		为什么会调用,因为父类可能会有成员变量,需要通过构造方法赋值
 *  
 *  为什么要用父类无参的构造方法.java程序不知道定义的类里面有什么成员变量,就不能
 *  通过游蚕,只能选择无参构造
 *  
 *  子类的构造方法如何调用父类的无参构造,在子类的构造方法第一行有一个super();
 *  
 *  调用父类有参构造super(..):会找到父类对应参数的构造方法
 *  
 *  当父亲只有有参构造没有无参构造,子类默认调用父类无参就会报错,找不到父类的无参构造
 *  
 *  解决办法:
 *  	给父类添加无参构造方法
 *  	主动调用父类有参构造
 *  	
 *  super(..)调用父类构造方法只能放在子类构造方法第一行
 *  
 *  
 *  
 */
public class Day02ThisSuper2 {

	public static void main(String[] args) {
		Student2 s=new Student2();
		Student2 s2 = new Student2("赵德住", 10);
		System.out.println(s2.getName());
	}


}
class Person7{
	private String name;
	private int age;
	
	// 1.父类定义无参构造
//	public Person() {
//		System.out.println("父类构造方法");
//	}
	
	
	public Person7() {
		super();
		// TODO Auto-generated constructor stub
	
	}


	public Person7(String name, int age) {
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

class Student2 extends Person7{

	public Student2() {
		//super();定义无参构造
		super("lee",24);
	}
	//定义有参构造
	public Student2(String name, int age) {
		super(name, age);
	}
	
	
}

























