package Day07;

public class ToStringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1=new Person("lee",18);
		System.out.println(p1);//�����������������ʵ�ǵ��ö����toString����,��toString�������ص��ַ��������˴�ӡ
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
	
	//����Object��toString����Ĭ���ǽ�����ĵ�ַ��ӡ����
	
	//ֱ�ӻ�ü���Ԫ��,������дtoString���� 
	@Override
	public String toString() {
		return  name + ", " +age;
	}
	
}