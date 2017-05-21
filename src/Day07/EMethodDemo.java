package Day07;

public class EMethodDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//普通方法
		Test<String> t1=new Test<String>();
		t1.show(" and show");
		
		Test<Integer> t2=new Test<Integer>();
		t2.show(1234);
		
		Test<Boolean> t3=new Test<Boolean>();
		t3.show(false);
		Test<Double> t4=new Test<Double>();
		t4.show(2.33);
		
		//使用泛型方法
		Test<Double> t5=new Test<Double>();
		t5.show2(2.33);
		t5.show2(false);
		t5.show2(1234);
		t5.show2(" and show");
	}
	}


/**
 * 泛型方法:
 * 	格式 :
 * 修饰符<T> void 方法名(T 参数名){
 * }

	泛型方法的优点:它的类型不会像泛型类一样受创建对象时的类型影响,可以传入任意的类型
 */

class Test<E>{
	public void show(E e){
		System.out.println("show"+e);
	}
	
	//泛型方法
	public<T> void show2(T e){
		System.out.println("show2"+e);
	}
}




























































































































