package Day07;

import java.util.ArrayList;

public class HighEDemo {
public static void main(String[] args) {
	//�ھ������͵�ʱ������������������Ҫһ��
	ArrayList<Object> a1=new ArrayList<Object>();
//	ArrayList<Object> a2=new ArrayList<Animal1>();
//	ArrayList<Object> a2=new ArrayList<Dog1>();
//	ArrayList<Object> a2=new ArrayList<Cat1>();

	//һ��ʹ������Ϊ��������
	//?��ʾ�ұ߷�ʲô���Ͷ�����,����ͨ�÷�
	ArrayList<?> a5=new ArrayList<Object>();
	ArrayList<?> a6=new ArrayList<Animal1>();
	ArrayList<?> a7=new ArrayList<Dog1>();
	ArrayList<?> a8=new ArrayList<Cat1>();
	
	//? extends E:�����޶�,��E�������඼����
	//ArrayList<? extends Animal1> a9=new ArrayList<Object>();
	ArrayList<? extends Animal1> a10=new ArrayList<Animal1>();
	ArrayList<? extends Animal1> a11=new ArrayList<Dog1>();
	ArrayList<? extends Animal1> a12=new ArrayList<Cat1>();
	
	// ? super E: �����޶�,E���丸�඼��
	ArrayList<? super Animal1> a13 = new ArrayList<Object>();		
	ArrayList<? super Animal1> a14 = new ArrayList<Animal1>();		
//	ArrayList<? super Animal> a15 = new ArrayList<Dog>();		
//	ArrayList<? super Animal> a16 = new ArrayList<Cat>();	
}
}
class Animal1{
	
}
class Dog1 extends Animal1{
	
}
class Cat1 extends Animal1{
	
}








































