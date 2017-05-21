package Day06;
/*
 * Calendar的创建
 * 		Calendar cal=Calendar.getInstance();
 * 
 * 普通方法:
 * abstract void add(int field,int amount):根据日历的规则,为给定的日历字段添加或减去指定的时间量
 * int get(int field):返回给定日历字段的值(年/月/日/时/分/秒)
 * void set(int field,int value):将给定的日历字段设置为给定值
 * 
 *Date getTime();返回一个表示此Calendar时间值(从历元至现在的毫秒偏移量)的Date对象,毫秒值参照1970年
 * 
 */
import java.util.Calendar;
import java.util.Date;

public class DemoCalendar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Calendar cal=Calendar.getInstance();
		//System.out.println(cal);
		
		//method01();
		//method02();
		//method03();
		method04();
	}
	
	//add,在当前时间的基础上添加对应字段的时间,整数表示添加,负数表示减少
	private static void method04() {
		// TODO Auto-generated method stub
		Calendar cal=Calendar.getInstance();
		int year=cal.get(Calendar.YEAR);
		System.out.println(year);
		
		//五年前
		cal.add(Calendar.YEAR, -5);
		int year2=cal.get(Calendar.YEAR);
		System.out.println(year2);
		
		//昨天
		cal.add(Calendar.DAY_OF_MONTH, -1);
		int day=cal.get(Calendar.DAY_OF_MONTH);
		System.out.println(day);
	}
	
	
	
	//getTime/setTime
	private static void method03() {
		// TODO Auto-generated method stub
		Calendar cal=Calendar.getInstance();
		
		//获取日历的毫秒值,从1970年
		Date time=cal.getTime();
		System.out.println(time.getTime());
		
		Date d=new Date(0);
		cal.setTime(d);//设置时间,将一个Date设置给Calendar对象,Calendar对应的时间也跟着改变
		System.out.println(cal);
	}

	//根据字段设置时间
	private static void method02() {
		// TODO Auto-generated method stub
		Calendar cal=Calendar.getInstance();
		
		//设置年
		cal.set(Calendar.YEAR, 2012);
		int year=cal.get(Calendar.YEAR);
		System.out.println(year);
		
		//设置月份
		cal.set(Calendar.MONTH, 11);
		int month=cal.get(Calendar.MONTH);
		System.out.println(month);//Calendar获取到的月份是从零开始的
	}

	//根据字段获取时间
	private static void method01() {
		// TODO Auto-generated method stub
		
		//获取日历
		Calendar cal=Calendar.getInstance();
		System.out.println(cal);
		
		//获取时间
		//年
		int year=cal.get(Calendar.YEAR);
		System.out.println(year);
		
		//月份
		int month=cal.get(Calendar.MONTH);
		System.out.println(month+1);//Calendar获取的月份从零开始
		
		//日
		int day=cal.get(Calendar.DAY_OF_MONTH);
		System.out.println(day);
		
		//小时
		int hour=cal.get(Calendar.HOUR_OF_DAY);
		System.out.println(hour);
		
		//分钟
		int min=cal.get(Calendar.MINUTE);
		System.out.println(min);
		
		//星期
		int week =cal.get(Calendar.WEEK_OF_MONTH);
		System.out.println(week);//从星期日开始算
	}

}


























































