package Day01;

public class Student {
	private String name;
	

	public Student() {
		// TODO Auto-generated constructor stub
	}


	public Student(String name) {
	
		this.name = name;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}
	//˭�����߷���,this����˭
	public void say(){
		String name="ken";
		System.out.println(name);
		System.out.println(this.name);
		System.out.println("������"+this);
	}

}
