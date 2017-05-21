package Day05;

import java.security.cert.CertificateException;

import javax.management.modelmbean.XMLParseException;

public class ExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
/*
 * 注意,必须使用编译时异常,使用运行时异常看不出效果,因为运行时异常在编译的时候可以不处理
 * 
 * 1.子类重写父类方法时,子类必须抛出和父类相同的异常方法,或子类方法异常时父类方法异常的积累
 * 2.子类抛出的异常不能比父类多,也不能是父类没有的异常
 * 3.父类没有抛出异常时,子类也不能抛出异常,若果子类内部有异常只有try...catch'
 */
class Fu{
	public void test01() throws CertificateException{
		
	}
	public void test02() throws CertificateException,XMLParseException{
		
	}
	public void test03(){
		
	}
}
class Zi extends Fu{


	@Override
	public void test01() throws CertificateException {
		// TODO Auto-generated method stub
		super.test01();
	}

	@Override
	public void test02() throws CertificateException, XMLParseException {
		// TODO Auto-generated method stub
		super.test02();
	}

	@Override
	public void test03() {
		// TODO Auto-generated method stub
		super.test03();
	}

	public Zi() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}











































































