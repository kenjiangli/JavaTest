package Day07;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

/*
 *  ����һ��Person��,��������������������,���ɶ�Ӧ��
 *  	getter/setter�����Լ����ι���,�ղι���,����һ��������,
 * 
 * �ڲ������ж���һ������,�����д洢���Person����,����
 * �����ü���,�ֱ��ӡ����Щ�˵�����������,����ͳ�Ƴ���Щ�˵��������ӡ�ڿ���̨��
 */
public class IteratorDemo02 {
public static void main(String[] args) {
	
	//���弯��
	ArrayList<Person2> array=new ArrayList<Person2>();
	Person2 p1=new Person2("sebs", 27);
	Person2 p2=new Person2("Mia",25);
	Person2 p3=new Person2("jobs", 30);
	array.add(p1);
	array.add(p2);
	array.add(p3);
	
	//������
	int tage=0;
	
	//ʹ�õ��������ϱ���
	//Iterator<Person2> itr=array.iterator();
	ListIterator<Person2> itr=array.listIterator();//����ListIterator
	while(itr.hasNext()){
		Person2 p=itr.next();
		System.out.println(p.getName()+" "+p.getAge());
		tage+=p.getAge();
		
		//��������25��ʱ,��Ӷ�һ����
		if(p.getAge()==25){
			Person2 p4=new Person2("shelton", 29); 
			//array.add(p4);  java.util.ConcurrentModificationException�����޸��쳣
			//                �����ԭ��,�������ڻ�ȡԪ��,��ʱ����һ��Ԫ��,��������֪��
			//				  ����ֱ����array.add ȥ���Ԫ��,��Ҫʹ�õ�����ȥ���Ԫ����Ҫʹ��Listר�õĵ�����ListIterator
			itr.add(p4);
			
			itr.previous();//�����б��е�ǰһ��Ԫ�ء�
		}
		
	}
	System.out.println(tage);
	
	//�ٴε���һ��
	Iterator<Person2> itr2=array.iterator();
	while(itr2.hasNext()){
		Person2 p=itr2.next();
		System.out.println(p.getName()+" "+p.getAge());
}

}
}
//����һ��Person��
class Person2{
	private String name;
	private int age;
	public Person2() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Person2(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
}

