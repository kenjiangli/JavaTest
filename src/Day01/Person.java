package Day01;

public class Person {
private String name;
private String sex;
private String age;
private String qq;

	public Person() {
		// TODO Auto-generated constructor stub
	}

	public Person(String name, String sex, String age, String qq) {
		super();
		this.name = name;
		this.sex = sex;
		this.age = age;
		this.qq = qq;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getQq() {
		return qq;
	}

	public void setQq(String qq) {
		this.qq = qq;
	}

}
