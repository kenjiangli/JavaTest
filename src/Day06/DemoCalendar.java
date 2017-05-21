package Day06;
/*
 * Calendar�Ĵ���
 * 		Calendar cal=Calendar.getInstance();
 * 
 * ��ͨ����:
 * abstract void add(int field,int amount):���������Ĺ���,Ϊ�����������ֶ���ӻ��ȥָ����ʱ����
 * int get(int field):���ظ��������ֶε�ֵ(��/��/��/ʱ/��/��)
 * void set(int field,int value):�������������ֶ�����Ϊ����ֵ
 * 
 *Date getTime();����һ����ʾ��Calendarʱ��ֵ(����Ԫ�����ڵĺ���ƫ����)��Date����,����ֵ����1970��
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
	
	//add,�ڵ�ǰʱ��Ļ�������Ӷ�Ӧ�ֶε�ʱ��,������ʾ���,������ʾ����
	private static void method04() {
		// TODO Auto-generated method stub
		Calendar cal=Calendar.getInstance();
		int year=cal.get(Calendar.YEAR);
		System.out.println(year);
		
		//����ǰ
		cal.add(Calendar.YEAR, -5);
		int year2=cal.get(Calendar.YEAR);
		System.out.println(year2);
		
		//����
		cal.add(Calendar.DAY_OF_MONTH, -1);
		int day=cal.get(Calendar.DAY_OF_MONTH);
		System.out.println(day);
	}
	
	
	
	//getTime/setTime
	private static void method03() {
		// TODO Auto-generated method stub
		Calendar cal=Calendar.getInstance();
		
		//��ȡ�����ĺ���ֵ,��1970��
		Date time=cal.getTime();
		System.out.println(time.getTime());
		
		Date d=new Date(0);
		cal.setTime(d);//����ʱ��,��һ��Date���ø�Calendar����,Calendar��Ӧ��ʱ��Ҳ���Ÿı�
		System.out.println(cal);
	}

	//�����ֶ�����ʱ��
	private static void method02() {
		// TODO Auto-generated method stub
		Calendar cal=Calendar.getInstance();
		
		//������
		cal.set(Calendar.YEAR, 2012);
		int year=cal.get(Calendar.YEAR);
		System.out.println(year);
		
		//�����·�
		cal.set(Calendar.MONTH, 11);
		int month=cal.get(Calendar.MONTH);
		System.out.println(month);//Calendar��ȡ�����·��Ǵ��㿪ʼ��
	}

	//�����ֶλ�ȡʱ��
	private static void method01() {
		// TODO Auto-generated method stub
		
		//��ȡ����
		Calendar cal=Calendar.getInstance();
		System.out.println(cal);
		
		//��ȡʱ��
		//��
		int year=cal.get(Calendar.YEAR);
		System.out.println(year);
		
		//�·�
		int month=cal.get(Calendar.MONTH);
		System.out.println(month+1);//Calendar��ȡ���·ݴ��㿪ʼ
		
		//��
		int day=cal.get(Calendar.DAY_OF_MONTH);
		System.out.println(day);
		
		//Сʱ
		int hour=cal.get(Calendar.HOUR_OF_DAY);
		System.out.println(hour);
		
		//����
		int min=cal.get(Calendar.MINUTE);
		System.out.println(min);
		
		//����
		int week =cal.get(Calendar.WEEK_OF_MONTH);
		System.out.println(week);//�������տ�ʼ��
	}

}


























































