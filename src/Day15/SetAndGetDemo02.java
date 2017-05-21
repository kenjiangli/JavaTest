package Day15;



/*
 *  ����:һ���߳�����ѧ������,һ���̻߳�ȡѧ������,����һ������,��ӡһ������
 *  
 *  ѧ����,ѧ�������������̹߳��������
 *  setThread:s����ѧ��������������
 *  getThread:��ȡѧ��������������
 *  
 *  ������:
 *  
 *   * ����1:��� null -- 0;
 * 		ԭ��ÿ��run������ȥ����ѧ��.����2��ѧ��.��Ҫʹ��ͬһ��ѧ��.
 * 
 *  * ����2:ֻ�ܴ�ӡһ��
 * 		��Ҫ�ﵽ��ͣ������,��ͣ�Ĵ�ӡ
 * 
 * ����3:���úͻ�ȡ����while(true)�����2������
 * 		1.��ͬ�����ݳ��ֶ��
 * 		2.���������䲻ƥ�� 
 * 
 * ����4���������䲻ƥ��(�̰߳�ȫ����):
 * 		ԭ��:�����������ǹ�������.���߳�������,Ҳ���߳��ڻ�ȡ
 * 			1.����߳�
 * 			2.�й�������(����������)
 * 			3.�ж�����������������
 * 
 * 
 * 		�������:�������������ݵĴ���ʹ��ͬ��������������
 * 		��Ҫ�ﵽ����д��ʱ�������˶�.���˶���ʱ��������д
 * 		��Ҫʹ��ͬһ��������Ϊ��(s).
 */
public class SetAndGetDemo02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student1501 s=new Student1501();
		GetThread1 t1=new GetThread1(s);
		SetThread1 t2=new SetThread1(s);
		t1.start();
		t2.start();
	}

}

class GetThread1 extends Thread{
	private Student1501 s;

	public GetThread1(Student1501 s) {
		super();
		this.s = s;
	}

	@Override
	public void run() {
		
		while(true){
			synchronized (s) {
			System.out.println(s.name+" "+s.age);
		}
		}
	}


	
}
//����ѧ��������������
class SetThread1 extends Thread{
	private Student1501 s;
private int x;
	public SetThread1(Student1501 s) {
		super();
		this.s = s;
		
	}

	@Override
	public void run() {
		

		// TODO Auto-generated method stub
		
			
		
	while(true){
		synchronized (s) {
		if(x%2==0){
			 s.name="lau";//t1������nameͣ����,cpuȥִ��t2��
			     s.age=24;
						}	else{
					s.name="Janet";
					s.age=20;// t1 cpu�л���t2��ȥ

	
}
		x++;
	}// �ͷ���// t1
		
		}
	
	}
}
class Student1501{
	String name;
	int age;
}


































































































