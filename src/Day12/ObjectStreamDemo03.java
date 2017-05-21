package Day12;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.ArrayList;

//序列化多个对象
public class ObjectStreamDemo03 {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		//writeObj();
		//readObj();
		writeObj1();
		readObj1();
	}

	
	

	private static void readObj1() throws FileNotFoundException, IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		ObjectInputStream ois=new ObjectInputStream(new FileInputStream("Studentss.txt"));
		
		//读取对象
		ArrayList<Studentss> array=(ArrayList<Studentss>) ois.readObject();
		ois.close();
		
		for (Studentss studentss : array) {
			System.out.println(studentss);
		}
		
		
	}


	private static void writeObj1() throws FileNotFoundException, IOException {
		// TODO Auto-generated method stub
		Studentss s1 = new Studentss("马云", 45);
		Studentss s2 = new Studentss("马化腾", 42);
		Studentss s3 = new Studentss("马超", 28);
		Studentss s4 = new Studentss("马赛克", 18);
		
		
		ArrayList<Studentss> array=new ArrayList<Studentss>();
		array.add(s1);
		array.add(s2);
		array.add(s3);
		array.add(s4);
		ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("Studentss.txt"));
		oos.writeObject(array);
		oos.close();
	}


	//不好的方法
	
	private static void readObj() throws FileNotFoundException, IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		ObjectInputStream ois=new ObjectInputStream(new FileInputStream("Studentss.txt"));
		
		
		//读取对象
		Studentss s1=(Studentss)ois.readObject();
		Studentss s2=(Studentss)ois.readObject();
		Studentss s3=(Studentss)ois.readObject();
		Studentss s4=(Studentss)ois.readObject();
		
		// EOFException读到没有数据的时候返回EOFException: EOF end of file
		//ois.readObject();
		ois.close();
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
	}

	private static void writeObj() throws FileNotFoundException, IOException {
		// TODO Auto-generated method stub
		
		Studentss s1 = new Studentss("马云", 45);
		Studentss s2 = new Studentss("马化腾", 42);
		Studentss s3 = new Studentss("马超", 28);
		Studentss s4 = new Studentss("马赛克", 18);
		
		ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("Studentss.txt"));
		
		oos.writeObject(s1);
		oos.writeObject(s2);
		oos.writeObject(s3);
		oos.writeObject(s4);
		
		oos.close();
		
	}

}



class Studentss implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 3349380097665061497L;
	private String name;
	private int age;
	public Studentss() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Studentss(String name, int age) {
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
		return "Studentss [name=" + name + ", age=" + age + "]";
	}
	
	
}































































































