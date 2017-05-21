package Day14;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*
 * �̳߳�:������һЩ�߳�.����������
 * �̵߳Ĵ����������ǱȽ���������.�߳����Ƶ���Ĵ����������ǲ��õ�.����Ӧ�����߳̾�����ɻ�
 * 
 * �̳߳صĴ���
 * Excutors��:
 *   static ExcutorService newFixedThreadPool(int nThreads)
 * 
 *����һ�������ù̶��߳������߳���
 *
 *�̳߳ص�ʹ��
 *	ExecutorService��
 *		submit(Runnable task)
 * 		
 */
public class ThreadPoolDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//��ȡһ���̳߳�,�̳߳�������3���߳�
		ExecutorService pool=Executors.newFixedThreadPool(3);
		
		//�̳߳ز�Ҫȥ�������̵߳�����
		pool.submit(new myRunnable1());
		pool.submit(new myRunnable1());
		pool.submit(new myRunnable1());
		pool.submit(new myRunnable1());//ֻ���õ�3���߳�
		
		//�ر��̳߳�
		pool.shutdown();

	}

}

class myRunnable1 implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		String name=Thread.currentThread().getName();
		for (int i = 0; i < 30; i++) {
			System.out.println(name+" "+i);
		}
		
	}
	
}



















































































































