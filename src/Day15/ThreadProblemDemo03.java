package Day15;


/*
 * ģ���Ӱ��Ʊ,�������һ����100��Ʊ
 */
public class ThreadProblemDemo03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	ticketSales3 ts=new ticketSales3();
		
		Thread t1=new Thread(ts, "����1");
		Thread t2=new Thread(ts, "����2");
		t1.start();
		t2.start();
	}

}

/*
 * ��Ʊ������ͬ��Ʊ�͸�����Ʊ,���߳���ִ�д���ʱ������,�������ݴ���,����Ϊ���ݰ�ȫ����
 * 
 * �̰߳�ȫ������ֵ�ԭ��:
 * 	1.���̲߳���ͬһ�δ���
 * 	2.�Ƿ��й�������
 * 	3.�Ƿ��ж�����������������
 * 
 * ʹ��ͬ������̰߳�ȫ����
 * 	1.ͬ�������
 * 	2.ͬ������
 * 
 * ͬ�������ʽ:
 * 	������󶼿��Գ䵱��
 * synchronized(��){
 * �����������ݵĴ��� 
 * 	}
 * 
 * ͬ�����������Ĵ���ֻ����һ���߳�ִ��
  ͬ��������е����������������Ķ��󣻵�����߳�ʱ��Ҫʹ��ͬһ����������ܹ���֤�̰߳�ȫ��


 *	ʹ��ͬ�������ᵼ�´���ִ���ٶȱ���.
 *
 *
 *ͬ��������ʽ:
 *���η� synchronized ����ֵ���� ������(�����б�){
 * ����
 *}

 * ͬ������ʹ�õ�����this
 * ��̬����ʹ�õ�����˭(����.class/SaleTicket.class) һ���õĺ���
 */
class ticketSales3 implements Runnable{
	int ticketNum=100;//����100��Ʊ
	
	Object obj=new Object();
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(this);
		
		while(true){//���ϵ���Ʊ
			sale();
		}
	}
	
	
	//��ͬ������齫������������д��붼��ס,�Ϳ��Կ���ͬ������
	public synchronized void sale() {
		// TODO Auto-generated method stub
		
		if(ticketNum>0){//����ͬһ����,����-1ֵ,���ݴ���
			try {
				Thread.sleep(10);//ģ���ӳ�
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()+"����һ��Ʊ,ʣ��Ʊ����"+(--ticketNum));
		}
	}
	
//	public void sale() {
//	synchronized (obj) {    
//		if (ticketNum > 0) {	// Ʊ����0  
//			// ģ���ӳ�
//			try {
//				Thread.sleep(10); 
//			} catch (InterruptedException e) {}
//			// --ticketNum:	ticketNum = ticketNum - 1;
//			System.out.println(Thread.currentThread().getName() + " ����һ��Ʊ,ʣ��Ʊ��" + --ticketNum); 
//		}
//	}
//}
	
}



































































































