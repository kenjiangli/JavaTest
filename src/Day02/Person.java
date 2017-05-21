package Day02;
/*
 * 类与类的组合关系,一个类的成员变量是另外一个类
 * 人类
 * 姓名,年龄,宠物
 */
public class Person {
private String name;
private int age;

//宠物其实也是一个事物,所以需要使用一个类来专门描述宠物这个事物
private Pet pet;


public void show(){
	//可以拿到pet类的属性
	System.out.println(name+","+"养了一只宠物,名称是"+pet.getName()+",价格是"+pet.getPrice());
						
}
public Person() {
	super();
	// TODO Auto-generated constructor stub
}

public Person(String name, int age, Pet pet) {
	super();
	this.name = name;
	this.age = age;
	this.pet = pet;
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

public Pet getPet() {
	return pet;
}

public void setPet(Pet pet) {
	this.pet = pet;
}

}
