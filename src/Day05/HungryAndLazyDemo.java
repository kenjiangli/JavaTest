package Day05;
/*
 * �������ģʽ:�����й�����,һ�����ֻ����һ������
 * 		1.��������Լ�����������
 * 		1.1�����췽��˽�л������޷���������
 * 		1.2�Լ�����������,�ڳ�Ա������λ�ô�������
 * 
 * 	2.��Ҫ�ṩ�����ķ��ʷ�ʽ,������ʹ��
 * 
 * 
 */
public class HungryAndLazyDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student0501 s1=Student0501.getStudent0501();
		System.out.println(s1);
		Student0501 s2=Student0501.getStudent0501();
		System.out.println(s2);
		Student0501 s3=Student0501.getStudent0501();
		System.out.println(s3);
		
		Dog0501 d=Dog0501.getDog0501();
		System.out.println(d);
	}

}

class Student0501{
	//������˽�л�
	private Student0501(){
		
	}
	
	//�Լ���������
	private static final Student0501 s=new Student0501();//������ص�ʱ��ʹ���,Ϊ����ʽ
	
	//�ṩ�����ķ��ʷ�ʽ
	//������Ҫ����Ϊstatic,���������static��Ҫ������÷���,�����޷���������
	public static Student0501 getStudent0501(){
		return s;
		
	}
}


class Dog0501{
	
	//���췽��˽�л�
	private Dog0501(){
		
	}
	
	//�Լ���������
	private static Dog0501 d=null;
	
	//�ṩ�����ķ���
	public static Dog0501 getDog0501(){
		//��һ�ε��õ�ʱ��d==null.�ʹ�����Dog
		if(d==null){//�õ���ʱ��Ŵ���.Ϊ����ʽ
			d=new Dog0501();
		}
		return d;
		
	}
}







































































