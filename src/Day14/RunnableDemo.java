package Day14;

/*
 * Thread类:
 * 	构造方法:Thread(Runnable target)
 * 
 * 线程的创建方法:实现Runnable接口
 * 
 * 1.定义一个类实现Runnable接口
 * 2.重写run方法
 * 3.创建实现类对象
 * 4.创建Thread对象.并传入Runnable类型的对象
 * 5.调用start方法
 * 
 * Runnable方式和继承Thread的方式对比,推荐使用实现Runnable方式
 * 1.java是单继承,继承了Thread类就不能再继承其他类
 * 2.继承Thread方式,将线程的创建和线程的任务,放在统一各类中,耦合性非常强
 * 3.实现Runnable方式,将线程的创建和线程任务的分离,耦合性比较小
 * 
 * Thread类:
	private Runnable target = mr;

    public Thread(Runnable target) {
        init(null, target, "Thread-" + nextThreadNum(), 0);
    }
    
    private void init(ThreadGroup g, Runnable target, String name,
                      long stackSize) {
        init(g, target, name, stackSize, null);
    }
    
    private void init(ThreadGroup g, Runnable target, String name,
                      long stackSize, AccessControlContext acc) {
               ...
               this.target = target;       
    }
    
    @Override
    public void run() {
        if (target != null) {
            target.run();
        }
    }
 * 
 * 
 */

public class RunnableDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//3.创建实现类对象
		myRunnable mr=new myRunnable();
		
		//4.创建Thread对象,并传入Runnable类型的对象
		Thread t=new Thread(mr);
		
		//5.调用start方法
		t.start();//调用系统资源,创建新的线程,新的线程会执行t的run方法
	}

}

//1.定义一个类实现Runnable接口
class myRunnable implements Runnable{

	//2.重写run方法
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		//要在子线程上指向的代码
		//Runnable没有getName方法,getName是Thread类的方法
		String name=Thread.currentThread().getName();
			for (int i = 0; i < 30; i++) {
				System.out.println(name+" "+i);
			}
	}
	
}





























































































