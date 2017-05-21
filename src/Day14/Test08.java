package Day14;
/*8.一共有1000张电影票,可以在两个窗口领取,要求:请用多线程模拟领票过程并打印剩余电影票的数量

	多个窗口同时卖票,采用多线程模拟,卖票的逻辑使用Runnable接口实现类来模拟
*/

public class Test08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ticketSales ts=new ticketSales();
		
		Thread t1=new Thread(ts, "窗口1");
		Thread t2=new Thread(ts, "窗口2");
		t1.start();
		t2.start();
	}

}
class ticketSales implements Runnable{
	int ticketNum=1000;//共享1000张票
	@Override
	public void run() {
		// TODO Auto-generated method stub
		String name=Thread.currentThread().getName();
		
		while(true){//不断的卖票
			if(ticketNum>0){
				
				System.out.println(name+"卖了一张票,剩余票数是"+(--ticketNum));
			}else{
				break;//当票卖完时跳出循环
			}
		}
	}
	
}
