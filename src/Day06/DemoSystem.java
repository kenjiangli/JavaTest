package Day06;

import java.util.Arrays;
import java.util.Date;
import java.util.Map;
import java.util.Properties;
import java.util.Scanner;
/*
 * Sytem�����һЩ���õ����ֶκͷ���,�����ܱ�ʵ����
 * ��System���ṩ����ʩ��,�б�׼����,��׼����ʹ��������,���ⲿ��������Ժ�
 * ���������ķ���,�����ļ��Ϳ�ķ���;���п��ٸ��������һ���ֵ�ʹ�÷���
 */
public class DemoSystem {
public static void main(String[] args) {
	//method01();
	//method02();
	//method03();
	method04();
}


private static void method04() {
	// TODO Auto-generated method stub
	//����һ�������޸ĵĵ�ǰϵͳ�������ַ���ӳ����ͼ��
	Map<String,String> env=System.getenv();
	System.out.println(env);

	//ȷ����ǰ��ϵͳ���ԡ�
	Properties properties = System.getProperties();
	System.out.println(properties);
}

//static long currentTimeMillis():�����Ժ���Ϊ��λ�ĵ�ǰʱ�� �� 
private static void method03() {
	// TODO Auto-generated method stub
	long millis=System.currentTimeMillis();
	System.out.println(millis);
	Date d = new Date();
	long time = d.getTime();
	System.out.println(time);
}

//��������
private static void method02() {
	// TODO Auto-generated method stub
	int[] arr={1,2,3,4,5,6};
	int[] dest=new int[5];
	
	//src:ԭ����
	//srcPos:��ԭ�����ָ��λ�ÿ�ʼ����
	//dest:ָ������
	//destPos:���Ƶ�Ԫ��,����Ŀ�������ָ��λ�ÿ�ʼ
	//length:���ƶ��ٸ�Ԫ��
	System.arraycopy(arr, 3, dest, 2, 3);
	System.out.println(Arrays.toString(dest));
}

private static void method01() {
	// TODO Auto-generated method stub
	//��׼���
	System.out.println("hi");
	//�������
	System.err.println("error");
	
	//��׼����
	Scanner sc=new Scanner(System.in);
}
}
