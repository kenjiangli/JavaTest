package Day14;
//获取当前线程
public class getThreadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		myThread3 mt=new myThread3();
		mt.start();
		
		Thread tt=Thread.currentThread();//返回对当前正在执行的线程对象的引用。 
		System.out.println(tt.getName());//获取当前线程的名称
	}

}

class myThread3 extends Thread{

	@Override
	public void run() {
		// TODO Auto-generated method stub

		Thread t=Thread.currentThread();//返回对当前正在执行的线程对象的引用。 
		System.out.println(t.getName());//获取当前线程的名称
	}
	
	
}












































































































































