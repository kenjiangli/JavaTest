package Day14;
/*
 * 1 定义一个类继承Thread。
	2 重写run方法。
	3 创建子类对象，就是创建线程对象。
	4 调用start方法，开启线程并让线程执行，同时还会告诉jvm去调用run方法。
 */
public class GetThreadNameDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//创建子类对象,拿到的是Thread-0
		myThread1 mt1=new myThread1();
		System.out.println(mt1.getName());
		
		//调用start方法
		mt1.start();
		
		//拿到的是Thread-1
		myThread1 mt2=new myThread1();
		System.out.println(mt2.getName());
		mt2.start();
		
		
	}

}



//定义一个类继承Thread
class myThread1 extends Thread{

	//重写run方法
@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 10; i++) {
			System.out.println(getName()+" "+i);
		}
	}
	
}





























































































