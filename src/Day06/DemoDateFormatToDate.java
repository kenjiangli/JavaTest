package Day06;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * 		ʱ���ַ���				DateFormatת��				Date����
 * 2012-12-21 14:28:00
 * 
 * ���ַ���תΪDate����
 * ʹ�ò���
 * 		����DateFormat����
 * 		ָ��ʱ��ĸ�ʽ
 * 		���ַ���תΪDate����
 */
public class DemoDateFormatToDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String time="2012-12-21 14:28:00";
		//����DateFormate ����
		//ָ��ʱ��ĸ�ʽ
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
		//���ַ���תΪDate����
		try {
			Date date=sdf.parse(time);
			System.out.println(date);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			System.out.println("ת��ʧ��");
		}
	}

}
