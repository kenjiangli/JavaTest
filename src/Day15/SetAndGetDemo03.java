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
 * 
 * 
 * 问题5:相同的数据出现多次
 * 		原因:CPU执行GetThread,打印一次.while(true)有会接着打印
 * 
		正常情况:
			1.生产者(SetThread)
				判断是否有数据,如果有数据就等待,没有数据就生产;生产好数据通知消费者去消费
		
			2.消费者(GetThread)
				判断是否有数据,如果没有就等待,有数据就消费;消费完数据通知生产者去生产

	线程的等待和唤醒: 等待和唤醒机制
	
	Object:
		void wait(): 哪个线程执行到wait哪个线程等待
		void notify(): 唤醒在此对象监视器上等待的单个线程。 
 		void notifyAll(): 唤醒在此对象监视器上等待的所有线程。 

	为什么等待和唤醒的方法不写到Thread类中?wait,notify,notifyAll依赖锁的需要锁去调用这3个方法.而任意对象都可以作为锁.
	
	IllegalMonitorStateException:非法的锁状态异常: wait,notify,notifyAll依赖锁的需要锁去调用这3个方法
 */
public class SetAndGetDemo03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student1502 s=new Student1502();
		GetThread2 t1=new GetThread2(s);
		SetThread2 t2=new SetThread2(s);
		t1.start();
		t2.start();
	}

}

class GetThread2 extends Thread{
	private Student1502 s;

	public GetThread2(Student1502 s) {
		super();
		this.s = s;
	}

	@Override
	public void run() {
		
		while(true){
			synchronized (s) {
				if(!s.hasData){//等待
					try {
						s.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
			System.out.println(s.name+" "+s.age);
			
			//消费完数据通知声场这去生成
			s.hasData=false;
			s.notify();
				}
				}
		}
	}


	
}
//设置学生的姓名和年龄
class SetThread2 extends Thread{
	private Student1502 s;
private int x;
	public SetThread2(Student1502 s) {
		super();
		this.s = s;
		
	}

	@Override
	public void run() {
	while(true){
		synchronized (s) {
			
			if(s.hasData){//等待
				try {
					s.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		if(x%2==0){
			 s.name="lau";//t1设置完name停下来,cpu去执行t2线
			     s.age=24;
						}	else{
					s.name="Janet";
					s.age=20;// t1 cpu切换到t2上去	
					}
		x++;
		s.hasData=true;
		s.notify();
	}// 释放锁// t1
		}
		
		
		}
	
	}
}
class Student1502{
	String name;
	int age;
	boolean hasData;//是否有数据的提示,默认为false
}


































































































