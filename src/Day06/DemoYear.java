package Day06;

import java.util.Calendar;
import java.util.Scanner;

/*
 * �������,�ж�ƽ������
 */
public class DemoYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("�������");
		int year=sc.nextInt();
		method(year);

	}
	//��ʱ�����õ�3��1��,����ǰһ��,����2�µ����һ��
	private static void method(int year) {
		// TODO Auto-generated method stub
		
		Calendar cal=Calendar.getInstance();
		
//		//��������Ϊyear��
//		cal.set(Calendar.YEAR, year);
//		
//		//��������Ϊ3��
//		cal.set(Calendar.MONTH, 2);//�·ݴ��㿪ʼ
//		
//		//����������1��
//		cal.set(Calendar.DAY_OF_MONTH, 1);
//		

		
		//һ��������
		cal.set(year, 2, 1);
		//��һ�쵽2�����һ��
		cal.add(Calendar.DAY_OF_MONTH,-1);
	
			int day=cal.get(Calendar.DAY_OF_MONTH);
			if(day==29){
				System.out.println(year+"������");
			}else{
				System.out.println(year+"��������");
			}

}



}






































































