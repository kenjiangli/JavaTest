package Day14;
/*
 * �����ڲ����ʽ
 * new ����/�ӿ�(){
 *	 //��д����
 * }
 */
public class InnerClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1.�����ڲ��ഴ��Thread���������
		new Thread(){

			@Override
			public void run() {
				// TODO Auto-generated method stub
				for (int i = 0; i < 200; i++) {
					System.out.println(getName()+" "+i);
				}
			}
			
		}.start();
		
		//2.�����ڲ��ഴ��Runnableʵ����
		Runnable r=new Runnable() {
			
			@Override
			public void run() {
				String name=Thread.currentThread().getName();
				
				for (int i = 0; i < 200; i++) {
					System.out.println(name+" "+i);
				}
				
			}
		};
		new Thread(r).start();
		
		//3.�����ڲ��ഴ��Runnableʵ����,����ֱ�Ӵ��ݸ�Thread��Ĺ���
		
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				
				String name=Thread.currentThread().getName();
				for (int j = 0; j < 200; j++) {
					System.out.println(name+" "+j);
				}
			
			}
		}).start();
	}

}








































































































