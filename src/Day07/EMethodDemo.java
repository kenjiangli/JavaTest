package Day07;

public class EMethodDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//��ͨ����
		Test<String> t1=new Test<String>();
		t1.show(" and show");
		
		Test<Integer> t2=new Test<Integer>();
		t2.show(1234);
		
		Test<Boolean> t3=new Test<Boolean>();
		t3.show(false);
		Test<Double> t4=new Test<Double>();
		t4.show(2.33);
		
		//ʹ�÷��ͷ���
		Test<Double> t5=new Test<Double>();
		t5.show2(2.33);
		t5.show2(false);
		t5.show2(1234);
		t5.show2(" and show");
	}
	}


/**
 * ���ͷ���:
 * 	��ʽ :
 * ���η�<T> void ������(T ������){
 * }

	���ͷ������ŵ�:�������Ͳ���������һ���ܴ�������ʱ������Ӱ��,���Դ������������
 */

class Test<E>{
	public void show(E e){
		System.out.println("show"+e);
	}
	
	//���ͷ���
	public<T> void show2(T e){
		System.out.println("show2"+e);
	}
}




























































































































