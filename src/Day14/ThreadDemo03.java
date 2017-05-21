package Day14;

import java.io.File;

public class ThreadDemo03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			//3.创建子类对象
		myFileThread mt=new myFileThread();
		
		//4.调用start方法
		mt.start();
		
		
	}

}

//1.定义一个类继[承Thread
class myFileThread extends Thread{

	//2.重写run方法
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		File file=new File("C://");//读取c盘文件夹
		String[] string=file.list();
		for (String string2 : string) {
			System.out.println(string2);
		}
	}
	
}




































































































