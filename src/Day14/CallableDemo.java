package Day14;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*
 * 线程池使用Callable
 * 
 * 
 * Runnable和Callable的区别
 * Runnable:public abstract void run();
 * run方法没有返回值,不抛异常
 * 
 * callable: V call() throws Exeption;
 * 	call方法有返回值,抛异常
 * 
 */
public class CallableDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		//获取线程池
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




























































































