package Day02;
/*
 * ���һ��û��д���췽��,ϵͳĬ�ϻ����һ�����췽��
 * public ����(){
 * super();
 *  }
 *  
 *  ����Լ�д�˹��췽��,��û��Ĭ�ϵĹ��췽��
 *  
 *  �̳к�:
 *  1.�����Ĭ�ϵ��ø���Ĺ��췽��.
 *  		Ϊʲô�����,��Ϊ������ܻ��г�Ա����,��Ҫͨ�����췽����ֵ
 *  
 *  ΪʲôҪ�ø����޲εĹ��췽��.java����֪���������������ʲô��Ա����,�Ͳ���
 *  ͨ���β�,ֻ��ѡ���޲ι���
 *  
 *  ����Ĺ��췽����ε��ø�����޲ι���,������Ĺ��췽����һ����һ��super();
 *  
 *  ���ø����вι���super(..):���ҵ������Ӧ�����Ĺ��췽��
 *  
 *  ������ֻ���вι���û���޲ι���,����Ĭ�ϵ��ø����޲ξͻᱨ��,�Ҳ���������޲ι���
 *  
 *  ����취:
 *  	����������޲ι��췽��
 *  	�������ø����вι���
 *  	
 *  super(..)���ø��๹�췽��ֻ�ܷ������๹�췽����һ��
 *  
 *  
 *  
 */
public class Day02ThisSuper2 {

	public static void main(String[] args) {
		Student2 s=new Student2();
		Student2 s2 = new Student2("�Ե�ס", 10);
		System.out.println(s2.getName());
	}


}
class Person7{
	private String name;
	private int age;
	
	// 1.���ඨ���޲ι���
//	public Person() {
//		System.out.println("���๹�췽��");
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
		//super();�����޲ι���
		super("lee",24);
	}
	//�����вι���
	public Student2(String name, int age) {
		super(name, age);
	}
	
	
}

























