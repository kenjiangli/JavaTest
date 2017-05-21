package Day06;

import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * DateFormat可以将Date对象转成特殊格式的字符串(日期->文本)
 * 
 * 	Date对象	                        DateFormat	                 字符串
 *  Thu May 04 09:55:37 CST 2017						2017年5月4日 09:55:37
 *  
 *  DateFormat可以将特殊格式的字符串转成Date对象(文本->日期)
 *  * 		字符串										Date对象
 * 2017年5月4日 09:55:37			DateFormat			Date对象
 * 
 * DateFormat使用三个步骤
 * 1.创建DateFormat对象
 * 2.指定格式 ,普通字符串照写
 * 3.转换Format方法
 */
public class DemoDateFormat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date now=new Date();
		System.out.println(now);
		
		//创建DateFormat格式
		//指定格式,普通字符串找些,表示时间的字符去SimpleDateFormat里面查找
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy年MM月dd日  HH点mm分ss秒");
		
		//转换
		String dateString=sdf.format(now);
		System.out.println(dateString);
		
		
	}

}

























