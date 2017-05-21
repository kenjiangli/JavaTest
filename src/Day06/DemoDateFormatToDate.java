package Day06;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * 		时间字符串				DateFormat转换				Date对象
 * 2012-12-21 14:28:00
 * 
 * 将字符串转为Date对象
 * 使用步骤
 * 		创建DateFormat对象
 * 		指定时间的格式
 * 		将字符串转为Date对象
 */
public class DemoDateFormatToDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String time="2012-12-21 14:28:00";
		//创建DateFormate 对象
		//指定时间的格式
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
		//将字符串转为Date对象
		try {
			Date date=sdf.parse(time);
			System.out.println(date);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			System.out.println("转换失败");
		}
	}

}
