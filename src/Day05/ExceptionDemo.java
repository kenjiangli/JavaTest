package Day05;

import java.security.cert.CertificateException;

import javax.management.modelmbean.XMLParseException;

public class ExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
/*
 * ע��,����ʹ�ñ���ʱ�쳣,ʹ������ʱ�쳣������Ч��,��Ϊ����ʱ�쳣�ڱ����ʱ����Բ�����
 * 
 * 1.������д���෽��ʱ,��������׳��͸�����ͬ���쳣����,�����෽���쳣ʱ���෽���쳣�Ļ���
 * 2.�����׳����쳣���ܱȸ����,Ҳ�����Ǹ���û�е��쳣
 * 3.����û���׳��쳣ʱ,����Ҳ�����׳��쳣,���������ڲ����쳣ֻ��try...catch'
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











































































