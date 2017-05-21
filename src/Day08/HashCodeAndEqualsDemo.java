package Day08;

import java.util.HashSet;

/*
 * 需求:如果姓名一样,年龄一样,我们认为是同一个人
 * 
 * 默认情况下,HashSet判断元素唯一以来对象的hashCode和equals方法
 * Person没有重写hashcode,使用的是Object的hashcode;
 * Object的hashCode是根据对象的内存地址来了的,创建的对象地址不一样,hashCode不一样
 * 
 * 需要自己重写hashCode和equals方法,来定义元素的唯一
 */
public class HashCodeAndEqualsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<Person0803> hs=new HashSet<Person0803>();


		Person0803 p1 = new Person0803("马云", 45);
		Person0803 p2 = new Person0803("马冬梅", 25);
		Person0803 p3 = new Person0803("马赛克", 18);
		Person0803 p4 = new Person0803("马云", 45);
		Person0803 p5 = new Person0803("马赛克", 18);
		
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
//	 * 尽量内容不一样,hashCode尽量不一样,可以不用去使用equals方法比较,存储和去除的效率就会比较高
//	 * (non-Javadoc)
//	 * @see java.lang.Object#hashCode()
//	 * 
//	 * @Override
//	public String toString() {
//		return "Person [name=" + name + ", age=" + age + "]";
//	}
//	
//	/*
//	 * 尽量内容不一样,hashCode尽量不一样.可以不用去使用equals方法比较.存储和取出的效率就会比较高
//	 */
//	@Override
//	public int hashCode() {
//		// 怎么让对象的内容不一样hashCode尽量不一样.hashCode的生成和内容去相关
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
//			System.out.println(this.getName() + "在和 " + p.getName() + " 比较");
//			// 同一类型,比较姓名和年龄
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












































































