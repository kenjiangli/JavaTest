package Day07;

public class ETestDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		//��ʹ��ʱ��ȷ���������
		//������
		Car<Person5> c1=new Car<Person5>();
		c1.setElement(new Person5());
		c1.getElement();
		
		//������
		Car<pig> c2=new Car<pig>();
		c2.setElement(new pig());
		c2.getElement();
	}

}

class Person5{
	
}

//���������ķ�������
class Car<E>{
	
	//��ȷ�������ʲô
	private E element;

	public E getElement() {
		return element;
	}

	public void setElement(E element) {
		this.element = element;
	}
	
	
}
class pig{
	
}



































