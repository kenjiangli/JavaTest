package Day05;

import java.util.Scanner;

/*
 * throw:产生一个异常
 * 格式:throw new 异常名();
 * 
 * throws和throw的区别
 * 
 * throws:
 * 1.throws是用在方法参数()后面.表示声明异常,告诉别人这个方法
 * 2.throws可以跟多个异常
 * 3.throws后面是异常的类名
 * 
 * throw:
 * 1.throw是在方法内的某行代码,表示产生一个异常
 * 2.throw只能跟一个异常对象
 * 3.throw后面是异常对象
 */
public class ThrowExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
	Scanner sc= new Scanner(System.in);
	System.out.println("请输入账号");
	String account=sc.next();
	System.out.println("请输入年龄");
	int age=sc.nextInt();
	
	try {
		regist(account,age);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		System.out.println("年龄小于18");
	}
	}

	private static void regist(String account, int age) throws Exception {
		// TODO Auto-generated method stub
		if(age<18){
			//产生一个异常
			throw new Exception("年龄小于18,禁止注册");
		}
		
	}

}
