package Day06;

import java.util.Arrays;
import java.util.Date;
import java.util.Map;
import java.util.Properties;
import java.util.Scanner;
/*
 * Sytem类包含一些有用的类字段和方法,它不能被实例化
 * 在System类提供的设施中,有标准输入,标准输出和错误输出流,对外部定义的属性和
 * 环境变量的访问,加载文件和库的方法;还有快速复制数组的一部分的使用方法
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
	//返回一个不能修改的当前系统环境的字符串映射视图。
	Map<String,String> env=System.getenv();
	System.out.println(env);

	//确定当前的系统属性。
	Properties properties = System.getProperties();
	System.out.println(properties);
}

//static long currentTimeMillis():返回以毫秒为单位的当前时间 。 
private static void method03() {
	// TODO Auto-generated method stub
	long millis=System.currentTimeMillis();
	System.out.println(millis);
	Date d = new Date();
	long time = d.getTime();
	System.out.println(time);
}

//复制数组
private static void method02() {
	// TODO Auto-generated method stub
	int[] arr={1,2,3,4,5,6};
	int[] dest=new int[5];
	
	//src:原数组
	//srcPos:从原数组的指定位置开始复制
	//dest:指定数组
	//destPos:复制的元素,放在目标数组的指定位置开始
	//length:复制多少个元素
	System.arraycopy(arr, 3, dest, 2, 3);
	System.out.println(Arrays.toString(dest));
}

private static void method01() {
	// TODO Auto-generated method stub
	//标准输出
	System.out.println("hi");
	//错误输出
	System.err.println("error");
	
	//标准输入
	Scanner sc=new Scanner(System.in);
}
}
