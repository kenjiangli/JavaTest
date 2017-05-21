package Day14;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/*
 * 要求：通过线程池中的线程对象，使用Callable接口传入不同的数字.求1到n的和.并将计算的和返回回来
 * 
 * Future:
 * 		 V get()获取call方法的返回值。 
 */
public class CallableDemo02 {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		// TODO Auto-generated method stub
		
		//Future<Integer>:call执行完成的结果会放在Future中
		ExecutorService pool=Executors.newFixedThreadPool(3);
		Future<Integer> future=pool.submit(new myCallable1(100));
		System.out.println(future.get());//future.get() 如有必要，等待计算完成，然后获取其结果。

	}

}

class myCallable1 implements Callable<Integer>{

	//写一个构造方法
	private int end;
	
	public myCallable1(int end) {
		super();
		this.end = end;
	}

	@Override
	public Integer call() throws Exception {
		// TODO Auto-generated method stub
		
		int sum=0;
		for (int i = 0; i <=end; i++) {
			sum+=i;
		}
		return sum;
	}
	
}

































































































