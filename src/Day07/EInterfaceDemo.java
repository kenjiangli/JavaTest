package Day07;
/*
 * ���ͽӿڵĶ���
 * 
 * 1.�ڶ���ʵ�����ʱ��ȷ������
 * 2.�ڶ���ʵ�����ʱ��ȷ������ (���ͽӿ�ʹ������)
 */
public class EInterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//ȷ������
		MyImpl1 m1=new MyImpl1();
		m1.show(" and show");
		
		//��ȷ������
	MyImpl2<Integer> m2=new MyImpl2<Integer>();
	m2.show(123);
	
	MyImpl2<String> m3=new MyImpl2<String>();
	m3.show("and show3");
	}

}

//�ڶ���ʵ�����ʱ��ȷ������
class MyImpl1 implements Inter<String>{

	@Override
	public void show(String e) {
		// TODO Auto-generated method stub
		System.out.println("show1"+e);
	}
	
}

//.�ڶ���ʵ�����ʱ��ȷ������
class MyImpl2<E> implements Inter<E>{

	@Override
	public void show(E e) {
		// TODO Auto-generated method stub
		System.out.println("show2"+e);
	}
	
}

//���ͽӿ�
interface Inter<E>{
	public abstract void show(E e);
}