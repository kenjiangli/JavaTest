package Day06;
/*
 * ������������:4��8��
 * 
 * 	����
 * 		byte
 * 		short
 * 		int
 * 		long
 * 
 *  ������
 *  	float
 *  	double
 *  
 *  �ַ���
 *  	char
 *  
 *  ������
 *  	boolean
 * 
 * �����������͵Ĺ��ܸ��Ƿǳ����޵�,�Ӽ��˳�������
 * javaΪÿһ���������Ͷ��ṩ��һ����Ӧ��������,����ʵ���ַ������ַ���ת��
 * ÿ���������Ͷ��ж�Ӧ�İ�װ��
 * 
 * 
 * ���췽��
 * 	Interget(int value):��intֵתΪInteger����
 * Integer(Strings):��String��ֵתΪInteger����
 * 
 * * ��ͨ����
 * 
 *  int intValue(): �õ�Integer��Ӧ��intֵ�� 
 *  static int parseInt(String s):���ַ���ת��int
 *  
 *   String toString(): ��Integer�ڲ���intֵת��String
 *   static String toString(int i): ��ָ����intֵת���ַ���
 *   
 *   static Integer valueOf(int i):��intֵת��Integer���� 
 *	 static Integer valueOf(String s):��String��ֵת��Integer����
 */

public class DemoInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		//method01();
		//method02();
		//method03();
		//method04();
		//method05();
		method06();
	}
	
	//int->String
	private static void method06() {
		// TODO Auto-generated method stub
		int i=1;
		String s=i+"";
				System.out.println(s);
	}

	//����String->int
	private static void method05() {
		// TODO Auto-generated method stub
		int i=Integer.parseInt("123");
		System.out.println(i+1);
	}

	//Integer->int
	private static void method04() {
		// TODO Auto-generated method stub
		Integer i1=new Integer("31313");
		String s=i1.toString();
		System.out.println(s+1);
	}

	//Integer->int
	private static void method03() {
		// TODO Auto-generated method stub
		Integer i1=new Integer("213123");
		int i=i1.intValue();
		System.out.println(i-1);
	}

	//��StringתΪInteger
	private static void method02() {
		// TODO Auto-generated method stub
		Integer i1=new Integer("123");
		System.out.println(i1);
		//Integer i2=Integer.valueOf("a123");//�ַ���ת����һ��ע���ַ����б��붼�����ֲ���ת��
		Integer i2=Integer.valueOf("1123");
		System.out.println(i2);
	}

	//��int����תΪInteger����
	private static void method01() {
		// TODO Auto-generated method stub
		Integer i1=new Integer(110);
		System.out.println(i1);
		
		Integer i2=Integer.valueOf(111);
		System.out.println(i2);
	}

}
