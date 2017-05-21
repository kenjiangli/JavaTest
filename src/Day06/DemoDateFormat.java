package Day06;

import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * DateFormat���Խ�Date����ת�������ʽ���ַ���(����->�ı�)
 * 
 * 	Date����	                        DateFormat	                 �ַ���
 *  Thu May 04 09:55:37 CST 2017						2017��5��4�� 09:55:37
 *  
 *  DateFormat���Խ������ʽ���ַ���ת��Date����(�ı�->����)
 *  * 		�ַ���										Date����
 * 2017��5��4�� 09:55:37			DateFormat			Date����
 * 
 * DateFormatʹ����������
 * 1.����DateFormat����
 * 2.ָ����ʽ ,��ͨ�ַ�����д
 * 3.ת��Format����
 */
public class DemoDateFormat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date now=new Date();
		System.out.println(now);
		
		//����DateFormat��ʽ
		//ָ����ʽ,��ͨ�ַ�����Щ,��ʾʱ����ַ�ȥSimpleDateFormat�������
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy��MM��dd��  HH��mm��ss��");
		
		//ת��
		String dateString=sdf.format(now);
		System.out.println(dateString);
		
		
	}

}

























