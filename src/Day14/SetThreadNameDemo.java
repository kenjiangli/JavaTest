package Day14;

import javax.xml.ws.soap.MTOM;
//�����߳�����
public class SetThreadNameDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//�����������
		myThread2 mt=new myThread2();
		
		//�����̷߳���
		mt.setName("�߳�1");
		System.out.println(mt.getName());
		
		//����start����
		mt.start();
		
		//�����������
				myThread2 mt1=new myThread2();
				
				//�����̷߳���
				mt1.setName("�߳�2");
				System.out.println(mt1.getName());
				
				//����start����
				mt1.start();

	}

}

//����Thread��
class myThread2 extends Thread{

	//��дrun����
	@Override
	public void run() {
		// TODO Auto-generated method stub
	for (int i = 0; i < 5; i++) {
		System.out.println(getName()+" "+i);
	}
	}
	
}























































































