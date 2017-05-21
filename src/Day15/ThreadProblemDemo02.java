package Day15;


/*
 * 模拟电影售票,多个窗口一起卖100张票
 */
public class ThreadProblemDemo02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	ticketSales2 ts=new ticketSales2();
		
		Thread t1=new Thread(ts, "窗口1");
		Thread t2=new Thread(ts, "窗口2");
		t1.start();
		t2.start();
	}

}

/*
 * 卖票出现相同的票和负数的票,多线程在执行代码时有问题,导致数据错乱,被称为数据安全问题
 * 
 * 线程安全问题出现的原因:
 * 	1.多线程操作同一段代码
 * 	2.是否有共享数据
 * 	3.是否有多条语句操作共享数据
 * 
 * 使用同步解决线程安全问题
 * 	1.同步代码块
 * 	2.同步方法
 * 
 * 同步代码格式:
 * 	任意对象都可以充当锁
 * synchronized(锁){
 * 操作共享数据的代码 
 * 	}
 * 
 * 同步代码块里面的代码只能有一个线程执行
  同步代码块中的锁对象可以是任意的对象；但多个线程时，要使用同一个锁对象才能够保证线程安全。


 *	使用同步代码块会导致代码执行速度变慢.
 * 
 */
class ticketSales2 implements Runnable{
	int ticketNum=100;//共享100张票
	
	Object obj=new Object();
	@Override
	public void run() {
		// TODO Auto-generated method stub
		String name=Thread.currentThread().getName();
		
		while(true){//不断的卖票
			synchronized (new Object()) {
				
			
			if(ticketNum>0){//不用同一把锁,出现-1值,数据错乱
				try {
					Thread.sleep(10);//模拟延迟
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println(name+"卖了一张票,剩余票数是"+(--ticketNum));
			}else{
				break;//当票卖完时跳出循环
			}
			
			}
		}
	}
	
}



































































































