package Day14;

import javax.xml.ws.soap.MTOM;
//设置线程名称
public class SetThreadNameDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//创建子类对象
		myThread2 mt=new myThread2();
		
		//设置线程方法
		mt.setName("线程1");
		System.out.println(mt.getName());
		
		//调用start方法
		mt.start();
		
		//创建子类对象
				myThread2 mt1=new myThread2();
				
				//设置线程方法
				mt1.setName("线程2");
				System.out.println(mt1.getName());
				
				//调用start方法
				mt1.start();

	}

}

//定义Thread类
class myThread2 extends Thread{

	//重写run方法
	@Override
	public void run() {
		// TODO Auto-generated method stub
	for (int i = 0; i < 5; i++) {
		System.out.println(getName()+" "+i);
	}
	}
	
}























































































