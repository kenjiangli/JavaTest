package Day14;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*
 * �̳߳�ʹ��Callable
 * 
 * 
 * Runnable��Callable������
 * Runnable:public abstract void run();
 * run����û�з���ֵ,�����쳣
 * 
 * callable: V call() throws Exeption;
 * 	call�����з���ֵ,���쳣
 * 
 */
public class CallableDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		//��ȡ�̳߳�
		ExecutorService pool=Executors.newFixedThreadPool(3);
		pool.submit(new myCallable());
		pool.submit(new myCallable());
		pool.submit(new myCallable());
		
		pool.shutdown();
		
	}

}

class myCallable implements Callable<Object>{

	@Override
	public Object call() throws Exception {
		// TODO Auto-generated method stub
	
		String name=Thread.currentThread().getName();
		for (int i = 0; i < 30; i++) {
			System.out.println(name+" "+i);
		}
		return null;
	}
	
}




























































































