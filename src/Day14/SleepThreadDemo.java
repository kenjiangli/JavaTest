package Day14;
/*
 * Thread��
 *  static void sleep(long millis):
 *  �õ�ǰ�߳�˯��millis����,�ĸ��߳�ִ�е�������,�Ǹ��߳̾�˯��
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
				Thread.sleep(200);//����˯�����￪ʼ
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				
				}
			if(i==8||i==20){
				try {
					Thread.sleep(3000);//����˯�����￪ʼ
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
			System.out.println(getName()+" "+i);
			
		}
		
		
	}
	
}













































































































