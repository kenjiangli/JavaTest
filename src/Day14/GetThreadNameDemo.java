package Day14;
/*
 * 1 ����һ����̳�Thread��
	2 ��дrun������
	3 ����������󣬾��Ǵ����̶߳���
	4 ����start�����������̲߳����߳�ִ�У�ͬʱ�������jvmȥ����run������
 */
public class GetThreadNameDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//�����������,�õ�����Thread-0
		myThread1 mt1=new myThread1();
		System.out.println(mt1.getName());
		
		//����start����
		mt1.start();
		
		//�õ�����Thread-1
		myThread1 mt2=new myThread1();
		System.out.println(mt2.getName());
		mt2.start();
		
		
	}

}



//����һ����̳�Thread
class myThread1 extends Thread{

	//��дrun����
@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 10; i++) {
			System.out.println(getName()+" "+i);
		}
	}
	
}





























































































