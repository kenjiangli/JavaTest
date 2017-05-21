package Day08;

import java.util.HashSet;

/*
 * ����:�������һ��,����һ��,������Ϊ��ͬһ����
 * 
 * Ĭ�������,HashSet�ж�Ԫ��Ψһ���������hashCode��equals����
 * Personû����дhashcode,ʹ�õ���Object��hashcode;
 * Object��hashCode�Ǹ��ݶ�����ڴ��ַ���˵�,�����Ķ����ַ��һ��,hashCode��һ��
 * 
 * ��Ҫ�Լ���дhashCode��equals����,������Ԫ�ص�Ψһ
 */
public class HashCodeAndEqualsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<Person0803> hs=new HashSet<Person0803>();


		Person0803 p1 = new Person0803("����", 45);
		Person0803 p2 = new Person0803("��÷", 25);
		Person0803 p3 = new Person0803("������", 18);
		Person0803 p4 = new Person0803("����", 45);
		Person0803 p5 = new Person0803("������", 18);
		
		hs.add(p1);
		hs.add(p2);
		hs.add(p3);
		hs.add(p4);
		hs.add(p5);
		
		for (Person0803 person0803 : hs) {
			System.out.println(person0803);
		}
	}

}
class Person0803{
	private String name;
	private int age;
	public Person0803() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Person0803(String name, int age) {
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
	@Override
	public String toString() {
		return "Person0803 [name=" + name + ", age=" + age + "]";
	}
//	
//	/*
//	 * �������ݲ�һ��,hashCode������һ��,���Բ���ȥʹ��equals�����Ƚ�,�洢��ȥ����Ч�ʾͻ�Ƚϸ�
//	 * (non-Javadoc)
//	 * @see java.lang.Object#hashCode()
//	 * 
//	 * @Override
//	public String toString() {
//		return "Person [name=" + name + ", age=" + age + "]";
//	}
//	
//	/*
//	 * �������ݲ�һ��,hashCode������һ��.���Բ���ȥʹ��equals�����Ƚ�.�洢��ȡ����Ч�ʾͻ�Ƚϸ�
//	 */
//	@Override
//	public int hashCode() {
//		// ��ô�ö�������ݲ�һ��hashCode������һ��.hashCode�����ɺ�����ȥ���
//		return getName().hashCode() + age;
//	}
//	
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj) {
//			return true;
//		}
//		
//		if (obj == null) {
//			return false;
//		}
//		
//		if (obj instanceof Person) {
//			Person p = (Person)obj;
//			System.out.println(this.getName() + "�ں� " + p.getName() + " �Ƚ�");
//			// ͬһ����,�Ƚ�����������
//			if (this.getName().equals(p.getName()) && this.getAge() == p.getAge()) {
//				return true;
//			}
//		}
//		
//		return false;
//	}
//	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person0803 other = (Person0803) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	
}












































































