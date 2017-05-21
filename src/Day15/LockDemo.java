package Day15;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import javax.swing.plaf.synth.SynthSpinnerUI;

/*
 * Lock接口:
 * 		|- ReentrantLock
 * 	
 * Lock方法:
 * 		void lock(): 获取锁
        void unlock(): 释放锁
 */
public class LockDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SaleTiickets st=new SaleTiickets();
		Thread t1=new Thread(st, "窗口1");
		Thread t2=new Thread(st, "窗口1");
		Thread t3=new Thread(st, "窗口1");
		t1.start();
		t2.start();
		t3.start();
	}

}
class SaleTiickets implements Runnable{
	int ticketNum=100;
	Object obj=new Object();
	
	Lock lock=new ReentrantLock();//锁
	String name=Thread.currentThread().getName();
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		while(true){
			lock.lock();//获取锁
			
			if(ticketNum>0){
				System.out.println(name+"卖了一张票,剩余票数"+--ticketNum);
			}else{
				break;
			}
			lock.unlock();
			
		}
	}
	
}






























































































