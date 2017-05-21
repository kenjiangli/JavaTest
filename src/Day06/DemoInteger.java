package Day06;
/*
 * 基本数据类型:4类8种
 * 
 * 	整型
 * 		byte
 * 		short
 * 		int
 * 		long
 * 
 *  浮点型
 *  	float
 *  	double
 *  
 *  字符型
 *  	char
 *  
 *  布尔型
 *  	boolean
 * 
 * 基本数据类型的功能更是非常有限的,加减乘除的运算
 * java为每一种数据类型都提供了一个对应数据类型,可以实现字符串和字符的转换
 * 每中数据类型都有对应的包装类
 * 
 * 
 * 构造方法
 * 	Interget(int value):将int值转为Integer对象
 * Integer(Strings):将String的值转为Integer对象
 * 
 * * 普通方法
 * 
 *  int intValue(): 拿到Integer对应的int值。 
 *  static int parseInt(String s):将字符串转成int
 *  
 *   String toString(): 将Integer内部的int值转成String
 *   static String toString(int i): 将指定的int值转成字符串
 *   
 *   static Integer valueOf(int i):将int值转成Integer对象 
 *	 static Integer valueOf(String s):将String的值转成Integer对象
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

	//常用String->int
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

	//将String转为Integer
	private static void method02() {
		// TODO Auto-generated method stub
		Integer i1=new Integer("123");
		System.out.println(i1);
		//Integer i2=Integer.valueOf("a123");//字符串转数字一定注意字符串中必须都是数字才能转换
		Integer i2=Integer.valueOf("1123");
		System.out.println(i2);
	}

	//把int类型转为Integer类型
	private static void method01() {
		// TODO Auto-generated method stub
		Integer i1=new Integer(110);
		System.out.println(i1);
		
		Integer i2=Integer.valueOf(111);
		System.out.println(i2);
	}

}
