package Day05;
/*
 * 单例设计模式:在运行过程中,一个类就只产生一个对象
 * 		1.这个类由自己来创建对象
 * 		1.1将构造方法私有化别人无法创建对象
 * 		1.2自己来创建对象,在成员变量的位置创建对象
 * 
 * 	2.需要提供公共的访问方式,给别人使用
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
	//将方法私有化
	private Student0501(){
		
	}
	
	//自己创建对象
	private static final Student0501 s=new Student0501();//在类加载的时候就创建,为懒汉式
	
	//提供公共的访问方式
	//方法需要定义为static,如果不定义static需要对象调用方法,别人无法创建对象
	public static Student0501 getStudent0501(){
		return s;
		
	}
}


class Dog0501{
	
	//构造方法私有化
	private Dog0501(){
		
	}
	
	//自己创建对象
	private static Dog0501 d=null;
	
	//提供公共的访问
	public static Dog0501 getDog0501(){
		//第一次调用的时候d==null.就创建了Dog
		if(d==null){//用到的时候才创建.为懒汉式
			d=new Dog0501();
		}
		return d;
		
	}
}







































































