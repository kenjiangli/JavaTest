package Day15;


/*
 * ģ���Ӱ��Ʊ,�������һ����100��Ʊ
 */
public class ThreadProblemDemo02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	ticketSales2 ts=new ticketSales2();
		
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
 */
class ticketSales2 implements Runnable{
	int ticketNum=100;//����100��Ʊ
	
	Object obj=new Object();
	@Override
	public void run() {
		// TODO Auto-generated method stub
		String name=Thread.currentThread().getName();
		
		while(true){//���ϵ���Ʊ
			synchronized (new Object()) {
				
			
			if(ticketNum>0){//����ͬһ����,����-1ֵ,���ݴ���
				try {
					Thread.sleep(10);//ģ���ӳ�
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println(name+"����һ��Ʊ,ʣ��Ʊ����"+(--ticketNum));
			}else{
				break;//��Ʊ����ʱ����ѭ��
			}
			
			}
		}
	}
	
}



































































































