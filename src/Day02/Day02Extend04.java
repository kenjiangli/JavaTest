package Day02;

public class Day02Extend04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Student5  s=new Student5("lee",12,23);

	}

}

/*
 * 1.父亲的成员变量,调用父类的构造方法去赋值
 * 自己的成员自己赋值
 */
class Person9{
	private String name;
	private int age;
	public Person9() {
		super();
		// TODO Auto-generated constructor stub
		System.out.println("父类构造方法");
	}
	public Person9(String name, int age) {
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
class Student5 extends Person9{
	//成绩
	private int score;

	public Student5() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student5(String name, int age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}

	public Student5(String name,int age,int score) {
		//父类有两个成员变量,我们调用父类2个参数的构造方法
		super(name,age);
		
		//自己的成员赋值
		this.score = score;
	}
	
}




























































