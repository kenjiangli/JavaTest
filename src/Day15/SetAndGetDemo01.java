package Day15;



/*
 *  需求:一个线程设置学生姓名,一个线程获取学生姓名,设置一次名称,打印一次名称
 *  
 *  学生类,学生对象是两个线程共享的数据
 *  setThread:s设置学生的姓名和年龄
 *  getThread:获取学生的姓名和年龄
 *  
 *  测试类:
 *  
 *   * 问题1:输出 null -- 0;
 * 		原因每个run方法都去创建学生.这是2个学生.需要使用同一个学生.
 */
public class SetAndGetDemo01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student15 s=new Student15();
		GetThread t1=new GetThread(s);
		SetThread t2=new SetThread(s);
		t1.start();
		t2.start();
	}

}

class GetThread extends Thread{
	private Student15 s;

	public GetThread(Student15 s) {
		super();
		this.s = s;
	}

	@Override
	public void run() {
		synchronized (s) {
			System.out.println(s.name+" "+s.age);
		}
	}


	
}
//设置学生的姓名和年龄
class SetThread extends Thread{
	private Student15 s;
private int x;
	public SetThread(Student15 s) {
		super();
		this.s = s;
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
	
		while(true){
			synchronized (s) {
				if(x%2==0){
					s.name="lau";
					s.age=24;
					
				}	else{
					s.name="janet";
					s.age=20;
				}
		}
			x++;
			}
			
	
	
}
}
class Student15{
	String name;
	int age;
}


































































































