package Day14;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*
 * 线程池:里面有一些线程.不让他死掉
 * 线程的创建和销毁是比较消耗新能.线程如果频繁的创建和销毁是不好的.我们应该让线程尽量多干活
 * 
 * 线程池的创建
 * Excutors类:
 *   static ExcutorService newFixedThreadPool(int nThreads)
 * 
 *创建一个可重用固定线程数的线程数
 *
 *线程池的使用
 *	ExecutorService类
 *		submit(Runnable task)
 * 		
 */
public class ThreadPoolDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//获取一个线程池,线程池里面有3个线程
		ExecutorService pool=Executors.newFixedThreadPool(3);
		
		//线程池不要去改里面线程的名称
		pool.submit(new myRunnable1());
		pool.submit(new myRunnable1());
		pool.submit(new myRunnable1());
		pool.submit(new myRunnable1());//只能拿到3个线程
		
		//关闭线程池
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



















































































































