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
 * 
 * 
 * ����5:��ͬ�����ݳ��ֶ��
 * 		ԭ��:CPUִ��GetThread,��ӡһ��.while(true)�л���Ŵ�ӡ
 * 
		�������:
			1.������(SetThread)
				�ж��Ƿ�������,��������ݾ͵ȴ�,û�����ݾ�����;����������֪ͨ������ȥ����
		
			2.������(GetThread)
				�ж��Ƿ�������,���û�о͵ȴ�,�����ݾ�����;����������֪ͨ������ȥ����

	�̵߳ĵȴ��ͻ���: �ȴ��ͻ��ѻ���
	
	Object:
		void wait(): �ĸ��߳�ִ�е�wait�ĸ��̵߳ȴ�
		void notify(): �����ڴ˶���������ϵȴ��ĵ����̡߳� 
 		void notifyAll(): �����ڴ˶���������ϵȴ��������̡߳� 

	Ϊʲô�ȴ��ͻ��ѵķ�����д��Thread����?wait,notify,notifyAll����������Ҫ��ȥ������3������.��������󶼿�����Ϊ��.
	
	IllegalMonitorStateException:�Ƿ�����״̬�쳣: wait,notify,notifyAll����������Ҫ��ȥ������3������
 */
public class SetAndGetDemo03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student1502 s=new Student1502();
		GetThread2 t1=new GetThread2(s);
		SetThread2 t2=new SetThread2(s);
		t1.start();
		t2.start();
	}

}

class GetThread2 extends Thread{
	private Student1502 s;

	public GetThread2(Student1502 s) {
		super();
		this.s = s;
	}

	@Override
	public void run() {
		
		while(true){
			synchronized (s) {
				if(!s.hasData){//�ȴ�
					try {
						s.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
			System.out.println(s.name+" "+s.age);
			
			//����������֪ͨ������ȥ����
			s.hasData=false;
			s.notify();
				}
				}
		}
	}


	
}
//����ѧ��������������
class SetThread2 extends Thread{
	private Student1502 s;
private int x;
	public SetThread2(Student1502 s) {
		super();
		this.s = s;
		
	}

	@Override
	public void run() {
	while(true){
		synchronized (s) {
			
			if(s.hasData){//�ȴ�
				try {
					s.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		if(x%2==0){
			 s.name="lau";//t1������nameͣ����,cpuȥִ��t2��
			     s.age=24;
						}	else{
					s.name="Janet";
					s.age=20;// t1 cpu�л���t2��ȥ	
					}
		x++;
		s.hasData=true;
		s.notify();
	}// �ͷ���// t1
		}
		
		
		}
	
	}
}
class Student1502{
	String name;
	int age;
	boolean hasData;//�Ƿ������ݵ���ʾ,Ĭ��Ϊfalse
}


































































































