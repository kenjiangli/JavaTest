package Day06;

import java.util.Date;

/*
 * ��Date ��ʾ�ض���˲��,��ȷ������
 * 
 * ���췽��:
 * Date():����Date���������ʱ��(��ȷ������)
 * 
 *Date(long time):����Date���󲢳�ʼ���˶���,�Ա�ʾ�Դӱ�׼��׼
 *ʱ��(��Ϊ"��Ԫ(epoch)"),��1970��1��1�� 00:00:00 GMT��������ָ����������
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
		
		//��λ�Ǻ���
		System.out.println(d);
		Date d2=new Date(1000);//��1970 1��1��00:00:00�����ϼ��ϲ���date�ĺ���ֵ
		System.out.println(d2);
		
	}

	private static void method01() {
		// TODO Auto-generated method stub
		Date d1=new Date();
		System.out.println(d1);
		long time =d1.getTime();//��ȡ����ֵ,��1970�꿪ʼ��d1ʱ��ĺ���ֵ
		System.out.println(time);
		d1.setTime(0);//ͨ��setTime����һ������ֵ���޸�date��ʱ��
		System.out.println(d1);
	}

}
