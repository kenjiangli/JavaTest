package Day05;

import java.util.Scanner;

/*
 * throw:����һ���쳣
 * ��ʽ:throw new �쳣��();
 * 
 * throws��throw������
 * 
 * throws:
 * 1.throws�����ڷ�������()����.��ʾ�����쳣,���߱����������
 * 2.throws���Ը�����쳣
 * 3.throws�������쳣������
 * 
 * throw:
 * 1.throw���ڷ����ڵ�ĳ�д���,��ʾ����һ���쳣
 * 2.throwֻ�ܸ�һ���쳣����
 * 3.throw�������쳣����
 */
public class ThrowExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
	Scanner sc= new Scanner(System.in);
	System.out.println("�������˺�");
	String account=sc.next();
	System.out.println("����������");
	int age=sc.nextInt();
	
	try {
		regist(account,age);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		System.out.println("����С��18");
	}
	}

	private static void regist(String account, int age) throws Exception {
		// TODO Auto-generated method stub
		if(age<18){
			//����һ���쳣
			throw new Exception("����С��18,��ֹע��");
		}
		
	}

}
