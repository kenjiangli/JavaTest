package Day02;

public class Day02This {
public static void main(String[] args) {
	Person6 p2= new Person6("��ϼ����", 18, 55);

}
	
}

/*
*this���ñ��๹�췽��
* this(...);
* 
* ע��:
* thisֻ�ܷ��ڹ��췽����һ��
* this���ܵ��¹���ѭ������
*/
class Person6{
	private String name;
	private int age;
	private double weight;
	private double salary;
	
	public Person6(){
		this("����",20,1.70,120);
	}
public Person6(String name, int age, double weight) {
		
	//���췽������this(...)
		this(name,age,weight,0);
		System.out.println("helleo");
		
	}


	public Person6(String name, int age, double weight, double salary) {
		
		this.name = name;
		this.age = age;
		this.weight = weight;
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
//		this("", 20, 1.7, 60, 0); ԭ���췽��ֻ�����һ�Σ�set��������
		//�����εĵ��ã� ��ͨ������Ҫ�ڶ��󴴽���ɺ���ܵ���
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
}

