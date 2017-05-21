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
 */
public class SetAndGetDemo01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student15 s=new Student15();
		GetThread t1=new GetThread(s);
		SetThread t2=new SetThread(s);
		t1.start();
		t2.start();
	}

}

class GetThread extends Thread{
	private Student15 s;

	public GetThread(Student15 s) {
		super();
		this.s = s;
	}

	@Override
	public void run() {
		synchronized (s) {
			System.out.println(s.name+" "+s.age);
		}
	}


	
}
//����ѧ��������������
class SetThread extends Thread{
	private Student15 s;
private int x;
	public SetThread(Student15 s) {
		super();
		this.s = s;
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
	
		while(true){
			synchronized (s) {
				if(x%2==0){
					s.name="lau";
					s.age=24;
					
				}	else{
					s.name="janet";
					s.age=20;
				}
		}
			x++;
			}
			
	
	
}
}
class Student15{
	String name;
	int age;
}


































































































