package Day14;
//��ȡ��ǰ�߳�
public class getThreadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		myThread3 mt=new myThread3();
		mt.start();
		
		Thread tt=Thread.currentThread();//���ضԵ�ǰ����ִ�е��̶߳�������á� 
		System.out.println(tt.getName());//��ȡ��ǰ�̵߳�����
	}

}

class myThread3 extends Thread{

	@Override
	public void run() {
		// TODO Auto-generated method stub

		Thread t=Thread.currentThread();//���ضԵ�ǰ����ִ�е��̶߳�������á� 
		System.out.println(t.getName());//��ȡ��ǰ�̵߳�����
	}
	
	
}












































































































































