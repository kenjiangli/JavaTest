package Day12;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;


//transient:˲̬ �����Ǳ�transient���εĳ�Ա������ʹ��ObjectOutputStreamд���ļ���ʱ�򲻻�д���ļ���
public class transientDemo {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		
		//WriteObj();//Students�е�static moneyֻҪ�����˳�,�κεط������Է���
		readObj();

	}

		//д��
	private static void WriteObj() throws FileNotFoundException, IOException {
		// TODO Auto-generated method stub
		Students s1=new Students("Eason", 40, 130, 170, "hk");
		ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("Students.txt"));
		Students.money=20000;
		System.out.println("����ǰ"+Students.money);
		
		oos.writeObject(s1);
		oos.close();
	}

	//��ȡ
	private static void readObj() throws FileNotFoundException, IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		ObjectInputStream ois =new ObjectInputStream(new FileInputStream("Students.txt"));
		
		Students s1=(Students) ois.readObject();
		ois.close();
		System.out.println(s1);
		System.out.println("��ȡ"+Students.money);//��ȡ��Ϊ0.0
	}

}
class Students implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -8817519830623169467L;
	private String name;
	private int age;
	private double weight;
	private double height;
	private String address;
	// staitc��ʹ��ObjectOutputStreamд���ļ���ʱ�򲻻�д���ļ���
		public static double  money;
	public Students() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Students(String name, int age, double weight, double height, String address) {
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
		return "Students [name=" + name + ", age=" + age + ", weight=" + weight + ", height=" + height + ", address="
				+ address + "]"+money;
	}
	
	
}






































































































