package Day07;

public class ETestDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		//在使用时明确具体的类型
		//车放人
		Car<Person5> c1=new Car<Person5>();
		c1.setElement(new Person5());
		c1.getElement();
		
		//车放猪
		Car<pig> c2=new Car<pig>();
		c2.setElement(new pig());
		c2.getElement();
	}

}

class Person5{
	
}

//不清楚具体的泛型类型
class Car<E>{
	
	//不确定车里放什么
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



































