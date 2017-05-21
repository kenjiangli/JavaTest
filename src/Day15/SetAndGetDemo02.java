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
 * 
 *  * 问题2:只能打印一次
 * 		需要达到不停的设置,不停的打印
 * 
 * 问题3:设置和获取加上while(true)后出现2个问题
 * 		1.相同的数据出现多次
 * 		2.姓名和年龄不匹配 
 * 
 * 问题4姓名和年龄不匹配(线程安全问题):
 * 		原因:姓名和年龄是共享数据.有线程在设置,也有线程在获取
 * 			1.多个线程
 * 			2.有共享数据(姓名和年龄)
 * 			3.有多条语句操作共享数据
 * 
 * 
 * 		解决方法:将操作共享数据的代码使用同步代码块给锁起来
 * 		需要达到有人写的时候不能有人读.有人读的时候不能有人写
 * 		需要使用同一个对象作为锁(s).
 */
public class SetAndGetDemo02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student1501 s=new Student1501();
		GetThread1 t1=new GetThread1(s);
		SetThread1 t2=new SetThread1(s);
		t1.start();
		t2.start();
	}

}

class GetThread1 extends Thread{
	private Student1501 s;

	public GetThread1(Student1501 s) {
		super();
		this.s = s;
	}

	@Override
	public void run() {
		
		while(true){
			synchronized (s) {
			System.out.println(s.name+" "+s.age);
		}
		}
	}


	
}
//设置学生的姓名和年龄
class SetThread1 extends Thread{
	private Student1501 s;
private int x;
	public SetThread1(Student1501 s) {
		super();
		this.s = s;
		
	}

	@Override
	public void run() {
		

		// TODO Auto-generated method stub
		
			
		
	while(true){
		synchronized (s) {
		if(x%2==0){
			 s.name="lau";//t1设置完name停下来,cpu去执行t2线
			     s.age=24;
						}	else{
					s.name="Janet";
					s.age=20;// t1 cpu切换到t2上去

	
}
		x++;
	}// 释放锁// t1
		
		}
	
	}
}
class Student1501{
	String name;
	int age;
}


































































































