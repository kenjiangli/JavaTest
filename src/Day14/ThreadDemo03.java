package Day14;

import java.io.File;

public class ThreadDemo03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			//3.�����������
		myFileThread mt=new myFileThread();
		
		//4.����start����
		mt.start();
		
		
	}

}

//1.����һ�����[��Thread
class myFileThread extends Thread{

	//2.��дrun����
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		File file=new File("C://");//��ȡc���ļ���
		String[] string=file.list();
		for (String string2 : string) {
			System.out.println(string2);
		}
	}
	
}




































































































