package Day15;
/*
 * 死锁:多个线程在同步代码块里面拿着不同的锁,出现无限等待
 * 
 * 死锁出现的条件
 * 1.多个线程,有多把锁
 * 3.多个同步代码块嵌套
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




























































































































































