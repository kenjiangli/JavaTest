package Day08;

/*
 * String的 "=="比较地址
 * equals是比较内容
 * 
 * Object默认的equals放,比较的是对象的地址
 * public boolean equals(Object obj){
 * return(this==obj);
 * }
 */
public class equalsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="abc";
		String s2=new String("abc");
		
		System.out.println("s1==s2 "+(s1==s2));
		System.out.println("S1.equals s2  "+(s1.equals(s2)));
		
		//自定义类型
		Person0801 p1=new Person0801("lee",23);
		Person0801 p2=new Person0801("lee",23);
		System.out.println("p1==p2 "+(p1==p2));
		System.out.println("p1.equals p2 "+(p1.equals(p2)));
	}

}
class Person0801{
	private String name;
	private int age;
	public Person0801() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Person0801(String name, int age) {
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
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		//地址一样,表示同一对象
		if(this==obj){
			return true;
		}
		
		//判断类型
		if(obj instanceof Person0801){
			//类型转换
			Person0801 p2=(Person0801)obj;
			
			//姓名,年龄都一样
			if(this.getName().equals(p2.getName())&&this.getAge()==p2.getAge()){
				return true;
			}
		}
		return false;
	}
}









































