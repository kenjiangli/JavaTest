package Day14;
/*
 * 匿名内部类格式
 * new 父类/接口(){
 *	 //重写方法
 * }
 */
public class InnerClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1.匿名内部类创建Thread的子类对象
		new Thread(){

			@Override
			public void run() {
				// TODO Auto-generated method stub
				for (int i = 0; i < 200; i++) {
					System.out.println(getName()+" "+i);
				}
			}
			
		}.start();
		
		//2.匿名内部类创建Runnable实现类
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
		
		//3.匿名内部类创建Runnable实现类,并且直接传递给Thread类的构造
		
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








































































































