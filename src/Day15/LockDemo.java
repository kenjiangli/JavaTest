package Day15;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import javax.swing.plaf.synth.SynthSpinnerUI;

/*
 * Lock�ӿ�:
 * 		|- ReentrantLock
 * 	
 * Lock����:
 * 		void lock(): ��ȡ��
        void unlock(): �ͷ���
 */
public class LockDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SaleTiickets st=new SaleTiickets();
		Thread t1=new Thread(st, "����1");
		Thread t2=new Thread(st, "����1");
		Thread t3=new Thread(st, "����1");
		t1.start();
		t2.start();
		t3.start();
	}

}
class SaleTiickets implements Runnable{
	int ticketNum=100;
	Object obj=new Object();
	
	Lock lock=new ReentrantLock();//��
	String name=Thread.currentThread().getName();
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		while(true){
			lock.lock();//��ȡ��
			
			if(ticketNum>0){
				System.out.println(name+"����һ��Ʊ,ʣ��Ʊ��"+--ticketNum);
			}else{
				break;
			}
			lock.unlock();
			
		}
	}
	
}






























































































