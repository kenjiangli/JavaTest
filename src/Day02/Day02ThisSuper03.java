package Day02;
/*
 * this(...)调用本类构造方法,而且需要放在构造方法的第一行
 * super(...)调用父类构造方法,而且需要房子构造方法第一行
 * 
 * 构造方法第一行用this()还是super();
 * 
 * 保证一个原则:子类的构造方法能够直接或间接的调用到父类的构造方法即可
 */
public class Day02ThisSuper03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
class Person8{
	private String name;
	private int age;
	
	//父类定义无参构造
	public Person8() {
		//super();
		System.out.println("父类构造方法");
		
	}

	public Person8(String name, int age) {
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

class Student3 extends Person{
	//成绩
	private int score;

	public Student3() {
		//super();
		// TODO Auto-generated constructor stub
		this("lee",12);
	}
	//定义有参构造
	public Student3(String string, int i) {//默认调用父亲无参构造方法
		// TODO Auto-generated constructor stub
		super();
	}


	
}




































