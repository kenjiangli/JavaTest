package Day02;
/*
 * this(...)���ñ��๹�췽��,������Ҫ���ڹ��췽���ĵ�һ��
 * super(...)���ø��๹�췽��,������Ҫ���ӹ��췽����һ��
 * 
 * ���췽����һ����this()����super();
 * 
 * ��֤һ��ԭ��:����Ĺ��췽���ܹ�ֱ�ӻ��ӵĵ��õ�����Ĺ��췽������
 */
public class Day02ThisSuper03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
class Person8{
	private String name;
	private int age;
	
	//���ඨ���޲ι���
	public Person8() {
		//super();
		System.out.println("���๹�췽��");
		
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
	//�ɼ�
	private int score;

	public Student3() {
		//super();
		// TODO Auto-generated constructor stub
		this("lee",12);
	}
	//�����вι���
	public Student3(String string, int i) {//Ĭ�ϵ��ø����޲ι��췽��
		// TODO Auto-generated constructor stub
		super();
	}


	
}




































