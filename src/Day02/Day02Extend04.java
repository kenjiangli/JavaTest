package Day02;

public class Day02Extend04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Student5  s=new Student5("lee",12,23);

	}

}

/*
 * 1.���׵ĳ�Ա����,���ø���Ĺ��췽��ȥ��ֵ
 * �Լ��ĳ�Ա�Լ���ֵ
 */
class Person9{
	private String name;
	private int age;
	public Person9() {
		super();
		// TODO Auto-generated constructor stub
		System.out.println("���๹�췽��");
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
	//�ɼ�
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
		//������������Ա����,���ǵ��ø���2�������Ĺ��췽��
		super(name,age);
		
		//�Լ��ĳ�Ա��ֵ
		this.score = score;
	}
	
}




























































