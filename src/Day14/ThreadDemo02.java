package Day14;

/*
 * ����һ����̳�Thread
 * ��дrun����
 * �����������,�� �����̶߳���
 * ����start����,�����̲߳����߳�ִ��,�����̲߳����߳�ִ��,ͬʱ����jvmȥ����run����
 */
public class ThreadDemo02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//3.�����������
		myThread mt=new myThread();
		
		//4.����start����
		mt.start();
		
		
		//���߳�
		for (int i = 0; i < 20; i++) {
			System.out.println("main"+i);
		}

	}
	


}


//1.����һ����̳�Thread
class myThread extends Thread {

	//2.��дrun����
	@Override
	public void run() {
		
		//���߳�
		for (int i = 0; i < 20; i++) {
			System.out.println("myThread"+i);
		}
	}
	

	
	
}


































































































