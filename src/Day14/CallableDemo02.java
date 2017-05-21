package Day14;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/*
 * Ҫ��ͨ���̳߳��е��̶߳���ʹ��Callable�ӿڴ��벻ͬ������.��1��n�ĺ�.��������ĺͷ��ػ���
 * 
 * Future:
 * 		 V get()��ȡcall�����ķ���ֵ�� 
 */
public class CallableDemo02 {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		// TODO Auto-generated method stub
		
		//Future<Integer>:callִ����ɵĽ�������Future��
		ExecutorService pool=Executors.newFixedThreadPool(3);
		Future<Integer> future=pool.submit(new myCallable1(100));
		System.out.println(future.get());//future.get() ���б�Ҫ���ȴ�������ɣ�Ȼ���ȡ������

	}

}

class myCallable1 implements Callable<Integer>{

	//дһ�����췽��
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

































































































