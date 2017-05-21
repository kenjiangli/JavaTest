package Day09;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

/*
 * /*
 * 练习：每位学生（姓名，年龄）都有自己的家庭住址。那么，既然
 * 有对应关系，则将学生对象和家庭住址存储到map集合中。家庭住址作为键, 学生作为值。
 */

public class HashMapTestDemo01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<String, Student02> hm=new HashMap<String,Student02>();
		
		Student02 s1=new Student02("张三",18);
		Student02 s2=new Student02("李四",19);
		Student02 s3=new Student02("王五",20);
		
		hm.put("广州", s1);
		hm.put("香港", s2);
		hm.put("深圳", s3);
		
		//keyset
		Set<String> keySet = hm.keySet();
		for (String string : keySet) {
			Student02 value=hm.get(string);
			System.out.println(string+" "+value);
		}
		
		//EntrySet
	
		Set<Entry<String, Student02>> entrySet = hm.entrySet();
		for (Entry<String, Student02> entry : entrySet) {
			String keys=entry.getKey();
			Student02 value=entry.getValue();
			System.out.println(keys+" "+value);
			
		}
	}

}
class Student02{
	private String name;
	private int age;
	public Student02() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student02(String name, int age) {
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
		return "Student02 [name=" + name + ", age=" + age + "]";
	}
	
}
































