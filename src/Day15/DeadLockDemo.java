package Day15;
/*
 * ����:����߳���ͬ��������������Ų�ͬ����,�������޵ȴ�
 * 
 * �������ֵ�����
 * 1.����߳�,�ж����
 * 3.���ͬ�������Ƕ��
 */
public class DeadLockDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DeadLock dl=new DeadLock();
		Thread t=new Thread(dl);
		Thread t1=new Thread(dl);
		t.start();
		t1.start();

	}

}

class DeadLock implements Runnable{
	private Object lockA=new Object();
	private Object lockB=new Object();
	String name=Thread.currentThread().getName();
	@Override
	public void run() {
		// TODO Auto-generated method stub
		synchronized (lockA) {
		System.out.println(name+"lockA");
		synchronized (lockB) {
			System.out.println(name+"lockB");	
			}
		}
		
		synchronized (lockB) {
			System.out.println(name+"lockBB");
			synchronized (lockA) {
				System.out.println(name+"lockAA");	
				}
			}
			
		
	}
	

	
}




























































































































































