package Day02;

public class Day02This {
public static void main(String[] args) {
	Person6 p2= new Person6("紫霞仙子", 18, 55);

}
	
}

/*
*this调用本类构造方法
* this(...);
* 
* 注意:
* this只能放在构造方法第一行
* this不能导致构造循环调用
*/
class Person6{
	private String name;
	private int age;
	private double weight;
	private double salary;
	
	public Person6(){
		this("张三",20,1.70,120);
	}
public Person6(String name, int age, double weight) {
		
	//构造方法调用this(...)
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
//		this("", 20, 1.7, 60, 0); 原因构造方法只会调用一次，set方法可以
		//无数次的调用， 普通方法需要在对象创建完成后才能调用
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

