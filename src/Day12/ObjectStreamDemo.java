package Day12;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/*
 * ObjectOutputStream:�����󱣴浽�ļ���
 * 
 * ���췽��:
 * ObjectOutputStrem(OutputStream out):����д��ָ��OutputStream��ObjectOutputStream.
 * 
 * ��һ������д���ļ��еĲ���
 * 	1.����һ����,��Ҫʵ��Serializable�ӿ�
 * 	2.��������
 * 	3.����ObjectOutputStream
 * 	4.����writeObject()����
 * 	5.����
 */
public class ObjectStreamDemo {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		// TODO Auto-generated method stub
		
		Persons p1=new Persons("Eason", 40, 130, 170, "hk");
		ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("chan.txt"));
		
		//������д���ļ���
		oos.writeObject(p1);
		oos.close();
	}

}


//PersonҪͨ��ObjectOutputStreamд���ļ���, Person����Ҫʵ�� Serializable�ӿ�
//��ͨ��ʵ�� java.io.Serializable �ӿ������������л�����.����ӿڲ�û�г��󷽷�.����Ϊ��ʾ

//���������޸��˰���������Ҳ���������. ClassNotFoundException

/*
* ����:InvalidClassException
* 		local class incompatible: stream classdesc serialVersionUID = -4715975881605327119, 
* 		local class serialVersionUID = -8282366006801076645
* �������:
* 		1.�������	Person.class����һ��serialVersionUID -4715975881605327119,
* 					д���ļ��� -4715975881605327119
* 		2.��ȡ����	���ļ��ж�ȡ -4715975881605327119 �� Person.class��serialVersionUID�Ƚ�.һ��
* 
* ���������:
* 		1.�������	Person.class����һ��serialVersionUID -4715975881605327119,
* 					д���ļ��� -4715975881605327119
* 		2.�޸�Person��  Person.class����һ��serialVersionUID ��仯 -8282366006801076645
* 
* 		2.��ȡ����	д���ļ��� -4715975881605327119 �� Person.class UID -8282366006801076645
* 		
* ��ô�����������?�޸�java�ļ��� UID���仯
* ��ô��Person���UID���仯��?
* 
* */
class Persons implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1047703128896862334L;
	private String name;
	private int age;
	private double weight;
	private double height;
	private String address;
	public Persons() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Persons(String name, int age, double weight, double height, String address) {
		super();
		this.name = name;
		this.age = age;
		this.weight = weight;
		this.height = height;
		this.address = address;
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
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Persons [name=" + name + ", age=" + age + ", weight=" + weight + ", height=" + height + ", address="
				+ address + "]";
	}
	
	
}



































































































