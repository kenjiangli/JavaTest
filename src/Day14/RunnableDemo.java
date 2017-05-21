package Day14;

/*
 * Thread��:
 * 	���췽��:Thread(Runnable target)
 * 
 * �̵߳Ĵ�������:ʵ��Runnable�ӿ�
 * 
 * 1.����һ����ʵ��Runnable�ӿ�
 * 2.��дrun����
 * 3.����ʵ�������
 * 4.����Thread����.������Runnable���͵Ķ���
 * 5.����start����
 * 
 * Runnable��ʽ�ͼ̳�Thread�ķ�ʽ�Ա�,�Ƽ�ʹ��ʵ��Runnable��ʽ
 * 1.java�ǵ��̳�,�̳���Thread��Ͳ����ټ̳�������
 * 2.�̳�Thread��ʽ,���̵߳Ĵ������̵߳�����,����ͳһ������,����Էǳ�ǿ
 * 3.ʵ��Runnable��ʽ,���̵߳Ĵ������߳�����ķ���,����ԱȽ�С
 * 
 * Thread��:
	private Runnable target = mr;

    public Thread(Runnable target) {
        init(null, target, "Thread-" + nextThreadNum(), 0);
    }
    
    private void init(ThreadGroup g, Runnable target, String name,
                      long stackSize) {
        init(g, target, name, stackSize, null);
    }
    
    private void init(ThreadGroup g, Runnable target, String name,
                      long stackSize, AccessControlContext acc) {
               ...
               this.target = target;       
    }
    
    @Override
    public void run() {
        if (target != null) {
            target.run();
        }
    }
 * 
 * 
 */

public class RunnableDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//3.����ʵ�������
		myRunnable mr=new myRunnable();
		
		//4.����Thread����,������Runnable���͵Ķ���
		Thread t=new Thread(mr);
		
		//5.����start����
		t.start();//����ϵͳ��Դ,�����µ��߳�,�µ��̻߳�ִ��t��run����
	}

}

//1.����һ����ʵ��Runnable�ӿ�
class myRunnable implements Runnable{

	//2.��дrun����
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		//Ҫ�����߳���ָ��Ĵ���
		//Runnableû��getName����,getName��Thread��ķ���
		String name=Thread.currentThread().getName();
			for (int i = 0; i < 30; i++) {
				System.out.println(name+" "+i);
			}
	}
	
}





























































































