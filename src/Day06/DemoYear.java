package Day06;

import java.util.Calendar;
import java.util.Scanner;

/*
 * 输入年份,判断平年闰年
 */
public class DemoYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("输入年份");
		int year=sc.nextInt();
		method(year);

	}
	//将时间设置到3月1日,再向前一天,就是2月的最后一天
	private static void method(int year) {
		// TODO Auto-generated method stub
		
		Calendar cal=Calendar.getInstance();
		
//		//将日历调为year年
//		cal.set(Calendar.YEAR, year);
//		
//		//将日历调为3月
//		cal.set(Calendar.MONTH, 2);//月份从零开始
//		
//		//将日历调到1日
//		cal.set(Calendar.DAY_OF_MONTH, 1);
//		

		
		//一次性设置
		cal.set(year, 2, 1);
		//减一天到2月最后一天
		cal.add(Calendar.DAY_OF_MONTH,-1);
	
			int day=cal.get(Calendar.DAY_OF_MONTH);
			if(day==29){
				System.out.println(year+"是闰年");
			}else{
				System.out.println(year+"不是闰年");
			}

}



}






































































