package Day02;
/*
 * ���������Ϲ�ϵ,һ����ĳ�Ա����������һ����
 * ����
 * ����,����,����
 */
public class Person {
private String name;
private int age;

//������ʵҲ��һ������,������Ҫʹ��һ������ר�����������������
private Pet pet;


public void show(){
	//�����õ�pet�������
	System.out.println(name+","+"����һֻ����,������"+pet.getName()+",�۸���"+pet.getPrice());
						
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
