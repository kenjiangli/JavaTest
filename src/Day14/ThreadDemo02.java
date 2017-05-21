package Day14;

/*
 * 定义一个类继承Thread
 * 重写run方法
 * 创建子类对象,即 创建线程对象
 * 调用start方法,开启线程并让线程执行,开启线程并让线程执行,同时告诉jvm去调用run方法
 */
public class ThreadDemo02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//3.创建子类对象
		myThread mt=new myThread();
		
		//4.调用start方法
		mt.start();
		
		
		//主线程
		for (int i = 0; i < 20; i++) {
			System.out.println("main"+i);
		}

	}
	


}


//1.定义一个类继承Thread
class myThread extends Thread {

	//2.重写run方法
	@Override
	public void run() {
		
		//子线程
		for (int i = 0; i < 20; i++) {
			System.out.println("myThread"+i);
		}
	}
	

	
	
}


































































































