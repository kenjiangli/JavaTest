package Day14;
/*
 * Thread类
 *  static void sleep(long millis):
 *  让当前线程睡眠millis毫秒,哪个线程执行到这句代码,那个线程就睡眠
 */
public class SleepThreadDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		sleepThread st=new sleepThread();
		st.start();
		
		for (int i = 0; i < 30; i++) {
			Thread.sleep(400);
			System.out.println(Thread.currentThread().getName()+" "+i);
		}
	}

}

class sleepThread extends Thread{

	@Override
	public void run() {
		
		for (int i = 0; i < 30; i++) {
			try {
				Thread.sleep(200);//哪里睡眠哪里开始
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				
				}
			if(i==8||i==20){
				try {
					Thread.sleep(3000);//哪里睡眠哪里开始
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
			System.out.println(getName()+" "+i);
			
		}
		
		
	}
	
}













































































































