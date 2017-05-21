package Day06;

import java.util.Date;

/*
 * 类Date 表示特定的瞬间,精确到毫秒
 * 
 * 构造方法:
 * Date():分配Date程序到这个的时间(精确到毫秒)
 * 
 *Date(long time):分配Date对象并初始化此对象,以表示自从标准基准
 *时间(称为"历元(epoch)"),即1970年1月1日 00:00:00 GMT）以来的指定毫秒数。
 */
public class DemoDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//method01();
		method02();
	}

	private static void method02() {
		// TODO Auto-generated method stub
		Date d=new Date();
		
		//单位是毫秒
		System.out.println(d);
		Date d2=new Date(1000);//从1970 1月1日00:00:00基础上加上参数date的毫秒值
		System.out.println(d2);
		
	}

	private static void method01() {
		// TODO Auto-generated method stub
		Date d1=new Date();
		System.out.println(d1);
		long time =d1.getTime();//获取毫秒值,从1970年开始到d1时间的毫秒值
		System.out.println(time);
		d1.setTime(0);//通过setTime设置一个毫秒值来修改date的时间
		System.out.println(d1);
	}

}
