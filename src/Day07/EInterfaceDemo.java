package Day07;
/*
 * 泛型接口的定义
 * 
 * 1.在定义实现类的时候确定泛型
 * 2.在定义实现类的时候不确定泛型 (泛型接口使用这种)
 */
public class EInterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//确定泛型
		MyImpl1 m1=new MyImpl1();
		m1.show(" and show");
		
		//不确定泛型
	MyImpl2<Integer> m2=new MyImpl2<Integer>();
	m2.show(123);
	
	MyImpl2<String> m3=new MyImpl2<String>();
	m3.show("and show3");
	}

}

//在定义实现类的时候确定泛型
class MyImpl1 implements Inter<String>{

	@Override
	public void show(String e) {
		// TODO Auto-generated method stub
		System.out.println("show1"+e);
	}
	
}

//.在定义实现类的时候不确定泛型
class MyImpl2<E> implements Inter<E>{

	@Override
	public void show(E e) {
		// TODO Auto-generated method stub
		System.out.println("show2"+e);
	}
	
}

//泛型接口
interface Inter<E>{
	public abstract void show(E e);
}