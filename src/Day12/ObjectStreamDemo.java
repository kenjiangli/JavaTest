package Day12;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/*
 * ObjectOutputStream:将对象保存到文件中
 * 
 * 构造方法:
 * ObjectOutputStrem(OutputStream out):创建写入指定OutputStream的ObjectOutputStream.
 * 
 * 将一个对象写到文件中的步骤
 * 	1.定义一个类,需要实现Serializable接口
 * 	2.创建对象
 * 	3.创建ObjectOutputStream
 * 	4.调用writeObject()方法
 * 	5.关流
 */
public class ObjectStreamDemo {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		// TODO Auto-generated method stub
		
		Persons p1=new Persons("Eason", 40, 130, 170, "hk");
		ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("chan.txt"));
		
		//将对象写入文件中
		oos.writeObject(p1);
		oos.close();
	}

}


//Person要通过ObjectOutputStream写到文件中, Person类需要实现 Serializable接口
//类通过实现 java.io.Serializable 接口以启用其序列化功能.这个接口并没有抽象方法.仅作为标示

//保存后如果修改了包名会出现找不到类的情况. ClassNotFoundException

/*
* 问题:InvalidClassException
* 		local class incompatible: stream classdesc serialVersionUID = -4715975881605327119, 
* 		local class serialVersionUID = -8282366006801076645
* 正常情况:
* 		1.保存对象	Person.class会有一个serialVersionUID -4715975881605327119,
* 					写到文件中 -4715975881605327119
* 		2.读取对象	从文件中读取 -4715975881605327119 和 Person.class的serialVersionUID比较.一样
* 
* 不正常情况:
* 		1.保存对象	Person.class会有一个serialVersionUID -4715975881605327119,
* 					写到文件中 -4715975881605327119
* 		2.修改Person类  Person.class会有一个serialVersionUID 会变化 -8282366006801076645
* 
* 		2.读取对象	写到文件中 -4715975881605327119 和 Person.class UID -8282366006801076645
* 		
* 怎么处理这个问题?修改java文件让 UID不变化
* 怎么让Person类的UID不变化呢?
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



































































































