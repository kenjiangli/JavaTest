package Day02;
/*
 * ��Java�м̳�������������֮���ϵ��(����,����),��������Զ�ӵ�и���ĳ�Ա�����ͳ�Ա����
 * 
 * ������ͬ�������Զ���������һ������,����Щ���������������ϵ,��Щ��Ϳ���ʹ��������Ĵ�����
 * 
 * �̳еĸ�ʽ
 * extends
 * public class ���� extends ����{ 
 * 
 * }
 * 
 * ע��:
 * 		��һ������û��extendsʱ,ʵ�����Ǽ̳���Object,���������Զ������Ǽ���extends object
 * 		object�������Զ�����ĸ���,�����Զ����඼ֱ�ӻ��ӵļ̳���object
 * 		
 * 		object����û�и����
 * 		
 * �̳еĺô�:
 *		1.��ߴ���ĸ�����
 *		2.��ߴ����ά����
 *		3.��������֮���������ϵ
 * 		
 * 
 */
public class Day02Extend {
public static void main(String[] args) {
	//����Coder,Coder�̳���Person,���Զ���ȡPerson��˽�еĳ�Ա
	Coder c=new Coder();
	//c.name="jobs";
	//c.age=55;
	//System.out.println(c.name);
	
	//���������private��,������޷�ʹ����,���Ǹ����ṩ��get/set����
	c.setName("Jobs");
	c.setAge(55);
	System.out.println(c.getName());
	c.eat();
	c.sleep();
	c.coding();
}
	
}
class Person4{
	private int money;//˽�л�,�޷���ȡ
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
		System.out.println("�Է�");
	}
	public void sleep(){
		System.out.println("˯��");
	}

}
class Teacher extends Person4{
	public void teach(){
		System.out.println("����");
	}
}
class  Coder extends Person4{
	public void coding(){
		System.out.println("ߣ����");
	}
}







































